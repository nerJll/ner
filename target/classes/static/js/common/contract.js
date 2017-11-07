//通用函数：获取当前项目路径
function propath() {
	// 获取项目路径信息
	var curWwwPath = window.document.location.href;
	var pathName = window.document.location.pathname;
	var pos = curWwwPath.indexOf(pathName);
	var localhostPath = curWwwPath.substring(0, pos);
	var projectName = pathName
			.substring(0, pathName.substr(1).indexOf('/') + 1);

	return localhostPath + projectName;
}
//显示输入的的值
function doSearch() {
		//alert('You input: ' + value);
		//$.messager.alert('您输入值为：',value);
		openwindow("http://www.baidu.com","百度",700,500)
}

function openwindow(url,name,iWidth,iHeight){
	var url; //转向网页的地址;
	var name; //网页名称，可为空;
	var iWidth; //弹出窗口的宽度;
	var iHeight; //弹出窗口的高度;
	//window.screen.height获得屏幕的高，window.screen.width获得屏幕的宽
	var iTop = (window.screen.height-30-iHeight)/2; //获得窗口的垂直位置;
	var iLeft = (window.screen.width-10-iWidth)/2; //获得窗口的水平位置;
	window.open(url,name,'height='+iHeight+',,innerHeight='+iHeight+',width='+iWidth+',inner	Width='+iWidth+',top='+iTop+',left='+iLeft+',toolbar=no,menubar=no,scrollbars=auto,resizeable=no,location=no,status=no');
}

//清空表格
function clearTab(tabid){
	var item = $('#'+tabid).datagrid('getRows');
    for (var i = item.length - 1; i >= 0; i--) {    
        var index = $('#'+tabid).datagrid('getRowIndex', item[i]);    
        $('#'+tabid).datagrid('deleteRow', index);    
    } 
}

//表单提交查询
function submitForm() {
		clearTab("pact1");
		clearTab("plan1");
		var saleorg = $("#saleorg").val()==null?'':$("#saleorg").val();
		var pactno = $("#pactno").val();
		var purno = $("#purno").val();
		var prono = $("#prono").val();
		var custom = $("#custom").combobox('getValue');
		var state = $("#state").combobox('getValue');
		var statime = $("#statime").val();
		var endtime = $("#endtime").val();
		//alert(saleorg+pactno+purno+prono+custom+state1+statime+endtime)
		$('#pact1').datagrid({
			url : propath()+"/contract/findContractSelective?"+"saleorg="+saleorg
					+"&pactno="+pactno+"&purno="+purno
					+"&prono="+prono+"&custom="+custom
					+"&state="+state
					+"&statime="+statime+"&endtime="+endtime,
			columns : [ [ {field : 'contractNo',title : '合同编码',width :80}, 
				{field : 'purchaseNo',title : '客户采购编码',width : 80},
				{field : 'saleOrg',title : '销售组织',width : 80}, 
				{field : 'customerNo',title : '客户编码',width : 80}, 
				{field : 'customerName',title : '客户名称',width : 80}, 
				{field : 'sum',title : '金额	',width : 100}, 
				{field : 'currency',title : '货币',width : 50}, 
				{field : 'paymentWay',title : '付款方式',width : 80}, 
				{field : 'paymentTerm',title : '付款条件',width : 80}, 
				{field : 'employee',title : '销售雇员',width : 80}, 
				{field : 'staTime',title : '有效期从',formatter : formatDate,width : 110}, 
				{field : 'endTime',title : '有效期至',formatter : formatDate,width : 110}, 
				{field : 'state',title : '状态',width : 80} 
				] ]
		}); 
	}
	
	//清空表单
	function clearForm() {
		$('#ff').form('clear');
	}
	//格式化日期
	function formatDate(value){
	    var unixTimestamp = new Date(value);  
	    return unixTimestamp.format("yyyy年MM月dd日"); 
	 }
	function formatDateModi(value){
	    var unixTimestamp = new Date(value); 
	    return unixTimestamp.format("yyyy-MM-dd"); 
	 }
	//日期转换工具
	Date.prototype.format = function (format) // author: meizz
	{
	    var o = {
	        "M+": this.getMonth() + 1, // month
	        "d+": this.getDate(),    // day
	        "h+": this.getHours(),   // hour
	        "m+": this.getMinutes(), // minute
	        "s+": this.getSeconds(), // second
	        "q+": Math.floor((this.getMonth() + 3) / 3),  // quarter
	        "S": this.getMilliseconds() // millisecond
	    };
	    if (/(y+)/.test(format))
	        format = format.replace(RegExp.$1,
	                (this.getFullYear() + "").substr(4 - RegExp.$1.length));
	    for (var k in o)
	        if (new RegExp("(" + k + ")").test(format))
	            format = format.replace(RegExp.$1,
	                    RegExp.$1.length == 1 ? o[k] :
	                        ("00" + o[k]).substr(("" + o[k]).length));
	    return format;
	};
	
	//页面加载完启动
	$(function(){
		if(!!window.ActiveXObject || "ActiveXObject" in window ||(navigator.userAgent.indexOf("Edge") > -1)){
			$.messager.alert("提示消息","当前浏览器对数据处理兼容性不是太好，建议换其他浏览器访问以保证数据的准确性。")
		}
		/*var contractDetailId=new Array(2)
		contractDetailId[0]="Saab"
		contractDetailId[1]="Volvo"
		var contractPlans=new Array(2)
		contractPlans[0]="Saab"
		contractPlans[1]="Volvo"
		$.ajax({
			url:'${ctx}/pact/putPactInfo',
			type:'post',
			data:{
				'contractId':1,
				'contractState':2,
				'contractDetailId':contractDetailId,
				'contractPlans':contractPlans
			},
			dataType:'json',
			success:function(data){
				alert(data)
			}
			
		})*/
		
		//合同信息赋值
		$('#pact1').datagrid({
			onClickRow: function (index, row) { 
					// alert(row.contractNo)
					$('#plan1').datagrid({
					url : propath()+'/pact/getfalseplan',
					columns : [ [ {field : 'contractItem',title : '合同项目',width : 100}, 
						{field : 'planNo',title : '计划号',width : 100}, 
						{field : 'planDate',title : '计划日期',formatter : formatDate,width : 100}, 
						{field : 'materielNo',title : '物料编码',width : 100}, 
						{field : 'materielDes',title : '物料描述',width : 100}, 
						{field : 'mount',title : '数量	',width : 100}, 
						{field : 'unit',title : '单位',width : 100}, 
						{field : 'unitPrice',title : '单价',width : 100}, 
						{field : 'sum',title : '金额',width : 100}, 
						{field : 'salesOrderNo',title : '销售订单',width : 100}, 
						{field : 'deliveryOrderNo',title : '交货单',width : 100} 
						] ]
			});
				 },
			url : propath()+'/contract/listAllContract',
			columns : [ [ {field : 'contractNo',title : '合同编码',width :80}, 
				{field : 'purchaseNo',title : '客户采购编码',width : 80},
				{field : 'saleOrg',title : '销售组织',width : 80}, 
				{field : 'customerNo',title : '客户编码',width : 80}, 
				{field : 'customerName',title : '客户名称',width : 80}, 
				{field : 'sum',title : '金额	',width : 100}, 
				{field : 'currency',title : '货币',width : 50}, 
				{field : 'paymentWay',title : '付款方式',width : 80}, 
				{field : 'paymentTerm',title : '付款条件',width : 80}, 
				{field : 'employee',title : '销售雇员',width : 80}, 
				{field : 'staTime',title : '有效期从',formatter : formatDate,width : 110}, 
				{field : 'endTime',title : '有效期至',formatter : formatDate,width : 110}, 
				{field : 'state',title : '状态',width : 40} 
				] ]
		});
		//客户信息赋值
		$.ajax({
			type:"get",
			url:"http://portal.aikosolar.com/aiko-crm/sapconfig/execute?functionCode=ZSDCRM005",
			cache:true,
			success:function(data){
				var data1 = [{"text": " ","id":""}]
			 	for(var i=0; i<data.data.result.length; i++){
			 		var code = data.data.result[i].code
			 		var name = data.data.result[i].name
			 		var saleorg1 = code + "\n" + name
			 		data1.push({"text":saleorg1,"id":name})
			 	}
			 	$("#custom").combobox("loadData", data1)
			}
		}) 
	}) 
	
	// 输入校验函数
	// 小数点后保留两位
	function clearNoNum(obj){
        obj.value = obj.value.replace(/[^\d.]/g,"");  //清除“数字”和“.”以外的字符
        obj.value = obj.value.replace(/\.{2,}/g,"."); //只保留第一个. 清除多余的
        obj.value = obj.value.replace(".","$#$").replace(/\./g,"").replace("$#$",".");
        obj.value = obj.value.replace(/^(\-)*(\d+)\.(\d\d).*$/,'$1$2.$3');//只能输入两个小数
        if(obj.value.indexOf(".")< 0 && obj.value !=""){//以上已经过滤，此处控制的是如果没有小数点，首位不能为类似于 01、02的金额
          obj.value= parseFloat(obj.value);
        }
     }
	// 计算
	function calSum(obj) {
		var unitCost = $(obj).val()
		var mount = $(obj).parent().prev().prev().children().val()
		$(obj).parent().next().children().val(new Number(mount) * new Number(unitCost))
	}
	
	// 值改变时间框架协议
	function onlyInt(obj) {
		//value=value.replace(/[^\d]/g,'')
		value = $(obj).val()
		newValue = value.replace(/[^\d]/g,'')
		$(obj).val(newValue)
	}
	