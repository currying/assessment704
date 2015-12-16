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
</head>
<body style="width:100%;height:100%;">
    <!-- div  class="nui-tabs" style="width:100%;height:100%;" activeIndex="0"> 
	
		   <div title="Tab1" style="width:100%;height:100%">-->
		    <!-- 标识页面是查看(query)、修改(edit)、新增(add) -->
		   <div style="width:100%;height:100%;">
	        <div  id="AssessmentTaskForm" class="nui-toolbar" style="border-bottom:0;padding:0px;">
              <!--  数据实体的名称 -->
	         <input class="nui-hidden" name="criteria/_entity" value="com.jzsoft.csic704.dataset.AssessmentTask">
	            <table style="width:100%;">
	                <tr>
	                    <td>
	                        <a class="nui-button" iconCls="icon-add" onclick="add()">增加</a>
	                        <a class="nui-button" iconCls="icon-edit" onclick="edit()">编辑</a>
	                        <a class="nui-button" iconCls="icon-remove" onclick="remove()">删除</a>     
	                        <input id="key" emptyText="请输入查询条件" class="nui-textbox" name="criteria/_expr[1]/name" onenter="onKeyEnter" />
             				 <input class="nui-hidden" name="criteria/_expr[1]/_op" value="=">      
	                        <a class="nui-button" onclick="search()">查询</a>
	                    </td>
	                </tr>
	            </table>           
	         </div>
	  <!--  </div>  -->
	    <!-- dataGrid展示页面 -->
	        <div id="datagrid2" dataField="assessmenttasks" class="nui-datagrid" style="width:100%;height:90%;" allowResize="true"
        url="com.jzsoft.csic704.assessmenttaskbiz.queryAssessmentTasks.biz.ext"  multiSelect="true" >
        <div property="columns">
            <div type="checkcolumn" ></div>
               
	             <div field="id" name="id" width="120" headerAlign="center" allowSort="true">任务编号</div>
	             <div field="name" name="name" width="120" headerAlign="center" allowSort="true" name="mytest">任务名称</div>  
	             
            <div header="考核对象">
                <div property="columns">
                    <div field="tDepartment.name" name = "tDepartment.name" width="120">部门</div>
                    <div field="tPosition.name" name="tPosition.name" width="100">人数</div>
                    <!-- <div field="salary" dataType="currency" currencyUnit="￥" align="right" width="100" allowSort="true">薪资</div> -->
                </div>
            </div>
                
	        <div header="评分人员">
                <div property="columns">
                    <div field="tDepartment.name" width="120">名字</div>
                    <div field="tPosition.name" width="100">权重</div>
                    <div field="salary" dataType="currency"  align="right" width="100" allowSort="true">结果</div>
                </div>
            </div> 
            <div field="createtime" width="100" headerAlign="center" dateFormat="yyyy-MM-dd" allowSort="true">创建日期</div>    
            <div header="考核内容">
                <div property="columns">
                    <div field="gender" width="100" allowSort="true renderer="onGenderRenderer">开始时间</div>
                    <div field="age" width="100" allowSort="true">结束时间</div>
                    <div field="birthday" width="100" renderer="">进度</div>
                    <div field="birthday" width="100" renderer="">结果</div>
                </div>
            </div>                     
         </div> 
        </div>

	<script type="text/javascript">
    	nui.parse();
    	
    	function openFrame(params) {
    	}
    	
    	function closeFrameQuery() {
    	}
    </script>
</body>
</html>