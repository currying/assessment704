<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" session="false" %>
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<!-- 
  - Author(s): LUCHAO
  - Date: 2015-12-17 16:16:45
  - Description:
-->
<head>
<title>错误</title>
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

	<div class="mini-toolbar" style="text-align:left; border:0px none; padding:8px">
		&#12288&#12288数据保存失败，按“返回上页”，保持当前数据，返回上页继续编辑；按“重新加载”，放弃当前正在
		编辑的数据，从服务器重新加载数据。
	</div>
	
	<div class="mini-fit" style="margin:8px">
		<table id="errorForm" style="width:100%">
			<tr>
				<td width="20%" align="right"><label>错误代码：</label></td>
				<td width="80%" colspan="3">
					<input name="code" class="nui-textbox" width="100%" enabled="false"></input>
				</td>
			</tr>
			<tr height="0px" class="auto-fit">
				<td width="20%" align="right"><label>详细信息：</label></td>
				<td style="height:100%">
					<input name="message" class="nui-textarea" style="width:100%; height:100%"></input>
				</td>
			</tr>
		</table>
	</div>
	
	<div class="mini-toolbar" style="text-align:right;border:0px none;padding:8px">
		<a class="nui-button" iconCls="icon-upgrade" onclick="onOkClick">返回上页</a>
		<a class="nui-button" iconCls="icon-reload" onclick="onCancelClick">重新加载</a>
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

			tr.attr("height", totalHeight - siblingsHeight - 8);
			
		});
		
		function init(error, callback) {
			errorForm = new nui.Form("#errorForm");
			errorForm.setData(error);
		}
    </script>
</body>
</html>