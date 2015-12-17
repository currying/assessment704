<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" session="false" %>
	
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
    <script src="<%= request.getContextPath() %>/common/nui/nui.js" type="text/javascript"></script>
    <style type="text/css">
	    html, body{
	        margin:0;padding:0;border:0;width:100%;height:100%;overflow:hidden;
	    }    
    </style>
</head>
<body >
     
		    <!-- 标识页面是查看(query)、修改(edit)、新增(add) -->
	        <div  id="AssessmentTaskForm" class="nui-toolbar" style="padding:2px;border-top:0;border-left:0;border-right:0;" >
              <!--  数据实体的名称 -->
	         <input class="nui-hidden" name="criteria/_entity" value="com.jzsoft.csic704.dataset.AssessmentTask">
	            <table style="width:100%;">
	                <tr>
	                    <td>
	                        <a class="nui-button" iconCls="icon-addfolder" plain="true" onclick="add()">增加</a>
	                        <a class="nui-button" iconCls="icon-edit" plain="true" onclick="edit()">编辑</a>
	                        <a class="nui-button" iconCls="icon-remove" plain="true" onclick="remove()">删除</a>     
	                        <input id="key" emptyText="请输入查询条件" class="nui-textbox" name="criteria/_expr[1]/name" onenter="onKeyEnter" />
             				 <input class="nui-hidden" name="criteria/_expr[1]/_op" value="=">      
	                        <a class="nui-button" onclick="search()">查询</a>
	                    </td>
	                </tr>
	            </table>           
	         </div>
	    <!-- dataGrid展示页面 -->
	   
	    <div id="datagrid2" dataField="assessmenttasks" class="nui-datagrid" borderStyle="border:0" style="width:100%;height:100%;" allowResize="true"
         url="com.jzsoft.eos.assessment.AssessmentTaskManager.loadData.biz.ext"  multiSelect="true" >
	        <div property="columns">
	                 <div type="checkcolumn" width="30"></div>
	                 <div field="indexcolumn" width="30" headerAlign="center">行号</div>
		             <div field="number" name="id" width="120" headerAlign="center" allowSort="true">任务编号</div>
		             <div field="title" name="name" width="120" headerAlign="center" allowSort="true" name="mytest">任务名称</div>  
		              <div field="objectid" width="120" headerAlign="center"  allowSort="true">考核ID</div>  
		              <div field="object" width="120" headerAlign="center"  allowSort="true">考核对象</div>  
		              <div field="score" width="120" headerAlign="center"  allowSort="true">考核结果</div>  
		              <div field="createtime" width="120" headerAlign="center"  allowSort="true">状态</div>
		              <div field="createtime" width="120" headerAlign="center"  allowSort="true">group</div>             
	                <div field="createtime" width="120" headerAlign="center" dateFormat="yyyy-MM-dd" allowSort="true">创建日期</div>            
	         </div>
	     </div>  
      
    <script type="text/javascript">
    	nui.parse();
    	var grid = nui.get("datagrid2");
    	grid.load();
    	
    	function add() {
    	  nui.open({
	          url: "AssessmentTaskForm.jsp",
	          title: "新增记录", width: 600, height: 300,
	          onload: function () {//弹出页面加载完成
		          var iframe = this.getIFrameEl();
		          var data = {pageType:"add"};//传入页面的json数据
		          iframe.contentWindow.setFormData(data);
	          },
	          ondestroy: function (action) {//弹出页面关闭前
	          grid.reload();
	        }
	        });
    	}
    	
    	function openFrame(params) {
    	}
    	
    	function closeFrameQuery() {
    	}
    </script>
</body>
</html>