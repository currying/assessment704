<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" session="false"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<!-- 
  - Author(s): HELEI
  - Date: 2015-12-16 10:33:26
  - Description:
-->
<head>
<title>考核任务</title>
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
	<div id="AssessmentTaskForm" class="nui-toolbar"
		style="padding: 2px; border-top: 0; border-left: 0; border-right: 0;">
		<a class="nui-button" iconCls="icon-reload" plain="true"
			onClick="onRefreshButtonClick">重新加载</a> <span class="separator"></span>
		<a class="nui-button" iconCls="icon-addfolder" plain="true"
			onclick="onAddButtonClick">增加</a> <a class="nui-button"
			iconCls="icon-remove" plain="true" onclick="onDeleteButtonClick">删除</a>
		<a class="nui-button" iconCls="icon-save" plain="true"
			onclick="onSaveButtonClick">保存</a> <span class="separator"></span> <a
			class="nui-button" iconCls="icon-user" plain="true"
			onclick="onGroupButtonClick">考评组</a> <span class="separator"></span>
		<input id="filterText" class="nui-textbox" emptyText="请输入过滤条件..." />
	</div>

	<!-- taskDataGrid展示页面 -->
	<div class="nui-fit">
		<div id="taskDataGrid" class="nui-datagrid"
			style="width: 100%; height: 100%" borderStyle="border:0" idField="id"
			dataField="tasks" autoLoad="false" multiSelect="true"
			selectOnLoad="true" showModified="true" fitColumns="true"
			allowCellEdit="true" allowCellSelect="true"
			url="com.jzsoft.eos.assessment.AssessmentTaskDataGrid.loadData.biz.ext">

			<div property="columns">
				<div type="indexcolumn" width="30" headerAlign="center">行号</div>
				<div type="checkcolumn" width="30"></div>
				<div field="number" width="80" headerAlign="center">
					任务编号 <input property="editor" class="nui-textbox"
						style="width: 100%;"></input>
				</div>
				<div field="title" width="80" headerAlign="center">
					任务名称 <input property="editor" class="nui-textbox"
						style="width: 100%;"></input>
				</div>
				<div field="score" width="80" headerAlign="center">考核结果</div>
				<div field="status" width="80" headerAlign="center">状态</div>
				<div field="description" width="260" headerAlign="center">
					任务描述 <input property="editor" class="nui-textbox"
						style="width: 100%;"></input>
				</div>
			</div>
		</div>
	</div>

	<script type="text/javascript">
		nui.parse();

		var initParams;

		var taskDataGrid = nui.get("taskDataGrid");

		// Global function
		function openFrame(params) {
			initParams = params;
			taskDataGrid.load({
				objectId : initParams.objectId
			});
		}

		function closeFrameQuery() {
			if (taskDataGrid.getChanges().length > 0) {
				var isOk = confirm("页面数据发生变化，是否需要保存？");
				if (isOk == true)
					return false;
			}

			return true;
		}

		// Toolbar Button's Event
		function onRefreshButtonClick(event) {
			var changes = taskDataGrid.getChanges();
			if (changes.length > 0) {
				nui
						.confirm(
								"<div style='text-align:left'>页面数据发生变化，是否刷新？<br/>选择“确定”，重新加载数据；选择“取消”，不重新加载数据。</div>",
								"提示", function(messageId) {
									if (messageId == "ok")
										taskDataGrid.reload();
								});
			} else {
				taskDataGrid.reload();
			}
		}

		function onAddButtonClick(event) {
			var row = new Object();
			row.object = new Object();
			row.object.id = initParams.objectId;
			taskDataGrid.addRow(row, 0);
		}

		function onDeleteButtonClick(event) {
			var rows = taskDataGrid.getSelecteds();
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
										taskDataGrid.removeRows(rows, true);
								});
			}
		}

		function onGroupButtonClick(event) {
			var rows = taskDataGrid.getSelecteds();

			if (rows.length <= 0) {
				nui.alert("请先选择一条任务，再进行考评组设置。");
			} else {
				if (rows[0].id == undefined) {
					nui.alert("该任务尚未保存到数据库，请先保存该数据。");
				} else {
					showGroupEditor(rows[0].id);
				}
			}
		}

		nui.get("filterText").on(
				"valuechanged",
				function(event) {
					var text = event.value ? event.value : "";

					if (text == "") {
						taskDataGrid.clearFilter();
					} else {
						taskDataGrid.filter(function(row) {
							// alert(text);
							var title = row.title ? row.title : "";
							var description = row.description ? row.description
									: "";

							return ((title.indexOf(text) != -1) || (description
									.indexOf(text) != -1));
						});
					}

					return true;
				});

		function onSaveButtonClick(event) {
			saveData();
		}

		// Global function
		function saveData() {
			var changes = taskDataGrid.getChanges();
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

			taskDataGrid.loading("保存中，请稍后......");
			nui
					.ajax({
						url : "com.jzsoft.eos.assessment.AssessmentTaskDataGrid.saveData.biz.ext",
						type : 'POST',
						data : nui.encode({
							created : created,
							deleted : deleted,
							updated : updated
						}),
						success : function(result) {
							if (result.exception) {
								taskDataGrid.unmask();
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
													taskDataGrid.reload();
												});
									}
								});
							} else {
								if (window.parent && window.parent.refresh) {
									window.parent.refresh();
								}

								taskDataGrid.reload();
							}
						},
						error : function(jqXHR, textStatus, errorThrown) {
							alert(jqXHR.responseText);
						}
					});
		}

		function showGroupEditor() {
			nui.open({
				url : "AssessmentGroup.jsp",
				title : "考评组",
				width : 900,
				height : 540,
				allowResize : false,
				showShadow : true,
				onload : function() {
					var iframe = this.getIFrameEl();
					// iframe.contentWindow.init(node, callback);
				},
				ondestroy : function(action) {
					// grid.reload();
				}
			});
		}
	</script>
</body>
</html>