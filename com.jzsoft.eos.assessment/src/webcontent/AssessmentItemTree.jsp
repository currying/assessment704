<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" session="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%--
- Author(s): currying
- Date: 2015-12-01 10:51:14
- Description:
  --%>
<head>
<title>考核指标查询</title>
<meta http-equiv="content-type" content="text/html; charset=UTF-8" />
<script src="<%=request.getContextPath()%>/common/nui/nui.js"
	type="text/javascript">
	
</script>
</head>
<body style="width: 98%; height: 93%;">
	<div id="treegrid1" class="nui-treegrid"
		style="width: 1000px; height: 600px;" showTreeIcon="true"
		textField="text" idField="id" treeColumn="name"
		dataField="assessmentItems" ondrawsummarycell="onDrawSummaryCell"
		showSummaryRow="true" onrowdblclick="onRowDblClick">
		<div property="columns">
			<div type="indexcolumn"></div>
			<div field="id" headerAlign="center" visible="false">id</div>
			<div name="name" field="name" headerAlign="center">考核指标</div>
			<div name="summary" field="summary" headerAlign="center">指标摘要</div>
			<div field="weighting" summaryType="sum" align="center"
				headerAlign="center">职能权重</div>
			<div field="itemWeighting" align="center" headerAlign="center">下级职能权重和</div>
			<div field="" align="center" headeralign="center" width="160">
				评分权重
				<div property="columns" align="center">
					<div field="" name="" width="60" headeralign="center"
						allowsort="true" align="center">
						部门评分
						<div property="columns" align="center">
							<div field="" name="" width="60" headeralign="center"
								allowsort="true" align="center"></div>
						</div>
					</div>
					<div field="" width="60" headeralign="center" allowsort="true"
						align="center">
						领导评分
						<div property="columns" align="center">
							<div field="" name="" width="60" headeralign="center"
								allowsort="true" align="center"></div>
						</div>
					</div>
				</div>
			</div>
			<div field="assessmentTask.name" headerAlign="center">考核任务</div>
		</div>
	</div>
	<script type="text/javascript">
		nui.parse();
		var grid = nui.get("treegrid1");
		grid
				.setUrl("com.jzsoft.eos.assessment.assessmentItemBiz.queryAssessmentItem.biz.ext");
		var data =grid.load();
		console.log(data);
		function onDrawSummaryCell(e) {
			//客户端汇总计算
			if (e.field == "weighting") {
				e.cellHtml = "合计: " + e.cellHtml;
			}
		}
		function onRowDblClick(e) {
			nui
					.ajax({
						url : "com.jzsoft.eos.assessment.assessmentItemBiz.queryAssessmentItemWeighting.biz.ext",
						type : "get",
						contentType : 'text/json',
						data : {
							'id' : e.record.id
						},
						success : function() {
						},
						error : function() {
						}
					});
		}
	</script>
</body>
</html>
