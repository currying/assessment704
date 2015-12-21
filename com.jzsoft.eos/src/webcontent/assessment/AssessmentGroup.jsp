<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" session="false"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<!-- 
  - Author(s): LUCHAO
  - Date: 2015-12-07 15:01:42
  - Description:
-->
<head>
<title>Title</title>
<meta http-equiv="content-type" content="text/html; charset=UTF-8" />
<script src="<%=request.getContextPath()%>/common/nui/nui.js"
	type="text/javascript"></script>

<style type="text/css">
html,body {
	margin: 0;
	padding: 0;
	border: 0;
	width: 100%;
	height: 100%;
	overflow: hidden;
}
</style>

</head>
<body>
	<div class="nui-splitter"
		style="width:100%; height:100%" borderStyle="border:0">
		<div size="280px">
			<div class="nui-toolbar my-toolbar"
				style="padding:2px; border-top:0; border-left:0; border-right:0">

				<a id="filterButton" class="nui-button" iconCls="icon-search"
					plain="true"></a>

			</div>

			<div class="nui-fit" style="padding-top: 2px;">
				<div id="groupTree" class="nui-tree"
					style="width: 100%; height: 100%;" showTreeIcon="true" dataField="groups"
					textField="name" idField="id" resultAsTree="false"
					selectOnLoad="true" autoLoad="false" showTreeLines="false"
					url="com.jzsoft.eos.assessment.AssessmentGroup.loadData.biz.ext"
					
					onBeforeLoad="onGroupTreeBeforeLoad" onPreLoad="onGroupTreePreLoad"
					onNodeSelect="onGroupTreeNodeSelect">
				</div>
			</div>
		</div>

		<div>
			<div class="nui-toolbar my-toolbar"
				style="padding: 2px; border-top: 0; border-left: 0; border-right: 0">

				<a class="nui-button" iconCls="icon-reload" plain="true"
					onClick="onRefreshButtonClick">重新加载</a> <span class="separator"></span>
				<a class="nui-button" iconCls="icon-addfolder" plain="true"
					onclick="onAddButtonClick">增加</a> <a class="nui-button"
					iconCls="icon-remove" plain="true" onclick="onDeleteButtonClick">删除</a>
				<a class="nui-button" iconCls="icon-save" plain="true"
					onclick="onSaveButtonClick">保存</a> <span class="separator"></span>
				<a class="nui-button" iconCls="icon-close" plain="true"
					onclick="onSaveButtonClick">退出</a>

			</div>

			<div class="nui-fit">
				<div id="groupDataGrid" class="nui-datagrid"
					style="width: 100%; height: 100%" borderStyle="border:0"
					idField="id" dataField="groups" autoLoad="false" multiSelect="true"
					selectOnLoad="true" showModified="true" fitColumns="true"
					allowCellEdit="true" allowCellSelect="true"
					url="com.jzsoft.eos.assessment.AssessmentGroup.loadData.biz.ext">

					<div property="columns">
						<div type="indexcolumn" width="30" headerAlign="center">行号</div>
						<div type="checkcolumn" width="30"></div>
						<div field="name" width="60" headerAlign="center">
							名称<input property="editor" class="nui-textbox"
								style="width: 100%;"></input>
						</div>
						<div field="isUser" width="30" headerAlign="center">标志</div>
						<div field="email" width="80" headerAlign="center">
							电子邮件 <input property="editor" class="nui-textbox"
								style="width: 100%;"></input>
						</div>
						<div field="status" width="30" headerAlign="center">状态</div>
						<div field="accessCode" width="60" headerAlign="center">访问码</div>
					</div>
				</div>
			</div>
		</div>
	</div>

	<script type="text/javascript">
		// Global Variables
		nui.parse();

		var initParams;
		var groupTree = nui.get("groupTree");
		var groupDataGrid = nui.get("groupDataGrid");

		// Global function
		function openFrame(params) {
			initParams = params;
			initGroupTree();
		}

		function closeFrameQuery() {
			return true;
		}

		// Group Tree
		function initGroupTree() {
			var node = new Object();
			node.nodeType = "root";
			node.name = "考评组";
			node.isLeaf = false;
			groupTree.addNode(node, -1, groupTree.getRootNode());

			// auto load all objects
			groupTree.loadNode(node);
			groupTree.selectNode(node);
		}

		function onGroupTreeBeforeLoad(event) {
			var tree = event.sender;
			var node = event.node;

			if (tree.getLevel(node) == 0) {
				event.params.id = initParams.taskId;
				event.params.isRoot = true;
			} else {
				event.params.id = node.id;
				event.params.isRoot = false;
			}
		}

		function onGroupTreePreLoad(event) {
			var data = event.data;
			data.forEach(function(group) {
				group.isLeaf = false;
				group.expanded = false;
			});
		}
		
		function onGroupTreeNodeSelect(event) {
			var tree = event.sender;
			var node = event.node;
			
			if (tree.getLevel(node) == 0) {
				groupDataGrid.load({isRoot: true, id: initParams.taskId});
			} else {
				groupDataGrid.load({isRoot: false, id: node.id});
			}
		}
		
		// Group data grid
		function onRefreshButtonClick(event) {
			var changes = groupDataGrid.getChanges();
			if (changes.length > 0) {
				nui
						.confirm(
								"<div style='text-align:left'>页面数据发生变化，是否刷新？<br/>选择“确定”，重新加载数据；选择“取消”，不重新加载数据。</div>",
								"提示", function(messageId) {
									if (messageId == "ok")
										groupDataGrid.reload();
								});
			} else {
				groupDataGrid.reload();
			}
		}
		
		function onAddButtonClick(event) {
			var row = new Object();
			row.task = new Object();
			row.task.id = initParams.taskId;
			
			var node = groupTree.getSelectedNode();
			if (node.id != undefined) {
				row.parent = new Object;
				row.parent.id = node.id;
			}
			
			groupDataGrid.addRow(row, 0);
		}
		
		function onDeleteButtonClick(event) {
			var rows = groupDataGrid.getSelecteds();
			if (rows.length > 0) {
				nui
						.confirm(
								"<div style='text-align:left'>您确认删除被选择的"
										+ "<span style='color:red; font-size:18px; font-weight:bold'>&nbsp"
										+ rows.length
										+ "&nbsp</span>"
										+ "条记录吗？<br/>选择“确定”，删除；选择“取消”，不删除。</div>",
								"提示", function(messageId) {
									if (messageId == "ok")
										groupDataGrid.removeRows(rows, true);
								});
			}
		}
		
		function onSaveButtonClick(event) {
			saveData();
		}
		
		function saveData() {
			var changes = groupDataGrid.getChanges();
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

			groupDataGrid.loading("保存中，请稍后......");
			nui
					.ajax({
						url : "com.jzsoft.eos.assessment.AssessmentGroup.saveData.biz.ext",
						type : 'POST',
						data : nui.encode({
							created : created,
							deleted : deleted,
							updated : updated
						}),
						success : function(result) {
							if (result.exception) {
								groupDataGrid.unmask();
								nui.open({
									url : "Error.jsp",
									title : "数据保存失败",
									width : 600,
									height : 360,
									allowResize : false,
									showShadow : true,
									onload : function() {
										var iframe = this.getIFrameEl();
										iframe.contentWindow.init(
												result.exception, function() {
													groupDataGrid.reload();
												});
									}
								});
							} else {
								//
								groupDataGrid.reload();
							}
						},
						error : function(jqXHR, textStatus, errorThrown) {
							alert(jqXHR.responseText);
						}
					});
		}
	</script>
</body>
</html>