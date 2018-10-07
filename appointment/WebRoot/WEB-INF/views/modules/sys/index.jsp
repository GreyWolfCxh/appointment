<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
	<meta name="decorator" content="default"/>
	<title>预约平台</title>
	<script type="text/javascript">
		
	</script>
	<style type="text/css">
	
	</style>
</head>
<body>
	<div style="margin:20px 0;"></div>
	<div class="easyui-layout" style="width:100%;height:1200px;">
		<div data-options="region:'north'" style="height:50px">
			<div style="margin:auto;" align="center">
			<a href="${path}/base/goPath/modules/sys/work" target="mainFrame">工作台</a>
			<a href="${path}/base/goPath/modules/release/releaseNumber" target="mainFrame">放号管理</a>
			<a href="${path}/base/goPath/modules/platform/platform" target="mainFrame">平台管理</a>
			<span align="right">管理员：${sessionScope.user.NAME }|<span><a href="${path}/base/logout"> </a>退出</span></span>
			</div>
		</div>
		<div data-options="region:'south'" style="height:50px;">
			
			<p align="center">Copyright &copy; 2018.Company name comit.</p>
			
		</div>
	
		
		<div data-options="region:'center',iconCls:'icon-ok'" style="height: 800px;">
			
		<iframe id="mainFrame" name="mainFrame"  scrolling="yes" src="${path}/work/toWork"style="width: 100%;height: 70%;"></iframe>
		</div>
	</div>
	

	<script type="text/javascript">
		
	</script>
</body>
</html>