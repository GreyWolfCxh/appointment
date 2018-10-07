<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta name="decorator" content="default" />
<title>增加违章类型</title>
<script type="text/javascript">
	
</script>

<style>
			
			 .radioSpan {
      position: relative;
      border: 1px solid #95B8E7;
      background-color: #fff;
      vertical-align: middle;
      display: inline-block;
      overflow: hidden;
      white-space: nowrap;
      margin: 0;
      padding: 0;
      -moz-border-radius: 5px 5px 5px 5px;
      -webkit-border-radius: 5px 5px 5px 5px;
      border-radius: 5px 5px 5px 5px;
      display:block;
    }


		</style>
		<!--上传文件-->
		<style type="text/css">
        .img-div{
            border: 1px solid #ddd;
            float: left;
            line-height: 1;
            margin-left: 5px;
            overflow: hidden;
        }

    </style>
<style type="text/css">
</style>
</head>
<body>

		<div style="margin:20px 0;"></div>
	<div class="easyui-panel" title="新增违章类型" style="width:100%">
		<div style="padding:10px 60px 20px 60px">
	    <form id="ff" method="post" enctype="multipart/form-data" action="${path}/illegal/addIllegalType">
	    	<table cellpadding="5">
	    		<tr>
	    			<th>基本信息
	    			<hr style="" width="1000%"/>
	    			</th>
	    			
	    		</tr>
	    		<tr>
	    			<td>违章类型名称:</td>
	    			<td><input class="easyui-textbox" placeholder="违章处理预约" type="text" name="ILLEGAL_NAME" data-options="required:true"></input></td>
	    		</tr>
	    		<tr>
	    			<td>排序:</td>
	    			<td><input class="easyui-textbox" type="text" name="SORT" data-options="required:true"></input></td>
	    		</tr>
	    		<tr>
	    			<td>是否启用:</td>
	    			<td>
	    				<span class="radioSpan">
	    					<input type="radio" name="ILLEGAL_STATUS" value="是">是</input>
               			 	<input type="radio" name="ILLEGAL_STATUS" value="否">否</input>
               			</span>
	    			</td>
	    		</tr>
	    		
	    		<tr>
	    			<td>公众号配置：</td>
	    			<td style="text-align:left">
           			 <span class="radioSpan">
               			 <input type="checkbox" name="PUBLIC_STATUS" value="查询违章">查询违章</input>
               			 <input type="checkbox" name="PUBLIC_STATUS" value="固定窗口">固定窗口</input>
               			  <input type="checkbox" name="PUBLIC_STATUS" value="补充资料">补充资料</input>
            		</span>
        			</td>


	    		</tr>
	    		<tr>
	    			<th>
	    				办理提示
	    				<hr style="" width="1000%"/>
	    			</th>
	    		</tr>
	    		<tr>
	    			<td>办理提示:</td>
	    			<td style="width: 269px;text-align:left">
				      <textarea rows="6"  cols="50" name="TIPS" height="71px"  id="arr_content" style="width:269px;" maxlength="200" class="easyui-validatebox textarea " validtype="length[0,200]"  invalidMessage="最大长度500位" oninput="return LessThan(this);" onchange="return LessThan(this);" onpropertychange="return LessThan(this);"></textarea>
				  		<font color="gray"> <label id="txtNum">可以输入200个字 </label> </font> 
	    			</td>
	    		</tr>
	    		<tr>
	    			<td>文件模板:</td>
	    			<td>
						    <div style="margin:20px 0 10px 0;"></div>
								<div class="easyui-panel" style="width:700px;height:200px;padding:10px;">
									<a href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="addFile()">添加</a>
									<input type="file" id="xdaTanFileImg"  multiple="multiple"  name="fileAttach" style="display:none;" onchange="xmTanUploadImg(this)"/>
							    	<div class="img-box" id="imgboxid">
							
							    	</div>
					            	 <div id="xmTanDiv"></div><br/>
					           		 <div id="errordiv"   style="margin-top:15px;width:100%;text-align:center;">
						</div>
	    			</td>
	    		</tr>
	    		<tr>
	    			<th>查询配置
	    				<hr style="" width="1000%"/>
	    			</th>
	    		</tr>
	    		<tr>
	    			<td>查询子段:</td>
	    			<td>
	    				 <div style="margin:20px 0 10px 0;"></div>
								<div class="easyui-panel" style="width:700px;height:200px;padding:10px;">
							<ul id="fields">
							</ul>
							<a href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="newFiled()">添加</a>
						</div>
	    			</td>
	    		</tr>
	    		<tr>
	    			<td>数据源:</td>
	    			<td>
	    				 <div style="margin:20px 0 10px 0;"></div>
								<div class="easyui-panel" style="width:700px;height:200px;padding:10px;">
							<ul id="datas"> 
							</ul>
							<a href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="newDataSource()">添加</a>
						</div>
	    			</td>
	    		</tr>
	    		<tr>
	    			<th>补充资料
	    			<hr style="" width="1000%"/>
	    			</th>
	    		</tr>
	    		<tr>
	    			<td>补充子段:</td>
	    			<td>
	    				 <div style="margin:20px 0 10px 0;"></div>
								<div class="easyui-panel" style="width:700px;height:200px;padding:10px;">
							<ul id="afields">
							</ul>
							<a href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="addFiled()">添加</a>
						</div>
	    			</td>
	    		</tr>
	    	</table>
	    </form>
	    <div style="text-align:center;padding:5px">
	    	<a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitForm()">Submit</a>
	    	<a href="javascript:void(0)" class="easyui-linkbutton" onclick="clearForm()">Clear</a>
	    </div>
	    </div>
	</div>
 
 
 
 
<!--增加字段表单-->
<div id="dlg" class="easyui-dialog" style="width:400px;height:380px;padding:10px 20px"
		closed="true" buttons="#dlg-buttons">
		<table>

			<tr>
				<td>
				<input type="checkbox" name="field" value="车牌号,CAR_NUM">车牌号,CAR_NUM</input>
				<input type="checkbox" name="field" value="通知书号码,NUMBER">通知书号码,NUMBER</input>
				</td>
			</tr>
			<tr>
				<td>
				<input type="checkbox" name="field" value="当事人姓名,USER_NAME">当事人姓名,USER_NAME</input>
				<input type="checkbox" name="field" value="身份证号码,USER_CARDID">身份证号码,USER_CARDID</input>
				</td>
			</tr>
		</table>
</div>
<div id="dlg-buttons">
	<a href="#" class="easyui-linkbutton" iconCls="icon-ok" onclick="saveField()">Save</a>
	<a href="#" class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$('#dlg').dialog('close')">Cancel</a>
</div>

 <!--增加数据源表单-->
<div id="dlg1" class="easyui-dialog" style="width:400px;height:380px;padding:10px 20px"
		closed="true" buttons="#dlg-buttons">
		<table>
			<tr>
				<td>
				<input type="checkbox" name="data" value="现场执法表.ILLEGAL">现场执法表.ILLEGAL</input>
				<input type="checkbox" name="data" value="非现场执法表.FILLEGAL">非现场执法表.FILLEGAL</input>
				</td>
			</tr>
			<tr>
				<td>
				<input type="checkbox" name="data" value="高速收费表,HSHU">高速收费表,HSHU</input>
				<input type="checkbox" name="data" value="部门表,DEPT">部门表,DEPT</input>
				</td>
			</tr>
		</table>
</div>
<div id="dlg-buttons">
	<a href="#" class="easyui-linkbutton" iconCls="icon-ok" onclick="saveDataSource()">Save</a>
	<a href="#" class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$('#dlg1').dialog('close')">Cancel</a>
</div>

<!--增加补充字段表单-->
<div id="dlg2" class="easyui-dialog" style="width:400px;height:380px;padding:10px 20px"
		closed="true" buttons="#dlg-buttons">
		<table>
			<tr>
				<td>
				<input type="checkbox" name="afield" value="车牌号,CAR_NUM">车牌号,CAR_NUM</input>
				<input type="checkbox" name="afield" value="通知书号码,NUMBER">通知书号码,CAR_NUM</input>
				</td>
			</tr>
			<tr>
				<td>
				<input type="checkbox" name="afield" value="当事人姓名,USER_NAME">当事人姓名,USER_NAME/input>
				<input type="checkbox" name="afield" value="身份证号码,USER_CARDID">身份证号码,USER_CARDID</input>
				</td>
			</tr>
		</table>
</div>
<div id="dlg-buttons">
	<a href="#" class="easyui-linkbutton" iconCls="icon-ok" onclick="saveAField()">Save</a>
	<a href="#" class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$('#dlg2').dialog('close')">Cancel</a>
</div>
 
 <script type="text/javascript">
 	
 	function addFile(){
 		 $("#xdaTanFileImg").click();
 	}
    //选择图片，马上预览
    function xmTanUploadImg(obj) {

        var fl=obj.files.length;
        for(var i=0;i<fl;i++){
            var file=obj.files[i];
            var reader = new FileReader();
			var name = obj.files[i].name;
			console.log("n-->"+name);
            //读取文件过程方法

            reader.onloadstart = function (e) {
                console.log("开始读取....");
            }
            reader.onprogress = function (e) {
                console.log("正在读取中....");
            }
            reader.onabort = function (e) {
                console.log("中断读取....");
            }
            reader.onerror = function (e) {
                console.log("读取异常....");
            }
            reader.onload = function (e) {
                console.log("成功读取....");

                var str='<input style="width:150px;height:30px;" value="'+name+'"/>';
                var oimgbox=document.getElementById("imgboxid");
                var ndiv=document.createElement("div");

                ndiv.innerHTML=str;
                ndiv.className="img-div";
                oimgbox.appendChild(ndiv);
               
            }

            reader.readAsDataURL(file);
//alert(1);
        }

    }

/*弹出增加字段表单*/
function newFiled(){
	$('#dlg').dialog('open').dialog('setTitle','增加字段');
	//全不选
	  $("input[name=field]:checkbox").each(function () {
	                $(this).prop("checked", false);
	            });
}
 
/*增加*/
function saveField(){
$("#fields").html("");
	 $.each($('input[name=field]:checkbox'),function(){
                if(this.checked){
                	if($('input[name=field]:checked')){
                		var val=$(this).val();
                		if(val!==null || val!=undefined){
                			
                			var str='<input style="width:150px;height:30px;" name="zfiled" value="'+val+'"/>';
			                var oimgbox=document.getElementById("fields");
			                var ndiv=document.createElement("div");
			                ndiv.innerHTML=str;
			                 ndiv.className="img-div";
			                oimgbox.appendChild(ndiv);
                		}
                	}
                }
            });
    $('#dlg').dialog('close');

}

/*弹出补充字段表单*/
function addFiled(){
	$('#dlg2').dialog('open').dialog('setTitle','补充字段');
	//全不选
	  $("input[name=afield]:checkbox").each(function () {
	                $(this).prop("checked", false);
	            });
}
 
/*增加*/
function saveAField(){
 $("#afields").html("");
 $.each($('input[name=afield]:checkbox'),function(){
                if(this.checked){
                	if($('input[name=afield]:checked')){
                		
                		var val=$(this).val();
                		if(val!==null || val!=undefined){
                			
                			var str='<input style="width:150px;height:30px;" name="addField" value="'+val+'"/>';
			                var oimgbox=document.getElementById("afields");
			                var ndiv=document.createElement("div");
			                ndiv.innerHTML=str;
			                 ndiv.className="img-div";
			                oimgbox.appendChild(ndiv);
                		}
                	}
                }
            });
            $('#dlg2').dialog('close');
}

/*弹出增加数据源表单*/
function newDataSource(){
	$('#dlg1').dialog('open').dialog('setTitle','数据源');
	//全不选
	  $("input[name=data]:checkbox").each(function () {
	                $(this).prop("checked", false);
	            });
}
 
/*增加*/
function saveDataSource(){
	$("#datas").html("");
	 $.each($('input[name=data]:checkbox'),function(){
                if(this.checked){
                	if($('input[name=data]:checked')){
                		
                		var val=$(this).val();
                		if(val!==null || val!=undefined){
                			
                			var str='<input style="width:150px;height:30px;" name="addData" value="'+val+'"/>';
			                var oimgbox=document.getElementById("datas");
			                var ndiv=document.createElement("div");
			                ndiv.innerHTML=str;
			                 ndiv.className="img-div";
			                oimgbox.appendChild(ndiv);
                		}
                	}
                }
            });
     $('#dlg1').dialog('close');
}
 
 
</script>

 
	<script>
		function submitForm(){
			$('#ff').form('submit');
		}
		function clearForm(){
			$('#ff').form('clear');
		}
		function LessThan(oTextArea){
		    //获得textarea的maxlength属性
		    var MaxLength=oTextArea.getAttribute("maxlength");
		    var num=MaxLength-oTextArea.value.length;  
		    if(num==MaxLength){
		           $('#txtNum').attr('visi','yes').show();
		           $('#txtNum').html("<font font-size='13px'>可以输入200个字</font>");
		    }else{
		           $('#txtNum').attr('visi','yes').show();
		           $('#txtNum').html("<font font-size='13px'>还能输入："+num+"字</font>");
		    }
		    //返回文本框字符个数是否符号要求的boolean值
		    return oTextArea.value.length < oTextArea.getAttribute("maxlength");
		}

	</script>
</body>
	</body>
</html>
