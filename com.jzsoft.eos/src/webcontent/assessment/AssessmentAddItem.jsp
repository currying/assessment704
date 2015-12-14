<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" session="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<!-- 
  - Author(s): LUCHAO
  - Date: 2015-12-11 09:25:09
  - Description:
-->
<head>
<title>增加指标</title>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8" />
    <script src="<%= request.getContextPath() %>/common/nui/nui.js" type="text/javascript"></script>
    
    <style type="text/css">
    html,body {
        padding:0;
        margin:0;
        border:0;     
        width:100%;
        height:100%;
        overflow:hidden;   
    }
    </style>
    
</head>
<body>

	<div class="mini-toolbar" style="border:0px none;height:40px">
	</div>
	
	<div id="itemForm" class="mini-fit" style="margin:8px">
		<input name="id" class="nui-hidden"></input>
		<table style="width:100%" border="0">
			<tr>
				<td width="20%" align="right"><label>上级指标：</label></td>
				<td width="80%" colspan="3">
					<input id="pid" name="parent.id" class="nui-textbox" width="100%" enabled="false" text="xxx"></input>
				</td>
			</tr>
			<tr>
				<td width="20%" align="right"><label>指标编号：</label></td>
				<td width="30%"><input width="100%" class="nui-textbox" name="number" required="true"></input></td>
				<td width="20%" align="right"><label>指标级别：</label></td>
				<td width="30%">
					<input width="100%" class="nui-textbox" name="level" enabled="false" required="true"></input>
				</td>
			</tr>
			<tr>
				<td width="20%" align="right"><label>指标名称：</label></td>
				<td width="80%" colspan="3">
					<input width="100%" class="nui-textbox" name="name" required="true"></input>
				</td>
			</tr>
			<tr>
				<td width="20%" align="right"><label>指标权重：</label></td>
				<td width="30%">
					<input width="100%" class="nui-spinner" name="weight" required="true"></input>
				</td>
				<td width="20%" align="right"><label>指标得分：</label></td>
				<td width="30%">
					<input width="100%" class="nui-spinner" name="score" enabled="false" required="true"></input>
				</td>
			</tr>
			<tr>
				<td width="20%" align="right"><label>概要信息：</label></td>
				<td colspan="3">
					<input class="nui-textbox" width="100%" name="summary"></input>
				</td>
			</tr>
			<tr height="0px" class="auto-fit">
				<td width="20%" style="height:100%" align="right"><label>详细信息：</label></td>
				<td colspan="3" style="width:80%;height:100%">
					<input class="nui-textarea auto-fit" style="width:100%;height:100%" name="description"></input>
				</td>
			</tr>
		</table>
	</div>
	
	<div class="mini-toolbar" style="text-align:right;border:0px none;padding:8px">
		<a class="nui-button" iconCls="icon-ok" onclick="onOkClick">确定</a>
		<a class="nui-button" iconCls="icon-cancel" onclick="onCancelClick">取消</a>
	</div>

	
	<script type="text/javascript">
    	nui.parse();
    	
		$(function(){
			var tr = $(".auto-fit");
			var totalHeight = tr.parents(".mini-fit").first().height();
			
			var siblingsHeight = 0;
			var siblings = tr.siblings();
			
			siblings.each(function(i, s) {
				var object = $(s);
				siblingsHeight += object.height();
			});

			tr.attr("height", totalHeight - siblingsHeight - 16);
		});
		
		var itemForm = new nui.Form("#itemForm");
		function setData(data) {
			itemForm.setData(data, true);
		}
		
		function getData() {
			console.log(itemForm.getData());
		}
		
		function init(parent, f) {
		
			callback = f;
			
			var newItem = new Object();
			newItem.parent = new Object();
			if (parent != undefined) {
			
				newItem.parent.id = parent.id;
				newItem.level = 1;
				setData(newItem);
			} else {
			}
		}
		
		function onOkClick(event) {
		//	if (itemForm.validate() == false) {
		//		nui.alert("表单数据未通过检查，请检查后提交。");
		//		return;
		//	}
			
			var data = nui.encode({item: itemForm.getData()});
			
			alert(data);
			
			nui.ajax({
				async : false,
				url : "com.jzsoft.eos.assessment.AssessmentItemTreeGrid.addItem.biz.ext",
				type : "post",
				contentType : "text/json",
				data : data,
				success : function(result) {
					alert("XXXX");
				},
				error : function() {
					nui.alert("FAILURE");
				}
			});
			
		}
		
		function onCancel() {
			
		}
		
		function closeWindow() {
		}
		
		function addItem() {
			
		}
		
		
		
    </script>
</body>
</html>