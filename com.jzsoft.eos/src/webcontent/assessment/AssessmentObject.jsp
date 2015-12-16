<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" session="false" %>
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<!-- 
  - Author(s): LUCHAO
  - Date: 2015-12-16 10:43:44
  - Description:
-->
<head>
<title>Title</title>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8" />
    <script src="<%= request.getContextPath() %>/common/nui/nui.js" type="text/javascript"></script>
    
    <style type="text/css">
    html, body{
        margin:0;padding:0;border:0;width:100%;height:100%;overflow:hidden;
    }    
    </style>
    
</head>
<body>
	
	<div class="nui-toolbar" style="padding:2px;border-top:0;border-left:0;border-right:0;">
		<table style="width: 100%;">
			<tr>
				<td style="width: 100%;">
					<a class="nui-button" iconCls="icon-addfolder" plain="true"
						onclick="itemTreeGrid.doAddItem()">增加</a>
					<a class="nui-button" iconCls="icon-edit" plain="true">修改</a>
					<a class="nui-button" iconCls="icon-remove" plain="true"
						onclick="itemTreeGrid.doDeleteNode();">删除</a>
				</td>
				<td style="white-space: nowrap;">
					<label style="font-family: Verdana;">Filter by: </label>
					<input class="nui-textbox" />
				</td>
			</tr>
		</table>
    </div>
    
	<div class="nui-fit">
		<div id="objectGrid" class="nui-datagrid" style="width:100%; height:100%" borderStyle="border:0"
			url="com.jzsoft.eos.assessment.AssessmentObjectDataGrid.loadData.biz.ext" dataField="objects">
			<div property="columns">
		        <div type="indexcolumn"></div>
		        <div type="checkcolumn"></div>
		        <div field="number" width="120" headerAlign="center" allowSort="true">对象编号</div>    
		        <div field="name" headerAlign="center" allowSort="true">对象名称</div>
		        <div field="description" headerAlign="center" allowSort="true">对象描述</div>
		    </div>
		</div>
	</div>


	<script type="text/javascript">
    	nui.parse();
    </script>
</body>
</html>