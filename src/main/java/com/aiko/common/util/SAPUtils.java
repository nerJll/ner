package com.aiko.common.util;

import java.util.ArrayList;
import java.util.List;

import com.aiko.config.sap.model.jco.JcoParams;
import com.aiko.config.sap.model.jco.JcoResult;
import com.aiko.config.sap.util.SapApi;
import com.aiko.deliveryplan.dto.AikoDeliveryPlan;
import com.aiko.pact.dto.AikoContract;
import com.aiko.pactdetail.dto.AikoContractDetail;

/**
 * @author Jianglinle
 * @date 2017年10月30日 下午5:02:48
 * @version 1.0.0
 * @aiko-
 */
public class SAPUtils {
	public static void main(String[] args) {
		AikoContract contract = new AikoContract();
		List<AikoDeliveryPlan> plans = new ArrayList<>();
		tiJiaoSAP(contract,plans);
	}
	
	public static void tiJiaoSAP(AikoContract contract,
			List<AikoDeliveryPlan> plans){
		long start = System.currentTimeMillis();
		
		// 接口名称 ZSDCRM011TEST ZSDCRM012
		String functionName = "ZSDCRM011TEST";
		
		// 参数设置
		JcoParams params = new JcoParams();
		//params.setValue("ZAK_MM_PR", (String)null);
		//params.setValue("TESTRUN", (String)null);
		
		// ITEMX参数
		List<JcoParams> itemxList = new ArrayList<JcoParams>();
		//params.setValue("ITEMX", itemxList);
		/*itemxList.add(
			new JcoParams()
			.setValue("VBELN", contract.getContractNo())
			.setValue("VKGRP", contract.getSaleGroup())
			.setValue("VKORG", contract.getSaleOrg())
			.setValue("KUNNR", contract.getCustomerNo())
			.setValue("WAERK", contract.getCurrency())
			.setValue("ZLSCH", contract.getPaymentWay())
			.setValue("ZTERM", contract.getPaymentTerm())
			.setValue("PERNR", contract.getEmployee())
			.setValue("GUEBG", contract.getStaTime())
			.setValue("GUEEN", contract.getEndTime())
			.setValue("BSTZD", contract.getServiceModel())
			.setValue("AUDAT", contract.getCreateTime())
			.setValue("VTWEG", contract.getSaleWay())
			.setValue("BSTKD", contract.getSaleFunc())
			.setValue("INCO1", contract.getTradeTerm())*/
			/*.setValue("VBELN", "123")
			.setValue("VKGRP", "123")
			/*.setValue("VBELN", "123")*/
			/*.setValue("VKGRP", "123")
			.setValue("VKORG", "123")
			.setValue("KUNNR", 123)
			.setValue("WAERK", "123")
			.setValue("ZLSCH", "123")
			.setValue("ZTERM", 123)
			.setValue("PERNR", 123)
			.setValue("GUEBG", "2017-09-01")
			.setValue("GUEEN", "2017-09-11")
			.setValue("BSTZD", "123")
			.setValue("AUDAT", "2017-09-01")
			.setValue("VTWEG", "123")
			.setValue("BSTKD", 123)
			.setValue("INCO1", "123")
		);*/
		
		// PRACCOUNT参数
		/*List<JcoParams> praccountList = new ArrayList<JcoParams>();
		params.setValue("PRACCOUNT", praccountList);
		praccountList.add(
			new JcoParams()
			.setValue("contractDetailId", details.get(0).getContractDetailId())
			.setValue("contractDetailNo", details.get(0).getContractDetailNo())
			.setValue("materielNo", details.get(0).getMaterielNo())
			.setValue("materielDes", details.get(0).getMaterielDes())
			.setValue("mount", details.get(0).getMount())
			.setValue("unit", details.get(0).getUnit())
			.setValue("unitCost", details.get(0).getUnitCost())
			.setValue("sum", details.get(0).getSum())
			.setValue("orderState", details.get(0).getOrderState())
			.setValue("deliveryState", details.get(0).getDeliveryState())
			.setValue("billState", details.get(0).getBillState())
			.setValue("silicon", details.get(0).getSilicon())
			.setValue("mainGrid", details.get(0).getMainGrid())
			.setValue("tech", details.get(0).getTech())
			.setValue("convertRate", details.get(0).getConvertRate())
			.setValue("grade", details.get(0).getGrade())
			.setValue("contractId", details.get(0).getContractId())
		);*/
		
		// PRACCOUNT参数
		List<JcoParams> praccountxList = new ArrayList<JcoParams>();
		//params.setValue("PRACCOUNTX", praccountxList);
		/*for(int i=0; i<plans.size(); i++){
			praccountxList.add(
					new JcoParams()
					/*.setValue("POSNR", "123")
					.setValue("ETENR", "123")
					.setValue("POSNR", 123)*/
					/*.setValue("ETENR", 123)
					.setValue("EDATU", "2017-09-01")
					.setValue("WMENG", 123)
					.setValue("VRKME", "123")
					.setValue("KBETR", "123")
					.setValue("KBETR", 123)
				);
		}*/
		
		JcoResult result = SapApi.executeFunction(functionName, params);
		long end=System.currentTimeMillis();
		
		System.out.println(result.getExportParameterList().toXML());
		System.out.println(result.getTableParameterList().toXML());
		
		System.out.println("============"+(end-start));
		
	}
	
	public static void tiJiaoSAP2(){
		// 接口名称
		String functionName = "ZSDCRM012";

		// 参数设置
		JcoParams params = new JcoParams();

		// 执行结果
		JcoResult result = SapApi.executeFunction(functionName, params);

		boolean flag = result.isSuccess();
		System.out.println("执行结果：" + (flag ? "成功" : "失败"));
		System.out.println("执行信息：" + result.getTipsMessage());
		if (flag) {
			System.out.println(result.getJCoTableFromTableParameterList("TVKOT").toXML());
		}
	}
}
