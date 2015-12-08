<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" session="false"%>
<%@include file="/nui/common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<!-- 
  - Author(s): currying
  - Date: 2015-11-24 10:12:17
  - Description:
-->
<head>
<link href="../demo.css" rel="stylesheet" type="text/css" />
<title>选择考核对象</title>
<meta http-equiv="content-type" content="text/html; charset=UTF-8" />

</head>
<body style="width: 98%; height: 95%;">
	<div style="width: 1%; height: 1%;">
		<div id="AssessmentObjectForm" class="nui-form" align="center"
			style="height: 100%">
			<!-- 数据实体的名称 -->
			<input class="nui-hidden" name="criteria/_entity"
				value="com.jzsoft.eos.dataset.AssessmentObject">
		</div>
	</div>
	<div class="nui-fit">
		<div id="datagrid1" dataField="assessmentobjects" class="nui-datagrid"
			style="width: 100%; height: 90%;"
			url="com.jzsoft.eos.assessmentobjectbiz.queryAssessmentObjects.biz.ext"
			pageSize="10" showPageIndex="true" onrowdblclick="onRowDblClick">
			<div property="columns">
				<div type="indexcolumn" headerAlign="center">序号</div>
				<div field="id" headerAlign="center" allowSort="true"
					visible="false">考核对象标识</div>
				<div field="name" headerAlign="center" allowSort="true">考核对象</div>
			</div>
		</div>
	</div>
	<div class="nui-toolbar"
		style="text-align: center; padding-top: 8px; padding-bottom: 8px;"
		borderStyle="border:0;">
		<a class="nui-button" style="width: 60px;" onclick="onOk()">确定</a> <span
			style="display: inline-block; width: 25px;"></span> <a
			class="nui-button" style="width: 60px;" onclick="onCancel()">取消</a>
	</div>
	<script type="text/javascript">
		nui.parse();
		var grid = nui.get("datagrid1");

		var formData = new nui.Form("#AssessmentObjectForm").getData(false,
				false);
		grid.load(formData);

		//重新刷新页面
		function refresh() {
			var form = new nui.Form("#AssessmentObjectForm");
			var json = form.getData(false, false);
			grid.load(json);//grid查询
			nui.get("update").enable();
		}

		//查询
		function search() {
			var form = new nui.Form("#AssessmentObjectForm");
			var json = form.getData(false, false);
			grid.load(json);//grid查询
		}

		//重置查询条件
		function reset() {
			var form = new nui.Form("#AssessmentObjectForm");//将普通form转为nui的form
			form.reset();
		}

		//enter键触发查询
		function onKeyEnter(e) {
			search();
		}
		function GetData() {
			var row = grid.getSelected();
			return row;
		}
		//当选择列时
		function selectionChanged() {
			var rows = grid.getSelecteds();
			if (rows.length > 1) {
				nui.get("update").disable();
			} else {
				nui.get("update").enable();
			}
		}

		function CloseWindow(action) {
			if (window.CloseOwnerWindow)
				return window.CloseOwnerWindow(action);
			else
				window.close();
		}
		function onRowDblClick(e) {
			onOk();
		}
		function onOk() {
			CloseWindow("ok");
		}
		function onCancel() {
			CloseWindow("cancel");
		}
	</script>
</body>
</html>