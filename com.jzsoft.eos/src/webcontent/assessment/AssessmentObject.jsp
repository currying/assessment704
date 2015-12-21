<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" session="false" %>
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<!-- 
  - Author(s): LUCHAO
  - Date: 2015-12-16 10:43:44
  - Description:
-->
<head>
<title>Title</title>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8" />
    <script src="<%= request.getContextPath() %>/common/nui/nui.js" type="text/javascript"></script>
    
    <style type="text/css">
    html, body{
        margin:0;padding:0;border:0;width:100%;height:100%;overflow:hidden;
    }    
    </style>
    
</head>
<body>
	
	<div class="nui-toolbar" style="padding:2px;border-top:0;border-left:0;border-right:0;">
		<a class="nui-button" iconCls="icon-reload" plain="true"
			onClick="onRefreshButtonClick">重新加载</a>
		<span class="separator"></span>
		<a class="nui-button" iconCls="icon-addfolder" plain="true"
			onclick="onAddButtonClick">增加</a>
		<a class="nui-button" iconCls="icon-remove" plain="true"
			onclick="onDeleteButtonClick">删除</a>
		<a class="nui-button" iconCls="icon-save" plain="true"
			onclick="onSaveButtonClick">保存</a>
		<span class="separator"></span>
		<input id="filterText" class="nui-textbox" emptyText="请输入过滤条件..." />
    </div>
    
	<div class="nui-fit">
		<div id="objectDataGrid" class="nui-datagrid" style="width:100%; height:100%" borderStyle="border:0"
			idField="id" dataField="objects" autoLoad="true" multiSelect="true" selectOnLoad="true"
			showModified="true" fitColumns="true" allowCellEdit="true" allowCellSelect="true"
			url="com.jzsoft.eos.assessment.AssessmentObject.loadData.biz.ext">
			
			<div property="columns">
		        <div type="indexcolumn" headerAlign="center" width="30px">行号</div>
		        <div type="checkcolumn" width="30px"></div>
		        <div field="number" width="120px" headerAlign="center">对象编号
		        	<input property="editor" class="nui-textbox" style="width:100%;" />
		        </div>    
		        <div field="name" width="120px" headerAlign="center">对象名称
		        	<input property="editor" class="nui-textbox" style="width:100%;" />
		        </div>
		        <div name="description" width="720px" field="description" headerAlign="center">对象描述
		        	<input property="editor" class="nui-textbox" style="width:100%;" />
		        </div>
		    </div>
		</div>
	</div>


	<script type="text/javascript">
    	nui.parse();
	
		var objectDataGrid = nui.get("objectDataGrid");
	
		// Global
		function openFrame(initParams) {
    	}
    	
    	function closeFrameQuery() {
    		if (objectDataGrid.getChanges().length > 0) {
    			var isOk = confirm("页面数据发生变化，是否需要保存？");
    			if (isOk == true) return false;
    		}
    		
    		return true;
    	}
    	
    	// Toolbar button's event
    	
    	function onRefreshButtonClick(event) {
    		var changes = objectDataGrid.getChanges();
    		if (changes.length > 0) {
    			nui.confirm("<div style='text-align:left'>页面数据发生变化，是否刷新？<br/>选择“确定”，重新加载数据；选择“取消”，不重新加载数据。</div>", "提示", 
    				function(messageId) {
    					if (messageId == "ok")
    						objectDataGrid.reload();
    				});
    		} else {
    			objectDataGrid.reload();
    		}
    	}
    	
    	function onAddButtonClick(event) {
    		var row = new Object();
    		objectDataGrid.addRow(row, 0);
    	}
    	
    	function onDeleteButtonClick(event) {
    		var rows = objectDataGrid.getSelecteds();
    		if (rows.length > 0) {
    			nui.confirm("<div style='text-align:left'>您确认删除被选择的" +
    				"<span style='color:red; font-size:18px; font-weight:bold'>&nbsp" + rows.length + "&nbsp</span>" +
    				"条记录吗？<br/>选择“确定”，删除；选择“取消”，不删除。</div>", "提示", 
    				function(messageId) {
    					if (messageId == "ok")
    						objectDataGrid.removeRows(rows, true);
    				});
    		}
    	}
    	
    	nui.get("filterText").on("valuechanged", function(event) {
			var text = event.value ? event.value : "";
			
			if (text == "") {
				objectDataGrid.clearFilter();
			} else {
				objectDataGrid.filter(function(row) {
					// alert(text);
					var	name = row.name ? row.name : "";
					var description = row.description ? row.description : "";
					
					return ((name.indexOf(text) != -1) || (description.indexOf(text) != -1));
				});
			}

			return true;
		});
    	
    	function onSaveButtonClick(event) {
            saveData();
    	}
    	
    	// Global function
    	function saveData() {
    		var changes = objectDataGrid.getChanges();
    		if (changes.length == 0)
    			return;
    		
    		var created = new Array();
    		var deleted = new Array();
    		var updated = new Array();
    		
    		changes.forEach(function(row) {
    			if (row._state == "added") {
    				created.push(row);
    			} else if (row._state == "removed") {
    				deleted.push(row);
    			} else if (row._state == "modified") {
    				updated.push(row);
    			}
    		});
    		
    		objectDataGrid.loading("保存中，请稍后......");
            nui.ajax({
                url: "com.jzsoft.eos.assessment.AssessmentObject.saveData.biz.ext",
                type: 'POST',
                data: nui.encode({
                	created: created,
                	deleted: deleted,
                	updated: updated
                }),
                success: function (result) {
                	if (result.exception) {
                		objectDataGrid.unmask();
                		nui.open({
							url : "Error.jsp",
							title : "数据保存失败",
							width : 600,
							height : 360,
							allowResize : false,
							showShadow : true,
							onload : function() {
								var iframe = this.getIFrameEl();
								iframe.contentWindow.init(result.exception, function() {
									objectDataGrid.reload();
								});
							}
						});
                	} else {
                		if (window.parent && window.parent.refresh) {
	                		window.parent.refresh();
	                	}
	                	
	                	objectDataGrid.reload();
                	}
                },
                error: function (jqXHR, textStatus, errorThrown) {
                    alert(jqXHR.responseText);
                }
            });
    	}
    </script>
</body>
</html>
