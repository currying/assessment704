<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" session="false"%>
<%@include file="/nui/common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%--
- Author(s): currying
- Date: 2015-12-01 09:19:40
- Description:
  --%>
<head>
<title>考核对象录入</title>
<meta http-equiv="content-type" content="text/html; charset=UTF-8" />
</script>
</head>
<body>
	<!-- 标识页面是查看(query)、修改(edit)、新增(add) -->
	<input name="pageType" class="nui-hidden" />
	<div id="AssessmentObjectDataform" style="padding-top: 5px;">
		<!-- hidden域 -->
		<input class="nui-hidden" name="assessmentObject.id" />
		<table style="table-layout: fixed;height: 80%;">
			<tr>
				<td style="width: 70px;">序号:</td>
				<td style="width: 150px;"><input class="nui-textbox"
					name="assessmentObject.number" /></td>
				<td style="width: 70px;">考核对象:</td>
				<td style="width: 150px;"><input class="nui-textbox"
					name="assessmentObject.name" /></td>
			</tr>
		</table>
		<div class="nui-toolbar" style="padding: 0px;" borderStyle="border:0;">
			<table width="100%">
				<tr>
					<td style="text-align: center;" colspan="4"><a
						class="nui-button" iconCls="icon-save" onclick="onOk()"> 保存 </a> <span
						style="display: inline-block; width: 25px;"> </span> <a
						class="nui-button" iconCls="icon-cancel" onclick="onCancel()">
							取消 </a></td>
				</tr>
			</table>
		</div>
	</div>
	<script type="text/javascript">
		nui.parse();

		function saveData() {

			var form = new nui.Form("#AssessmentObjectDataform");
			form.setChanged(false);
			//保存
			var urlStr = "com.jzsoft.eos.assessment.AssessmentObjectBiz.addAssessmentObject.biz.ext";
			var pageType = nui.getbyName("pageType").getValue();//获取当前页面是编辑还是新增状态
			//编辑
			if (pageType == "edit") {
				urlStr = "com.jzsoft.eos.assessment.assessmentObjectBiz.updateAssessmentObject.biz.ext";
			}
			form.validate();
			if (form.isValid() == false)
				return;

			var data = form.getData(false, true);
			var json = nui.encode(data);

			$.ajax({
				url : urlStr,
				type : 'POST',
				data : json,
				cache : false,
				contentType : 'text/json',
				success : function(text) {
					var returnJson = nui.decode(text);
					if (returnJson.exception == null) {
						CloseWindow("saveSuccess");
					} else {
						nui.alert("保存失败", "系统提示", function(action) {
							if (action == "ok" || action == "close") {
								//CloseWindow("saveFailed");
							}
						});
					}
				}
			});
		}

		//页面间传输json数据
		function setFormData(data) {
			//跨页面传递的数据对象，克隆后才可以安全使用
			var infos = nui.clone(data);

			//保存list页面传递过来的页面类型：add表示新增、edit表示编辑
			nui.getbyName("pageType").setValue(infos.pageType);

			//如果是点击编辑类型页面
			if (infos.pageType == "edit") {
				var json = infos.record;

				var form = new nui.Form("#AssessmentObjectDataform");//将普通form转为nui的form
				form.setData(json);
				form.setChanged(false);
			}
		}

		//关闭窗口
		function CloseWindow(action) {
			if (action == "close" && form.isChanged()) {
				if (confirm("数据被修改了，是否先保存？")) {
					saveData();
				}
			}
			if (window.CloseOwnerWindow)
				return window.CloseOwnerWindow(action);
			else
				window.close();
		}

		//确定保存或更新
		function onOk() {
			saveData();
		}

		//取消
		function onCancel() {
			CloseWindow("cancel");
		}
	</script>
</body>
</html>
