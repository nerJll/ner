var active={};
//查询监听，重载表格
$('.layui-btn').on('click', function(){
    var type = $(this).data('type');
    active[type] ? active[type].call(this) : '';
});

function renderTable(params){
	layui.use('table', function(){
		var table=layui.table;
		var where={};
		var inputIds=params.inputIds;
		var constWhere=params.where;
		for(var i in constWhere){
			where[i]=constWhere[i];//常量查询条件值
		}
		for(var i in inputIds){
			where[inputIds[i]]=$("#"+inputIds[i]).val();//抓取输入框的值为查询条件
		}		
		var initParams={
			elem: '#'+params.id	
			,page: true	 //是否加载分页
		    ,height: 350 
		    ,limits:30	//每页数量
		    ,response:{
		    	statusName: 'status' //数据状态的字段名称，默认：code
		   		,statusCode: 1 //成功的状态码，默认：0
		   		,msgName: 'message' //状态信息的字段名称，默认：msg
		   		,countName: 'total' //数据总数的字段名称，默认：count
		   		,dataName: 'data' //数据列表的字段名称，默认：data
		    }
		    ,where:where	//查询条件
		    ,sortReload:true //排序切换，是否重载表格
		    ,toolCallback:function(obj){}
		};
		$.extend(initParams,params);
		//渲染表格
		table.render(initParams);
		//添加查询重载事件
		active[initParams.id]=function(){
			//获取新的查询条件
			for(var i in inputIds){
				where[inputIds[i]]=$("#"+inputIds[i]).val();
			}
			table.reload(initParams.id,{
				where: where
			});
		};
		//监听排序切换
		if(initParams.sortReload){
			table.on('sort('+initParams.id+')',function(obj){
				//保持原查询条件，加上新的排序
				var sort={'sort_field':obj.field,'sort_type':obj.type};
				$.extend(where,sort);
				layui.table.reload(initParams.id,{
					initSort:obj,
					where:where
				});
			});
		}		
		//监听工具条
		table.on('tool('+initParams.id+')', function(obj){
			initParams.toolCallback(obj);
		});
		
	});

	
}