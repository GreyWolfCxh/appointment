<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
	<meta name="decorator" content="default"/>
	<title>工作台</title>
	<script type="text/javascript">
		
	</script>
	<style type="text/css">
	
	</style>
</head>
<body>

	<div style="margin:20px 0"></div>
	
	<!--内容-->
	<div id="content" style="width: 100%;height: 310px;">
	<!--左边-->
	<div style="float: left;width:50%;height:300px;margin: auto;">
	<div align="center" style="width:50%;height:25px;border: solid #0081C2 1PX;margin: auto;"><span>9:41</span></div>
		<div class="easyui-calendar" style="width:50%;height:250px;margin: auto;"></div>
		<div align="center" style="width:50%;height:25px;border: solid #0081C2 1PX;margin: auto;">TODAY</div>
		</div>
		<!--右边-->
	<div style="float: right;width:50%;height:300px;">	
	
		<table border="1" cellspacing="0" cellpadding="0" style="width: 600px;height: 300px;text-align:center;">
			<tr>
				<td>
				<table border="1" cellspacing="0" cellpadding="0" style="width: 300px;height: 300px;text-align:center;">
						<tr>
							<td>上午</td>
						</tr>
						<c:choose>
					<c:when test="${resultSet.size()>0}">
					<c:forEach items="${resultSet}" var="result">
						<tr>
							<c:if test="${result.VALID_TIME=='am' }">
							<td>
								 <a href="${path }/record/toAppointmentRecord">${result.TIME }</a></br>
								办理：${result.OPERATION_NUMBER }/${result.APPOINTMENT_NUMBER }
							</td>
							</c:if>
						</tr>
						</c:forEach>
						</c:when>
					<c:otherwise>
					<tr><td>暂时无记录</td></tr>
					</c:otherwise>
					</c:choose>
					</table>
					
				</td>
				<td>
				<table border="1" cellspacing="0" cellpadding="0" style="width: 300px;height: 300px;text-align:center;">
						<tr>
							<td>下午</td>
						</tr>
						<c:choose>
					<c:when test="${resultSet2.size()>0}">
					<c:forEach items="${resultSet2}" var="result">
						<tr>
							
							<c:if test="${result.VALID_TIME=='pm' }">
							<td>
								 <a href="${path }/record/toAppointmentRecord">${result.TIME }</a></br>
								办理：${result.OPERATION_NUMBER }/${result.APPOINTMENT_NUMBER }
							</td>
							</c:if>
						</tr>
						</c:forEach>
						</c:when>
					<c:otherwise>
					<tr><td>暂时无记录</td></tr>
					</c:otherwise>
					</c:choose>
					</table>
				</td>
			</tr>
		</table>
		
	</div>
	
	
	</div>
	<!--内容 end -->
	
	
	<div style="padding:50px;width:100%;height: 10px;margin-top: 0px;"></div>
	<div style="height:50px;margin: auto;" align="center">
		<form  method="post" style="margin: auto;" action="${path }/record/toAppointmentRecord">
		<table id="table2" border="1" cellspacing="0" cellpadding="0" style="width: 700px;height: 50px;text-align:center;">
			<tr>
				<td >
					<input placeholder="预约码" name="APPOINTMENT_CODE" size="10"/>
				</td>
				<td>
					<input placeholder="车牌号" name="CAR_NUMBER" size="10"/>
				</td>
				<td>
					<input placeholder="预约人" name="USER_NAME" size="10" />
				</td>
				<td>
					<input placeholder="电话号码" name="USER_PHONE"  size="11"/>
				</td>
				<td>
					<input type="submit" value="预约查询"/>
				</td>
			</tr>
		</table>
		</form>
	</div>
	

	
	<script type="text/javascript">
		
	</script>
</body>
</html>