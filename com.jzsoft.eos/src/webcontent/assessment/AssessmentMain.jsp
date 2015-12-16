<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@page pageEncoding="UTF-8"%>
<%@include file="/nui/common.jsp"%>
<link id="css_skin" rel="stylesheet" type="text/css" 
	  href="<%=contextPath%>/coframe/tools/skins/skin1/style.css" />
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>考核数据维护</title>
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
</head>
<body>
    
<!--Layout-->
<div class="nui-splitter" style="width:100%;height:100%;">

	<!-- 左侧考核对象与考核任务面板 -->
    <div size="280px" showCollapseButton="true">
    	<!-- 考核对象与考核任务维护工具条  -->
    	<div class="nui-toolbar" style="padding:2px;border-top:0;border-left:0;border-right:0;">
    	    <table style="width:100%">
            	<tr>
            		<td width="40px" align="right">名称：</td>
            		<td>
            			<input id="searchText" class="nui-textbox" style="width:100%" emptyText="请输入名称..."></input>
					</td>
            	</tr>
            </table>
        </div>
        
        <!-- 考核对象与考核任务  -->
        <div class="nui-fit">
            <ul id="navTree" class="nui-tree" style="width:100%; height:100%"
                showTreeIcon="true" textField="name" idField="id" parentField="pid" resultAsTree="true" 
				selectOnLoad="true" autoLoad="false" showTreeLines="false"
				
                url="com.jzsoft.eos.assessment.AssessmentNavTree.loadData.biz.ext"
                
                onBeforeLoad="onNavTreeBeforeLoad"
                onPreLoad="onNavTreePreLoad"
                onDrawNode="onNavTreeDrawNode" 
                onBeforeNodeSelect="onNavTreeBeforeNodeSelect"
                onNodeSelect="onNavTreeNodeSelect">
            </ul>
        </div>
    </div>
    
    <!-- 右侧考核对象与考核任务数据维护界面 -->
    <div title="center" region="center">
		<iframe id="contentFrame" style="width:100%;height:100%;border:0px"></iframe>
    </div>
</div>

<script type="text/javascript">
	nui.parse();
	
	// Navigator Tree
	var navTree = nui.get("navTree");
	
	// Navigator Tree Events
	function onNavTreeBeforeLoad(event) {
		var tree = event.sender;
		var node = event.node;
		
		if (node.nodeType == "root") {
			event.params.isRoot = true;
			tree.setDataField("objects");
		} else if (node.nodeType == "object") {
			event.params.objectId = node.id;
			event.params.isRoot = false;
			tree.setDataField("tasks");
		}
	}
	
	function onNavTreePreLoad(event) {
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
	
	function onNavTreeDrawNode(event) {
		var node = event.node;

		if (node.nodeType == "root") {
			event.nodeHtml = "<span style='font-weight:bold'>" + node.name + "</span>";
		} else if (node.nodeType == "object") {
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
	
	function onNavTreeBeforeNodeSelect(event) {
		var frame = $("#contentFrame");
		
		if (frame[0].contentWindow.closeFrameQuery != undefined) {
			if (frame[0].contentWindow.closeFrameQuery() == false) {
				event.cancel = true;
			}
		}
	}
	
	function onNavTreeNodeSelect(event) {
		var frame = $("#contentFrame");
		var tree = event.sender;
		var node = event.node;
		var params = new Object();
		
		frame[0].onload = function() {
			if (frame[0].contentWindow.openFrame != undefined) {
				frame[0].contentWindow.openFrame(params);
			}
		};
		if (node.nodeType == "root") {
			frame.attr("src", "AssessmentObject.jsp");
		} else if (node.nodeType == "object") {
			params.objectId = node.id;
			frame.attr("src", "AssessmentTask.jsp");
		} else if (node.nodeType == "task"){
			params.objectId = tree.getParentNode(node).id;
			params.taskId = node.id;
			frame.attr("src", "AssessmentItem.jsp");
		}
	}
	
	// Toolbar Buttons Event
	nui.get("searchText").on("valuechanged", function(event) {
		// var text = event.text;//
		// console.log(event);
		var text = event.value ? event.value : "";
		filterNavTree(text);
	});
	
	// Global Function
	function getNavTree() {
		return navTree;
	}
	
	function filterNavTree(text) {
		if (text == "") {
			navTree.clearFilter();
		} else {
			navTree.filter(function(node) {
				var name;
				if (node.nodeType == "root") {
					return true;
				} else if (node.nodeType == "object") {
					name = node.name ? node.name : "";
				} else {
					name = node.title ? node.title : "";
				}
				
				return (name.indexOf(text) != -1);
			});
		}
	}
	
	function initNavTree() {
		var node = new Object();
		node.nodeType = "root";
		node.name = "考核对象与任务";
		node.isLeaf = false;
		navTree.addNode(node, -1, navTree.getRootNode());
		
		// auto load all objects
		navTree.loadNode(node);
		navTree.selectNode(node);
	}
	
	// Main
	initNavTree();
</script>

</body>
</html>
