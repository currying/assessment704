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

	<div class="nui-splitter" style="width: 100%; height: 100%;">
		<div size="280px" showCollapseButton="true">
			<div class="nui-toolbar my-toolbar"
				style="padding: 2px; border-top: 0; border-left: 0; border-right: 0">

				<a id="filterButton" class="nui-button" iconCls="icon-search"
					plain="true"></a>

			</div>

			<div class="nui-fit">
				<div id="groupTree" class="nui-tree"
					style="width: 100%; height: 100%;" showTreeIcon="true"
					textField="name" idField="id" parentField="pid" resultAsTree="true"
					selectOnLoad="true" autoLoad="false" showTreeLines="false"
					url="com.jzsoft.eos.assessment.AssessmentGroupTreeGrid.getCascadeGroupsByTaskId.biz.ext"></div>
			</div>
		</div>
		<div title="center" region="center"></div>
	</div>


	<script type="text/javascript">
		nui.parse();

		function loadData(node) {
			nui.alert("BBBBBBBBBB");
		}
	</script>
</body>
</html>