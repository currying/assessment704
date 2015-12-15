<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@page pageEncoding="UTF-8"%>
<%@include file="/nui/common.jsp"%>
<link id="css_skin" rel="stylesheet" type="text/css" 
	  href="<%=contextPath%>/coframe/tools/skins/skin1/style.css" />
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>系统界面 OutlookTree</title>
    <link href="../demo.css" rel="stylesheet" type="text/css" />
    <style type="text/css">
    body{
        margin:0;padding:0;border:0;width:100%;height:100%;overflow:hidden;
    }
    .header
    {
        background:url(../header.gif) repeat-x 0 -1px;
    }
    </style>
    
    <script type="text/javascript" src="/Assessment/eos/assessment/DataMaintain.js">
    </script>
</head>
<body>
    
<!--Layout-->
<div class="nui-splitter" style="width:100%;height:100%;">

	<!-- 左侧考核对象与考核任务面板 -->
    <div size="250px" showCollapseButton="true">
    	<!-- 考核对象与考核任务维护工具条  -->
    	<div class="nui-toolbar" style="padding:2px;border-top:0;border-left:0;border-right:0;">
            <a class="nui-button" iconCls="icon-add" plain="true" onclick="addObject()"></a> <!-- 新建 -->
            <a class="nui-button" iconCls="icon-add" plain="true" onclick="addTask()"></a>
            <a class="nui-button" iconCls="icon-add" plain="true" onclick="expandAll()" />
            <a class="nui-button" iconCls="icon-edit" plain="true"></a> <!-- 修改  -->
            <a class="nui-button" iconCls="icon-remove" plain="true" onclick="remove()"></a> <!-- 删除  -->
            <a class="nui-button" iconCls="icon-search" plain="true"></a> <!-- 查找  -->
        </div>
        
        <!-- 考核对象与考核任务  --> 
        <div class="nui-fit">
            <ul id="taskTree" class="nui-tree" style="width:100%; height:100%"
                showTreeIcon="true" textField="name" idField="id" parentField="pid" resultAsTree="true" 
				selectOnLoad="true"
                url="com.jzsoft.eos.assessment.AssessmentTaskTree.loadData.biz.ext"
                
                onBeforeLoad="onTaskTreeBeforeLoad"
                onPreLoad="onTaskTreePreLoad" 
                onDrawNode="onTaskTreeDrawNode" 
                onBeforeNodeSelect="onTaskTreeBeforeNodeSelect"
                onNodeSelect="onTaskTreeNodeSelect">
            </ul>
        </div>
        <div class="nui-toolbar"
	style="padding:2px;border-top:0;border-left:0;border-right:0;"> <span
	style="padding-left:5px;">名称：</span> <input id="key"
	class="nui-textbox" onenter="onKeyEnter" /> <a class="nui-button"
	iconCls="icon-search" plain="true" onclick="search()">查找</a> </div>
    </div>
    <!-- 右侧考核对象与考核任务数据维护界面 -->
    <div title="center" region="center">
		<iframe id="contentFrame" style="width:100%;height:100%;border:0px"></iframe>
    </div>
</div>

<script type="text/javascript">
	nui.parse();
	var itemTree = nui.get("taskTree");
		function search() {
			var key = nui.get("key").getValue();
			if (key == "") {
				itemTree.clearFilter();
			} else {
				itemTree.filter(function(node) {
					var text = node.name ? node.name : "";
					if (text.indexOf(key) != -1) {
						return true;
					}
				});
			}
		}
		//删除
		function remove() {
			var rows = itemTree.getSelecteds();
			if (rows.length > 0) {
				nui
						.confirm(
								"确定删除选中记录？",
								"系统提示",
								function(action) {
									if (action == "ok") {
										var json, url_source;
										if (rows[0].type == "object") {
											json = nui.encode({
												assessmentObjects : rows
											});
											url_source = "com.jzsoft.eos.assessment.AssessmentObjectBiz.deleteAssessmentObjectsBiz.biz.ext";

										} else {
											json = nui.encode({
												assessmentTasks : rows
											});
											url_source = "com.jzsoft.eos.assessment.AssessmentTaskTree.deleteAssessmentTasksBiz.biz.ext";
										}
										itemTree.loading("正在删除中,请稍等...");
										$
												.ajax({
													url : url_source,
													type : 'POST',
													data : json,
													cache : false,
													contentType : 'text/json',
													success : function(text) {
														var returnJson = nui
																.decode(text);
														if (returnJson.exception == null) {
															itemTree.reload();
															nui
																	.alert(
																			"删除成功",
																			"系统提示",
																			function(
																					action) {
																			});
														} else {
															itemTree.unmask();
															nui.alert("删除失败",
																	"系统提示");
														}
													}
												});
									}

								});
			} else {
				nui.alert("请选中一条记录！");
			}
		}
		function onKeyEnter(e) {
			search();
		}
		//新增Object
		function expandAll() {
			var tree = nui.get("taskTree");
			tree.expandAll();
		}
		function addObject() {
			nui.open({
				url : "AssessmentObjectForm.jsp",
				title : "新增记录",
				width : 600,
				height : 300,
				onload : function() {//弹出页面加载完成
					var iframe = this.getIFrameEl();
					var data = {
						pageType : "add"
					};//传入页面的json数据
					iframe.contentWindow.setFormData(data);
				},
				ondestroy : function(action) {//弹出页面关闭前
					if (action != "cancel")
						itemTree.reload();
				}
			});
		}
		function addTask() {
			nui.open({
				url : "AssessmentTaskForm.jsp",
				title : "新增记录",
				width : 600,
				height : 300,
				onload : function() {//弹出页面加载完成
					var iframe = this.getIFrameEl();
					var data = {
						pageType : "add"
					};//传入页面的json数据
					iframe.contentWindow.setFormData(data);
				},
				ondestroy : function(action) {//弹出页面关闭前
					if (action != "cancel")
						itemTree.reload();
				}
			});
		}
		function onTaskSort(data) {
			for (var i = 0; i < data.length; i++) {
				if (data[i].tasks != undefined)
					data[i].tasks.sort(function(a, b) {
						if (a.number < b.number)
							return -1;
						if (a.number > b.number)
							return 1;
						return 0;
					});
			}
			return data;
		}
	function onTaskTreeBeforeLoad(event) {
		var tree = event.sender;
		var node = event.node;
		
		if (tree.getLevel(node) == -1) {
			event.params.isRoot = true;
			tree.setDataField("objects");
		} else {
			event.params.objectId = node.id;
			event.params.isRoot = false;
			tree.setDataField("tasks");
		}
	}
	
	function onTaskTreePreLoad(event) {
		if (event.result.isObjects) {
			event.data.forEach(function(object) {
				object.isLeaf = false;
				object.expanded = false;
				object.nodeType = "object";
			});
			
		} else {
			event.data.forEach(function(task) {
				task.nodeType = "task";
			});
		}
	}
	
	function onTaskTreeDrawNode(event) {
		var node = event.node;

		if (node.nodeType == "object") {
			if (node.children != undefined) {
				event.nodeHtml = "<span>" + node.number + " - " + node.name + "</span>" + 
					"<span style='font-weight:bold;color:red'>&nbsp(" + node.children.length + ")</span>";
			} else {
				event.nodeHtml = "<span>" + node.number + " - " + node.name + "</span>";
			}
		} else if (node.nodeType == "task") {
			event.nodeHtml = "<span>" + node.number + " - " + node.title + "</span>";
		}
	}
	
	function onTaskTreeBeforeNodeSelect(event) {
		var frame = $("#contentFrame");
		
		if (frame[0].contentWindow.closeFrameQuery != undefined) {
			if (frame[0].contentWindow.closeFrameQuery() == false) {
				event.cancel = true;
			}
		}
	}
	
	function onTaskTreeNodeSelect(event) {
		var frame = $("#contentFrame");
		var tree = event.sender;
		var node = event.node;
		var params = new Object();
		
		if (node.nodeType == "object") {
			params.objectId = node.id;
		
			frame[0].onload = function() {
				if (frame[0].contentWindow.openFrame != undefined) {
					frame[0].contentWindow.openFrame(params);
				}
			};
			frame.attr("src", "AssessmentTask.jsp");
		} else if (node.nodeType == "task"){
			params.objectId = tree.getParentNode(node).id;
			params.taskId = node.id;
			
			frame[0].onload = function() {
				if (frame[0].contentWindow.openFrame != undefined) {
					frame[0].contentWindow.openFrame(params);
				}
			};
			frame.attr("src", "AssessmentItem.jsp");
		}
	}
</script>

</body>
</html>
