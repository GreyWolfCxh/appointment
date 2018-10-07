<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
	<meta name="decorator" content="default"/>
	<title>预约记录</title>
	<script type="text/javascript">
		
	</script>
	<style type="text/css">
	
	</style>
</head>
<body>

	<div style="margin:20px 0;"></div>
	<div id="tb" style="padding:5px;height:auto">	
		<div style="margin-bottom:5px">		
			<h3>2018-10-05</h3>
			<input id="APPOINTMENT_CODE" style="line-height:26px;border:1px solid #ccc" placeholder="预约码">
			<input id="CAR_NUMBER" style="line-height:26px;border:1px solid #ccc" placeholder="车牌号">
			<input id="USER_NAME" style="line-height:26px;border:1px solid #ccc" placeholder="预约人">
			<input id="USER_PHONE" style="line-height:26px;border:1px solid #ccc" placeholder="手机号码">
			<a href="#" class="easyui-linkbutton" plain="true" onclick="doSearch()">Search</a>
			
		</div>
	</div>
	<table id="tt" class="easyui-datagrid" style="width:100%;height:550px" url="${path }/record/toAppointmentRecord" 	
			 toolbar="#tb"		singleSelect="true" fitColumns="true"  pagination="true">	
		<thead>		
			<tr>	
				<th field="ck" checkbox="true"></th>
					<th data-options="field:'CAR_NUMBER',width:120">车牌号</th>
					<th data-options="field:'ILLEGAL_REASON',width:120">违章信息</th>
					<th data-options="field:'APPOINTMENT_DAY',width:80,align:'right'">预约时间</th>
					<th data-options="field:'USER_NAME',width:80,align:'right'">预约人</th>
					<th data-options="field:'APPOINTMENT_CODE',width:80,align:'right'">预约码</th>
					<th data-options="field:'USER_PHONE',width:80,align:'right'">手机号码</th>
					<th data-options="field:'STATUS',width:240">处理状态</th>		
			</tr>	
		</thead>
		<c:choose>
					<c:when test="${resultSet.size()>0}">
					<c:forEach items="${resultSet}" var="result">
						<tr>
							<td>${result.CAR_NUMBER }</td>
							<td>${result.ILLEGAL_REASON }</td>
							<td>${result.APPOINTMENT_DAY }</td>
							<td>${result.USER_NAME }</td>
							<td>${result.APPOINTMENT_CODE }</td>
							<td>${result.USER_PHONE }</td>
							<td>${result.STATUS }</td>
						</tr>
					</c:forEach>
					</c:when>
			<c:otherwise>
			<tr><td>暂时无记录</td></tr>
			</c:otherwise>
			</c:choose>
	</table>


	
	<script type="text/javascript">
			/*查询*/
	function doSearch(){
	$('#tt').datagrid('load',{
		CAR_NUMBER: $('#CAR_NUMBER').val(),
		USER_NAME:$('#USER_NAME').val(),
		APPOINTMENT_CODE:$('#APPOINTMENT_CODE').val(),
		USER_PHONE:$('#USER_PHONE').val()
	});
}
	</script>
	<script type="text/javascript">
		
	</script>
</body>
</html>