<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta name="decorator" content="default" />
<title>放号管理</title>
<script type="text/javascript">
	
</script>
<style type="text/css">
</style>
</head>
<body>

	<form method="post" name="form" action="${path}/release/batchReleaseNumber">
		<!--内容-->
		<div id="content" style="width: 100%; height: 410px;">
			<!--左边-->
			<div
				style="float: left; width: 40%; height: 400px; margin: auto; padding-left: 20px; margin-left: 20px;">
				<div id="cc" class="easyui-calendar"
					style="width: 550px; height: 400px;"></div>
				<a href="#" onclick="cs()">测试</a> <input id="date" /><input
					id="date1" /><input id="date2" /></br>
					<input id="listDate" name="listDate" />
			</div>
			<!--left end-->


			<!--右边-->
			<div style="float: right; width: 50%; height: 300px;">
				<div style="float: left;">
					<table id="table1" name="table1" border="1" cellspacing="0"
						cellpadding="0"
						style="width: 200px; height: 300px; text-align: center;">
						<tr>
							<th>上午</th>
							<th>下午</th>
						</tr>
						<tr>
							<td>8:00-9:00</br> 办理：39/40

							</td>
							<td>13:00-14:00</br> 办理：39/40

							</td>
						</tr>

						<tr>
							<td>9:00-10:00</br> 办理：39/40

							</td>
							<td>14:00-15:00</br> 办理：39/40

							</td>
						</tr>

						<tr>
							<td>10:00-11:00</br> 办理：39/40

							</td>
							<td>15:00-16:00</br> 办理：39/40

							</td>
						</tr>
					</table>
					<input type="radio" name="VERSION" value="1">模板一</input>
				</div>
				<div style="float: left; padding-left: 50px;">
					<table id="table1" name="table1" border="1" cellspacing="0"
						cellpadding="0"
						style="width: 250px; height: 150px; text-align: center;">
						<tr>
							<th>上午</th>
							<th>下午</th>
						</tr>
						<tr>
							<td>8:00-12:00</br> 办理：39/40

							</td>
							<td>13:00-17:00</br> 办理：39/40

							</td>
						</tr>


					</table>
					<input type="radio" name="VERSION" value="2">模板二</input>
				</div>
				<div style="margin-top: 10px;" align="center">
					<a href="#" class="easyui-linkbutton" iconCls="icon-add"
						plain="true" onclick="newUser()">添加新模板</a>
				</div>
			</div>
			<!--右边结束-->



		</div>
		<!--content end-->

		<div
			style="padding: 50px; width: 100%; height: 10px; margin-top: 0px;"></div>
		<div style="height: 50px; margin: auto;" align="center">
			<table id="table2" border="1" cellspacing="0" cellpadding="0"
				style="width: 700px; height: 50px; text-align: center;">
				<tr>
					<td><input type="submit" value="放号" /></td>
				</tr>
			</table>
		</div>


	</form>
	
	<!--回收框-->
	<div id="dlg" class="easyui-dialog" style="width:660px;height:480px;padding:10px 20px"
		closed="true" buttons="#dlg-buttons">
		<table border="1" cellspacing="0" cellpadding="0" style="width: 600px;height: 300px;text-align:center;">
			<h3>调整xx放号</h3>
			<tr>
				<th>上午
				<input  type="button" value="剩余回收"/>
				</th>
				<th>下午
				<input  type="button" value="剩余回收"/>
				</th>
			</tr>
			<tr>
				<td>
					8:00-9:00</br>
						办理：39/40
					
				</td>
				<td>
					13:00-14:00</br>
					办理：39/40
					
				</td>
			</tr>
			
			<tr>
				<td>
					9:00-10:00</br>
						办理：39/40
					
				</td>
				<td>
					14:00-15:00</br>
						办理：39/40
					
				</td>
			</tr>
			
			<tr>
				<td>
					10:00-11:00</br>
						办理：39/40
					
				</td>
				<td>
					15:00-16:00</br>
						办理：39/40
					
				</td>
			</tr>
		</table>
	</div>
	<div id="dlg-buttons">
	<a href="#" class="easyui-linkbutton" iconCls="icon-ok" onclick="saveField()">Save</a>
	<a href="#" class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$('#dlg').dialog('close')">Cancel</a>
	</div>

	<script type="text/javascript">
		function cs() {
			var startDate = new Date($("#date1").val());
			var endDate = new Date($("#date2").val());
			console.log("start--" + startDate);
			var festival = [ "1-1", "5-1", "10-1" ];//法定节假日
			var listDate=[];
			for (var d = new Date(startDate.getTime()); d.getTime() <= endDate
					.getTime(); d.setDate(d.getDate() + 1)) {
				if (d.getDay() != 0
						&& d.getDay() != 6
						&& festival.indexOf((d.getMonth() + 1) + "-"
								+ d.getDate()) == -1) {
					//console.log(d);
					 listDate.push(d.toLocaleString());
					var time = d.toLocaleString().substring(0, 10);
					//console.log("time--"+time);
					$('#cc')
							.calendar(
									{
										formatter : function(d) {
											if (time == d.toLocaleString()
													.substring(0, 10)) {
												//console.log("true");
												return "<br/>"
														+ d.getDate()
														+ '<div id="cs1" style="position:absolute; top:5px; right:3px; width:60px;color:blue;background-color:red;">选中</div>';
											} else {
												return "<br/>"
														+ d.getDate()
														+ '<div id="cs1" style="position:absolute; top:5px; right:3px; width:60px;">暂无</div>';
											}
										}
									});
				}
			}
			console.log("date-->"+listDate);
			$("#listDate").val(listDate);
		}
	</script>
	<script type="text/javascript">
		$(function() {
			$('#cc')
					.calendar(
							{
								current : new Date(),
								formatter : function(date) {
									//console.log("d---"+date.getMonth()+"---"+date.getDate()+"--"+"--xx--"+date.getYear());
									var time = date.getMonth() + ":"
											+ date.getDate();
									var MonthNextFirstDay = new Date(date
											.getFullYear(), date.getMonth(), 1);
									var FirstDay = new Date(date.getFullYear(),
											date.getMonth() - 1, 1);
									var lastDay = new Date(
											MonthNextFirstDay - 86400000);

									$("#date").val(
											date.getFullYear() + "-"
													+ date.getMonth());
									$("#date2").val(
											lastDay.toLocaleDateString());
									$("#date1").val(
											FirstDay.toLocaleDateString());
									//console.log("time--"+time);
									$.ajax({
												url:'${path}/work/toCalendar',
												type:"post",
												dataType:"json",
												success:function(result){
													//var result = eval('('+ result +')');
													console.log("rs-->"+result);
													if ("2018-10-06" == result.DAY) {
															//console.log("true");
															return "<br/>"
																	+ date.getDate()
																	+ '<div id="cs" style="position:absolute; top:5px; right:3px; width:60px;">'+放100余100+'</div>';
														} else {
															//console.log("false");
															return "<br/>"
																	+ date.getDate()
																	+ '<div id="cs1" style="position:absolute; top:5px; right:3px; width:60px;">暂无</div>';
														}
												}
											});
								}
							});
		});

		$('#cc').calendar(
				{
					onSelect : function(date) {
						alert(date.getFullYear() + ":" + (date.getMonth() + 1)
								+ ":" + date.getDate());
						$('#dlg').dialog('open').dialog('setTitle','回收号数');
					}
				});
	</script>
	<script type="text/javascript">
		
	</script>
</body>
</html>