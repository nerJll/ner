function getDataFromSap(selectId, url, params, showLoading, loadingMsg, closeLoading) {
	if(showLoading && showLoading === true){
		if(!loadingMsg){
			loadingMsg = "\u6B63\u5728\u52A0\u8F7D\u6570\u636E,\u8BF7\u7A0D\u5019...";
		}
		$.loader.loading(loadingMsg);
	}
	return $.ajax({
		url : url,
		data : params,
		async : true,
		dataType : "JSON",
		type : "POST",
		success : function(data) {
			try {
				if (data.status == "1") {
					var result = data.data.result;
					if (result && result.length && result.length > 0) {
						$("#"+selectId).combobox({data : result, valueField:"code", textField:"name"});
					}
				} else {
					$.messager.alert("\u4FE1\u606F\u63D0\u793A", "SAP\u63A5\u53E3\u6570\u636E\u52A0\u8F7D\u5931\u8D25\uFF01");
				}
			} catch (e) {
				
			}
			if (closeLoading && closeLoading === true) {
				$.loader.loaded();
			}
		}
	});
	/*
	$.post(url, params, function(data) {
		try {
			if (data.status == "1") {
				var result = data.data.result;
				if (result && result.length && result.length > 0) {
					$("#"+selectId).combobox({data : result, valueField:"code", textField:"name"});
				}
			} else {
				$.messager.alert("\u4FE1\u606F\u63D0\u793A", "SAP\u63A5\u53E3\u6570\u636E\u52A0\u8F7D\u5931\u8D25\uFF01");
			}
		} catch (e) {
			
		}
		if (closeLoading && closeLoading === true) {
			$.loader.loaded();
		}
	});
	*/
}