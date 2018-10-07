<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
	<meta name="decorator" content="default"/>
	<title>违章管理</title>
	<script type="text/javascript">
		
	</script>
	<style type="text/css">
	
	</style>
</head>
<body>

	<div style="margin:20px 0;"></div>
	<div id="tb" style="padding:5px;height:auto">	
		<div style="margin-bottom:5px">		
			<a href="${path}/base/goPath/modules/platform/platform" target="platFrame" class="easyui-linkbutton" iconCls="icon-add" plain="true" >详情</a>	
			<a href="${path}/base/goPath/modules/platform/addIllegalType" target="platFrame" class="easyui-linkbutton" iconCls="icon-add" plain="true" >添加</a>	
			<a href="${path}/base/goPath/modules/platform/platform" target="platFrame" class="easyui-linkbutton" iconCls="icon-add" plain="true" >编辑</a>	
			<a href="${path}/base/goPath/modules/platform/platform" target="platFrame" class="easyui-linkbutton" iconCls="icon-add" plain="true" >删除</a>	
		</div>
	</div>
	<table id="tt" class="easyui-datagrid" style="width:100%;height:550px" url="${path}/illegal/illegalList" 	
			 toolbar="#tb"		singleSelect="true" fitColumns="true"  pagination="true">	
		<thead>		
			<tr>	
				<th field="ck" checkbox="true"></th>
					<th data-options="field:'ILLEGAL_NAME',width:120">违章类型名称</th>
					<th data-options="field:'TIPS',width:120">描述</th>
					<th data-options="field:'ILLEGAL_STATUS',width:80,align:'right'">是否启用</th>
					<th data-options="field:'PUBLIC_STATUS',width:80,align:'right'">公众配置</th>
					<th data-options="field:'SORT',width:240">排序</th>		
			</tr>	
		</thead>
	</table>
	<script type="text/javascript">
		
	</script>
</body>
</html>