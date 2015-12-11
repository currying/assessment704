<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" session="false"%>
<%@include file="/nui/common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<!-- 
  - Author(s): LUCHAO
  - Date: 2015-12-07 15:01:26
  - Description:
-->
<head>
<title>Title</title>
<meta http-equiv="content-type" content="text/html; charset=UTF-8" />
<link href="../demo.css" rel="stylesheet" type="text/css" />
</head>
<body>

	<table>
		<thead>
			<tr>
				<td><h1>
						2015年技术部考核<small>2015nia</small>
					</h1></td>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>考核对象</td>
				<td><input></td>
				<td>考核状态</td>
				<td><input></td>
				<td>考核得分</td>
				<td><input></td>
			</tr>
		</tbody>
	</table>
	<hr />


	<div id="itemTreeGrid" class="nui-treegrid"
		style="width: 100%; height: 400px;" showTreeIcon="true"
		showCheckbox="true"
		url="com.jzsoft.eos.assessment.AssessmentItemTreeGrid.loadData.biz.ext"
		onBeforeLoad="onItemTreeGridBeforeLoad"
		onPreLoad="onItemTreeGridPreLoad" onLoad="onItemTreeGridLoad"
		treeColumn="name" idField="id" allowResize="true" fitColumns="false"
		dataField="items">
		<div property="columns">
			<div type="indexcolumn"></div>
			<div name="name" field="name" headerAlign="center" width="200">考核指标</div>
			<div field="weight" headerAlign="center" width="80">职能权重</div>
			<div field="summary" width="400" headerAlign="center" align="right">指标摘要</div>
		</div>
	</div>



	<script type="text/javascript">
		nui.parse();
		function loadData(node) {
		}
		function createDynamicColumns() {
			createSubColumns = function(columns, group) {
				var column = new Object;
				column.header = group.name;
				column.width = 80;
				column.headerAlign = "center";

				if (group.children != undefined) {
					column.columns = new Array();
					group.children.forEach(function(child) {
						createSubColumns(column.columns, child);
					});
				}

				columns.push(column);
			};

			nui
					.ajax({
						async : false,
						url : "com.jzsoft.eos.assessment.AssessmentItemTreeGrid.loadColumns.biz.ext",
						type : "post",
						contentType : "text/json",
						data : {
							taskId : 1
						},
						success : function(result) {
							var groups = result.groups;

							var itemTreeGrid = nui.get("itemTreeGrid");
							var columns = itemTreeGrid.getColumns();

							groups.forEach(function(group) {
								column = new Object;

								column.header = group.name;
								column.width = 80;
								column.headerAlign = "center";

								if (group.children != undefined) {
									column.columns = new Array();

									group.children
											.forEach(function(child) {
												createSubColumns(
														column.columns, child);
											});
								}

								columns.push(column);
							});

							itemTreeGrid.setColumns(columns);
						},
						error : function() {
							nui.alert("FAILURE");
						}
					});
		}

		function onItemTreeGridBeforeLoad(event) {
			var tree = event.sender;
			var node = event.node;

			if (tree.getLevel(node) == -1) {
				event.params.id = 1; // taskId
				event.params.isRoot = true;
			} else {
				event.params.id = node.id;
				event.params.isRoot = false;
			}

		}

		function onItemTreeGridPreLoad(event) {

			event.data.forEach(function(item) {
				item.isLeaf = false;
				item.expanded = false;
			});
		}

		function onItemTreeGridLoad(event) {
			var cells = [ {
				rowIndex : 0,
				columnIndex : 0,
				rowSpan : 1,
				colSpan : 2
			}, {
				rowIndex : 1,
				columnIndex : 0,
				rowSpan : 4,
				colSpan : 3
			} ];

			var itemTreeGrid = nui.get("itemTreeGrid");
			itemTreeGrid.margeCells(cells);

		}

		function onItemTreeGridLoadNode(event) {
		}
		createDynamicColumns();
	</script>
</body>
</html>