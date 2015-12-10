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
            <a class="nui-button" iconCls="icon-add" plain="true"></a> <!-- 新建 -->
            <a class="nui-button" iconCls="icon-edit" plain="true"></a> <!-- 修改  -->
            <a class="nui-button" iconCls="icon-remove" plain="true"></a> <!-- 删除  -->
            <a class="nui-button" iconCls="icon-search" plain="true"></a> <!-- 查找  -->
        </div>
        
        <!-- 考核对象与考核任务  --> 
        <div class="nui-fit">
            <ul id="taskTree" class="nui-tree" style="width:100%;"
                showTreeIcon="true" textField="name" idField="id" parentField="pid" resultAsTree="true" 
                dataField="objects" onPreLoad="onTaskTreePreLoad" onDrawNode="onTaskTreeDrawNode" 
                onNodeSelect="onTaskTreeNodeSelect"
                url="com.jzsoft.eos.assessment.AssessmentTaskTree.loadData.biz.ext">
            </ul>
        </div>
        
        <!-- 考核对象与考核任务查找工具条  -->
        <div class="nui-toolbar" style="padding:2px;border-top:0;border-left:0;border-right:0;">                
            <span style="padding-left:5px;">名称：</span>
            <input class="nui-textbox" />
            <a class="nui-button" iconCls="icon-search" plain="true">查找</a>                  
        </div>
    </div>

    <!-- 右侧考核对象与考核任务数据维护界面 -->
    <div title="center" region="center">
    	<div id="itemAndGroupTabs" class="nui-tabs" activeIndex="0" style="width:100%;height:100%;" 
    		bodyStyle="padding:0;border:0;" tabPosition="bottom">
			<div title="考核指标" url="AssessmentItem.jsp"></div>
			<div title="考核体系" url="AssessmentItem.jsp"></div>
		</div>
    </div>
</div>

<script type="text/javascript">
	nui.parse();
	
	function onTaskTreePreLoad(event) {
		var newData = new Array();

		var object, task;
		
		for (var i = 0; i < event.data.length; i ++) {
			object = new Object;
			object.id = event.data[i].id;
			object.type = "object";
			object.name = event.data[i].number + "-" + event.data[i].name;
			object.iconCls = "icon-folder";
			object.children = new Array();
			
			if (event.data[i].tasks != undefined) {	
				for (var j = 0; j < event.data[i].tasks.length; j ++) {
					task = new Object;
					task.id = event.data[i].tasks[j].id;
					task.type = "task";
					task.name = event.data[i].tasks[j].number + "-" + event.data[i].tasks[j].title;
					
					object.children.push(task);
				}
			}
			
			newData.push(object);
		}

		event.data = newData;
	}
	
	function onTaskTreeDrawNode(event) {
		var node = event.node;
		if (node.type == "object" && node.children.length != 0) {
			event.nodeHtml = "<span>" + node.name + "</span>" + 
				"<span style='font-weight:bold;color:red'>&nbsp(" + node.children.length + ")</span>";
		}
	}
	
	function onTaskTreeNodeSelect(event) {
		var node = event.node;
		loadRelativeData(node)
	}
	
	function loadRelativeData(node) {
		getItemFrame().contentWindow.loadData(node);
		getGroupFrame().contentWindow.loadData(node);
	}
	
	function getItemFrame() {
		var tabs = nui.get("itemAndGroupTabs");
		var tab = tabs.getTab(0);
		return tabs.getTabIFrameEl(tab);
	}
	
	function getGroupFrame() {
		var tabs = nui.get("itemAndGroupTabs");
		var tab = tabs.getTab(1);
		return tabs.getTabIFrameEl(tab);
	}
</script>

</body>
</html>
