<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" session="false"%>

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
	<table style="width: 100%;">
		<thead>
			<tr>
				<th colspan="8"><h1>
						<input id="title" class="nui-textbox" enabled="false" id="title"/>
					</h1></th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>考核对象：</td>
				<td><input class="nui-textbox" enabled="false"
					style="width: 200px;"></td>
				<td></td>
				<td>考核状态：</td>
				<td><input class="nui-textbox" enabled="false"
					style="width: 200px;"></td>
				<td></td>
				<td>考核得分：</td>
				<td><input class="nui-textbox" enabled="false"
					style="width: 200px;"></td>
			</tr>
		</tbody>
	</table>
	<hr />

	<div class="nui-fit">
		<div class="nui-splitter" style="width: 100%; height: 100%;"
			borderStyle="border:0">
			<div size="60%">
				<div class="nui-toolbar"
					style="padding: 2px; border-left: 0; border-right: 0;">
					<table style="width: 100%;">
						<tr>
							<td style="width: 100%;"><a class="nui-button"
								iconCls="icon-addfolder" plain="true"
								onclick="itemTreeGrid.doAddItem()">增加</a> <a class="nui-button"
								iconCls="icon-edit" plain="true">修改</a> <a class="nui-button"
								iconCls="icon-remove" plain="true"
								onclick="itemTreeGrid.doDeleteNode();">删除</a> <span
								class="separator"></span> <a class="nui-button"
								iconCls="icon-reload" plain="true">刷新</a> <a class="nui-button"
								iconCls="icon-expand" onclick="itemTreeGrid.expandAll();"
								plain="true">展开</a> <a class="nui-button"
								iconCls="icon-download" plain="true">下载</a></td>
							<td style="white-space: nowrap;"><label
								style="font-family: Verdana;">Filter by: </label> <input
								class="nui-textbox" /></td>
						</tr>
					</table>
				</div>

				<div class="nui-fit" border="0">
					<div id="itemTreeGrid" class="nui-treegrid"
						style="width: 100%; height: 100%;" borderStyle="border:0"
						showTreeIcon="true" treeColumn="name" idField="id"
						allowResize="false" fitColumns="true" autoLoad="false"
						selectOnLoad="true" dataField="items"
						url="com.jzsoft.eos.assessment.AssessmentItemTreeGrid.loadData.biz.ext"
						onBeforeLoad="onItemTreeGridBeforeLoad"
						onPreLoad="onItemTreeGridPreLoad"
						onNodeSelect="onItemTreeGridNodeSelect">

						<div property="columns">
							<div type="indexcolumn" width="30"></div>
							<div name="name" field="name" headerAlign="center" width="200">考核指标</div>
							<div field="weight" headerAlign="center" width="60">职能权重</div>
							<div field="score" headerAlign="center" width="60">职能得分</div>
							<div field="summary" width="100" headerAlign="center"
								align="right">指标摘要</div>
							<div field="description" width="200" headerAlign="center"
								align="">指标描述</div>
						</div>
					</div>
				</div>
			</div>

			<div size="300" showCollapseButton="true">
				<div class="nui-fit">
					<div id="groupTreeGrid" class="nui-treegrid"
						style="width: 100%; height: 100%"
						borderStyle="border-left:0; border-right:0;" showTreeIcon="true"
						treeColumn="name" idField="id" allowResize="false"
						fitColumns="true" selectOnLoad="true" dataField="groups"
						url="com.jzsoft.eos.assessment.AssessmentGroupTreeGrid.loadData.biz.ext"
						onBeforeLoad="onGroupTreeGridBeforeLoad"
						onPreLoad="onGroupTreeGridPreLoad">

						<div property="columns">
							<div type="indexcolumn" width="20"></div>
							<div name="name" field="name" headerAlign="center" width="60">评审员</div>
							<div field="score.weight" headerAlign="center" width="50">评审权重</div>
							<div field="score.score" headerAlign="center" width="50">评审得分</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>


	<script type="text/javascript">
		nui.parse();
		var itemTreeGrid = nui.get("itemTreeGrid");

		var params;
		
		////////////////////////////////////////////////////////////
		function openFrame(initParams) {
			params = initParams;
			var tree = nui.get("itemTreeGrid");
			tree.load();
			queryTaskByid(params.taskId);
		}

		function closeFrameQuery() {
		}

		////////////////////////////////////////////////////////////
		itemTreeGrid.doDeleteNode = function(event) {

			node = itemTreeGrid.getSelectedNode();
			if (node != undefined) {
				itemTreeGrid.removeNode(node);
			}

			console.log(itemTreeGrid.getChanges());
		};

		itemTreeGrid.doAddItem = function(event) {

			// 
			var node = itemTreeGrid.getSelectedNode();

			var callback = function() {
				var newNode = new Object();

				itemTreeGrid.addNode(newNode, -1, node);
			};

			nui.open({
				url : "AssessmentAddItem.jsp",
				title : "新增指标",
				width : 600,
				height : 360,
				allowResize : false,
				showShadow : true,
				onload : function() {
					var iframe = this.getIFrameEl();
					iframe.contentWindow.init(node, callback);
				},
				ondestroy : function(action) {
					grid.reload();
				}
			});
		};

		function onItemTreeGridBeforeLoad(event) {
			var tree = event.sender;
			var node = event.node;

			if (tree.getLevel(node) == -1) {
				event.params.id = params.taskId;
				event.params.isRoot = true;
			} else {
				event.params.id = node.id;
				event.params.isRoot = false;
			}
		}

		function onItemTreeGridPreLoad(event) {
			event.data.forEach(function(item) {
				if (item.level < 3) {
					item.isLeaf = false;
					item.expanded = false;
				}
			});
		}

		function onItemTreeGridNodeSelect(event) {
			updateGroupTreeGridData(event.node.id);
			itemTreeGrid.expandAll();
		}

		itemTreeGrid.on("drawcell", function(event) {
		});

		////////////////////////////////////////////////////////////

		function onGroupTreeGridBeforeLoad(event) {
			var tree = event.sender;
			var node = event.node;

			if (tree.getLevel(node) == -1) {
				event.params.id = 1;
				event.params.isRoot = true;
			} else {
				event.params.id = node.id;
				event.params.isRoot = false;
			}
		}

		function onGroupTreeGridPreLoad(event) {
			event.data.forEach(function(group) {
				if (group.isGroup) {
					group.isLeaf = false;
					group.expanded = false;
				}
			});
		}

		////////////////////////////////////////////////////////////

		function updateGroupTreeGridData(itemId) {
			var treeGrid = nui.get("groupTreeGrid");
			treeGrid.cascadeChild(treeGrid.getRootNode(), function(node) {
				loadScoreInformation(itemId, node.id, function(score) {
					node.score = score;
					treeGrid.updateNode(node);
				});
			});
		}

		function loadScoreInformation(itemId, groupId, fn) {
			nui
					.ajax({
						async : false,
						url : "com.jzsoft.eos.assessment.AssessmentGroupTreeGrid.loadScoreInformation.biz.ext",
						type : "post",
						contentType : "text/json",
						data : {
							itemId : itemId,
							groupId : groupId
						},
						success : function(result) {
							fn(result.score);
						},
						error : function() {
							nui.alert("FAILURE");
						}
					});
		}

		function queryTaskByid(taskId) {
			nui
					.ajax({
						async : false,
						url : "com.jzsoft.eos.assessment.AssessmentTaskBiz.queryTaskById.biz.ext",
						type : "get",
						contentType : "text/json",
						data : {
							taskId : taskId
						},
						success : function(result) {
						nui.get("title").setText(result.assessmentTask.title);
						},
						error : function() {
							nui.alert("FAILURE");
						}
					});
		}
	</script>
</body>
</html>