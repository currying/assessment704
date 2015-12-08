<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" session="false" %>
	
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
    <script src="<%= request.getContextPath() %>/common/nui/nui.js" type="text/javascript"></script>
    
</head>
<body>

	<table>
		<thead>
			<tr>
				<td><h1>2015年技术部考核<small>2015nia</small></h1></td>
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
	<hr/>



	<script type="text/javascript">
    	nui.parse();
    	
    	function loadData(node) {
    		nui.alert("AAAAAAAAAAA");
    	}
    </script>
</body>
</html>