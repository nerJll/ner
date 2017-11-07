package com.aiko.common.util;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import com.aiko.oa.CreateXu;
import com.aiko.oa.workflow.WorkflowBaseInfo;
import com.aiko.oa.workflow.WorkflowDetailTableInfo;
import com.aiko.oa.workflow.WorkflowMainTableInfo;
import com.aiko.oa.workflow.WorkflowRequestInfo;
import com.aiko.oa.workflow.WorkflowRequestTableField;
import com.aiko.oa.workflow.WorkflowRequestTableRecord;
import com.aiko.oa.workflow.WorkflowServicePortTypeProxy;
import com.aiko.pact.dto.AikoContract;
import com.aiko.pactdetail.dto.AikoContractDetail;

/** 
* @author Jianglinle
* @date 2017年10月26日 下午2:18:43 
* @version 1.0.0
* @aiko-
*/
public class OAUtils {
	//creatId=1551,638
	
	public static final Logger log = Logger.getLogger(OAUtils.class); 
	
	//补充变更
	public static void buChongBG(AikoContract contract,List<AikoContractDetail> details){

		List<Map<String,String>> itemTableMap = null;
		Map<String,String> mainTableMap =null;
		mainTableMap =new HashMap<String, String>();
    	mainTableMap.put("CONTRACT_NO", "1919191919");
    	itemTableMap=new ArrayList<Map<String,String>>();
    	for(int i=0;i<7;i++){
    		Map<String,String> map = new HashMap<String, String>();
    		itemTableMap.add(map);
    	}
    	String workflowId ="639";
    	int createId=1551;
		String result = createWorkFlowBG(contract,details,mainTableMap, itemTableMap,workflowId,createId);
		System.out.print(result);
	}
	
	public static String createWorkFlowBG(AikoContract contract,List<AikoContractDetail> details,Map<String,String> mainTable,List<Map<String,String>> itemTable,String workflowId,int createId){
		String result="0";
		WorkflowMainTableInfo workflowMainTableInfo=null;
		WorkflowRequestInfo requestInfo = new WorkflowRequestInfo();
		WorkflowBaseInfo workflowBaseInfo = new WorkflowBaseInfo();
		workflowBaseInfo.setWorkflowId(workflowId);//流程对应的id
		
		requestInfo.setCanEdit(true);
		requestInfo.setCanView(true);
		requestInfo.setWorkflowBaseInfo(workflowBaseInfo);
		
		try {
			if(mainTable!=null && !mainTable.isEmpty()){
				//主表单信息
				//主表字段信息
				//WorkflowRequestTableField[] wtfs = new WorkflowRequestTableField[mainTable.size()];//mainTable.size()
				WorkflowRequestTableField[] wrti = new WorkflowRequestTableField[30];
				wrti[0] = new WorkflowRequestTableField();
				wrti[0].setFieldName("apply_user");// 申请人  
				wrti[0].setFieldValue("1551");// 1551--陈明霞 1552-任博文 1548--姜林乐
				wrti[0].setView(true);
				wrti[0].setEdit(true);
				
				wrti[1] = new WorkflowRequestTableField();
				wrti[1].setFieldName("apply_user_no");// 申请人工号
				wrti[1].setFieldValue("111");
				wrti[1].setView(true);
				wrti[1].setEdit(true);

				wrti[2] = new WorkflowRequestTableField();
				wrti[2].setFieldName("department");// 部门
				wrti[2].setFieldValue("11");
				wrti[2].setView(true);
				wrti[2].setEdit(true);

				wrti[3] = new WorkflowRequestTableField();
				wrti[3].setFieldName("position");// 职位
				wrti[3].setFieldValue("111");//
				wrti[3].setView(true);// 字段是否可见
				wrti[3].setEdit(true);// 字段是否可编辑

				wrti[4] = new WorkflowRequestTableField();
				wrti[4].setFieldName("company");// 所属公司
				wrti[4].setFieldValue("111");
				wrti[4].setView(true);
				wrti[4].setEdit(true);

				wrti[5] = new WorkflowRequestTableField();
				wrti[5].setFieldName("apply_date");// 申请日期
				wrti[5].setFieldValue(DateUtil.getDateFormat(contract.getCreateTime()));
				wrti[5].setView(true);
				wrti[5].setEdit(true);
				
				wrti[6] = new WorkflowRequestTableField();
				wrti[6].setFieldName("Purcontr_engine");// 采购合同引擎
				System.out.println(contract.getSaleFunc()+"--");
				wrti[6].setFieldValue("130221");// 
				//wrti[6].setFieldValue(contract.getSaleFunc()==""?"":contract.getSaleFunc());// 
				wrti[6].setView(true);// 字段是否可见
				wrti[6].setEdit(true);// 字段是否可编辑

				wrti[7] = new WorkflowRequestTableField();
				wrti[7].setFieldName("CONTRACT_NO");// 合同编号（合同标识）
				wrti[7].setFieldValue(contract.getContractNo()==""?"":contract.getContractNo());
				wrti[7].setView(true);
				wrti[7].setEdit(true);
				
				wrti[8] = new WorkflowRequestTableField();
				wrti[8].setFieldName("ISFORMATE");// 是否格式合同
				wrti[8].setFieldValue(contract.getIsformate());
				wrti[8].setView(true);
				wrti[8].setEdit(true);

				wrti[9] = new WorkflowRequestTableField();
				wrti[9].setFieldName("CONTRACT_TYPE");//合同类型
				wrti[9].setFieldValue(contract.getContractType());// 
				wrti[9].setView(true);// 
				wrti[9].setEdit(true);// 
						
				wrti[10] = new WorkflowRequestTableField();
				wrti[10].setFieldName("SERVICE_MODEL");// 业务模式
				wrti[10].setFieldValue(contract.getServiceModel());
				wrti[10].setView(true);
				wrti[10].setEdit(true);
					
				wrti[11] = new WorkflowRequestTableField();
				wrti[11].setFieldName("Change_Type");// 变更类型
				wrti[11].setFieldValue(contract.getContractNo()==""?"意向合同变更":"合同变更");
				wrti[11].setView(true);
				wrti[11].setEdit(true);

				wrti[12] = new WorkflowRequestTableField();
				wrti[12].setFieldName("Old_contractNum");//原合同编号
				wrti[12].setFieldValue(contract.getContractNo());// 
				wrti[12].setView(true);// 
				wrti[12].setEdit(true);// 

				wrti[13] = new WorkflowRequestTableField();
				wrti[13].setFieldName("SALE_ORG");//销售组织
				wrti[13].setFieldValue(contract.getSaleOrg());
				wrti[13].setView(true);
				wrti[13].setEdit(true);

				wrti[14] = new WorkflowRequestTableField();
				wrti[14].setFieldName("SALE_WAY");// 分销渠道
				wrti[14].setFieldValue(contract.getSaleWay());
				wrti[14].setView(true);
				wrti[14].setEdit(true);

				wrti[15] = new WorkflowRequestTableField();
				wrti[15].setFieldName("SALE_GROUP");//销售组
				wrti[15].setFieldValue(contract.getSaleGroup());// 
				wrti[15].setView(true);// 字段是否可见
				wrti[15].setEdit(true);// 字段是否可编辑

				wrti[16] = new WorkflowRequestTableField();
				wrti[16].setFieldName("EMPLOYEE");//销售雇员
				wrti[16].setFieldValue(contract.getEmployee());
				wrti[16].setView(true);
				wrti[16].setEdit(true);

				wrti[17] = new WorkflowRequestTableField();
				wrti[17].setFieldName("Supple_changeSum");// 补充/变更摘要
				//wrti[17].setFieldType("http:baidu_sylogo1.gif");
				//wrti[17].setFieldValue("http://www.baidu.com/img/baidu_sylogo1.gif");
				wrti[17].setFieldValue(contract.getResTwo());
				wrti[17].setView(true);
				wrti[17].setEdit(true);

				wrti[18] = new WorkflowRequestTableField();
				wrti[18].setFieldName("File_upload");// 附件上传
				wrti[18].setFieldType("http:baidu_sylogo1.gif");
				wrti[18].setFieldValue("http://www.baidu.com/img/baidu_sylogo1.gif");
				wrti[18].setView(true);
				wrti[18].setEdit(true);
				
				wrti[19] = new WorkflowRequestTableField();
				wrti[19].setFieldName("CONTRACT_ID"); // 合同id
				wrti[19].setFieldValue(contract.getContractId());
				wrti[19].setView(true);
				wrti[19].setEdit(true);

				wrti[20] = new WorkflowRequestTableField();
				wrti[20].setFieldName("PURCHASE_NO");// 客户采购编码
				wrti[20].setFieldValue(contract.getPurchaseNo());// 
				wrti[20].setView(true);// 字段是否可见
				wrti[20].setEdit(true);// 字段是否可编辑

				requestInfo.setRequestName("SD07-销售合同评审表（补充、变更协议）");
														
				//只有一个主表单
				WorkflowRequestTableRecord[] wrtri= new WorkflowRequestTableRecord[1];
				
				wrtri[0]=new WorkflowRequestTableRecord();
				wrtri[0].setWorkflowRequestTableFields(wrti);
				
				workflowMainTableInfo = new WorkflowMainTableInfo();
				workflowMainTableInfo.setRequestRecords(wrtri);
				
				requestInfo.setWorkflowMainTableInfo(workflowMainTableInfo);//主表单信息
			}
			
			
			//子表单信息 合同标的状态
			if(itemTable!=null && itemTable.size()>0){
				WorkflowRequestTableRecord[] dtrs= new WorkflowRequestTableRecord[details.size()];
				for(int i=0;i<details.size();i++){
					Map<String,String> map=itemTable.get(i);
					//一行
					WorkflowRequestTableRecord dtr = new WorkflowRequestTableRecord();
					//字段
					WorkflowRequestTableField[] wrti = new WorkflowRequestTableField[30];
					wrti[0] = new WorkflowRequestTableField();
					wrti[0].setFieldName("MATERIEL_NO");// 物料编码
					wrti[0].setFieldValue(details.get(i).getMaterielNo());
					wrti[0].setView(true);// 字段是否可见
					wrti[0].setEdit(true);// 字段是否可编辑

					wrti[1] = new WorkflowRequestTableField();
					wrti[1].setFieldName("MaterialName");// 物料名称
					wrti[1].setFieldValue(details.get(i).getMaterielDes());
					wrti[1].setView(true);
					wrti[1].setEdit(true);
					
					wrti[2] = new WorkflowRequestTableField();
					wrti[2].setFieldName("MOUNT");// 数量
					wrti[2].setFieldValue(details.get(i).getMount().toString());
					wrti[2].setView(true);
					wrti[2].setEdit(true);

					wrti[3] = new WorkflowRequestTableField();
					wrti[3].setFieldName("UNIT");// 单位
					wrti[3].setFieldValue(details.get(i).getUnit());//
					wrti[3].setView(true);// 字段是否可见
					wrti[3].setEdit(true);// 字段是否可编辑

					wrti[4] = new WorkflowRequestTableField();
					wrti[4].setFieldName("ORDER_STATE");// 订单状态
					wrti[4].setFieldValue(details.get(i).getOrderState());
					wrti[4].setView(true);
					wrti[4].setEdit(true);

					wrti[5] = new WorkflowRequestTableField();
					wrti[5].setFieldName("DELIVERY_STATE");// 交货状态
					wrti[5].setFieldValue(details.get(i).getDeliveryState());
					wrti[5].setView(true);
					wrti[5].setEdit(true);

					wrti[6] = new WorkflowRequestTableField();
					wrti[6].setFieldName("BILL_STATE");// 发票状态
					wrti[6].setFieldValue(details.get(i).getBillState());//
					wrti[6].setView(true);// 字段是否可见
					wrti[6].setEdit(true);// 字段是否可编辑
					
					wrti[7] = new WorkflowRequestTableField();
					wrti[7].setFieldName("CONTRACT_DETAIL_ID");// 合同详情id
					wrti[7].setFieldValue(details.get(i).getContractDetailId());//
					wrti[7].setView(true);// 字段是否可见
					wrti[7].setEdit(true);// 字段是否可编辑
				
					
					
					dtr.setWorkflowRequestTableFields(wrti);
					dtrs[i]=dtr;
					
				}
				
				WorkflowDetailTableInfo wdtf = new WorkflowDetailTableInfo();
				wdtf.setWorkflowRequestTableRecords(dtrs);
				
				//只有一个子表单
				WorkflowDetailTableInfo[] workflowDetailTableInfos = new WorkflowDetailTableInfo[1];
				workflowDetailTableInfos[0]=wdtf;
				
				requestInfo.setWorkflowDetailTableInfos(workflowDetailTableInfos);//子表单信息
			}
			
			if(workflowMainTableInfo!=null){
		
				String addrss="http://192.168.0.35//services/WorkflowService";
				WorkflowServicePortTypeProxy client = new WorkflowServicePortTypeProxy(addrss);
			
				requestInfo.setCreatorId(createId+"");
				result =client.doCreateWorkflowRequest(requestInfo, Integer.valueOf(createId));
				
				log.info(result);
				System.out.println(result);
			}
			
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	//框架协议
	public static void kJXY(AikoContract contract) {
		List<Map<String, String>> itemTableMap = null;
		Map<String, String> mainTableMap = null;
		mainTableMap = new HashMap<String, String>();
		mainTableMap.put("CONTRACT_NO", "1919191919");
		itemTableMap = new ArrayList<Map<String, String>>();
		for (int i = 0; i < 7; i++) {
			Map<String, String> map = new HashMap<String, String>();
			itemTableMap.add(map);
		}
		String workflowId = "640";
		int createId = 1551;
		String result = createWorkFlow(contract,mainTableMap, itemTableMap, workflowId, createId);
		System.out.print(result);
	}
	
	public static String createWorkFlow(AikoContract contract,Map<String,String> mainTable,List<Map<String,String>> itemTable,String workflowId,int createId){
		String result="0";
		WorkflowMainTableInfo workflowMainTableInfo=null;
		WorkflowRequestInfo requestInfo = new WorkflowRequestInfo();
		WorkflowBaseInfo workflowBaseInfo = new WorkflowBaseInfo();
		workflowBaseInfo.setWorkflowId(workflowId);//流程对应的id
		
		requestInfo.setCanEdit(true);
		requestInfo.setCanView(true);
		requestInfo.setWorkflowBaseInfo(workflowBaseInfo);
		
		try {
			if(mainTable!=null && !mainTable.isEmpty()){
				//主表单信息
				//主表字段信息
				//WorkflowRequestTableField[] wtfs = new WorkflowRequestTableField[mainTable.size()];//mainTable.size()
				WorkflowRequestTableField[] wrti = new WorkflowRequestTableField[30];
				wrti[0] = new WorkflowRequestTableField();
				wrti[0].setFieldName("apply_user");// 申请人  
				wrti[0].setFieldValue("1551");// 1551--陈明霞 1552-任博文 1548--姜林乐
				wrti[0].setView(true);
				wrti[0].setEdit(true);
				
				wrti[1] = new WorkflowRequestTableField();
				wrti[1].setFieldName("apply_user_no");// 申请人工号
				wrti[1].setFieldValue("111");
				wrti[1].setView(true);
				wrti[1].setEdit(true);

				wrti[2] = new WorkflowRequestTableField();
				wrti[2].setFieldName("department");// 部门
				wrti[2].setFieldValue("11");
				wrti[2].setView(true);
				wrti[2].setEdit(true);

				wrti[3] = new WorkflowRequestTableField();
				wrti[3].setFieldName("position");// 职位
				wrti[3].setFieldValue("111");//
				wrti[3].setView(true);// 字段是否可见
				wrti[3].setEdit(true);// 字段是否可编辑

				wrti[4] = new WorkflowRequestTableField();
				wrti[4].setFieldName("company");// 所属公司
				wrti[4].setFieldValue("111");
				wrti[4].setView(true);
				wrti[4].setEdit(true);

				wrti[5] = new WorkflowRequestTableField();
				wrti[5].setFieldName("apply_date");// 申请日期
				wrti[5].setFieldValue(DateUtil.getDateFormat(contract.getCreateTime()));
				wrti[5].setView(true);
				wrti[5].setEdit(true);
				
				wrti[6] = new WorkflowRequestTableField();
				wrti[6].setFieldName("Purcontr_engine");// 采购合同引擎
				System.out.println(contract.getSaleFunc()+"--");
				wrti[6].setFieldValue(contract.getSaleFunc()==""?"":contract.getSaleFunc());// 
				wrti[6].setView(true);// 字段是否可见
				wrti[6].setEdit(true);// 字段是否可编辑

				wrti[7] = new WorkflowRequestTableField();
				wrti[7].setFieldName("CONTRACT_NO");// 合同编号（合同标识）
				wrti[7].setFieldValue(contract.getContractNo()==""?"":contract.getContractNo());
				wrti[7].setView(true);
				wrti[7].setEdit(true);
				
				wrti[8] = new WorkflowRequestTableField();
				wrti[8].setFieldName("ISFORMATE");// 是否格式合同
				wrti[8].setFieldValue(contract.getIsformate());
				wrti[8].setView(true);
				wrti[8].setEdit(true);

				wrti[9] = new WorkflowRequestTableField();
				wrti[9].setFieldName("CONTRACT_TYPE");//合同类型
				wrti[9].setFieldValue(contract.getContractType());// 
				wrti[9].setView(true);// 
				wrti[9].setEdit(true);// 
						
				wrti[10] = new WorkflowRequestTableField();
				wrti[10].setFieldName("SERVICE_MODEL");// 业务模式
				wrti[10].setFieldValue(contract.getServiceModel());
				wrti[10].setView(true);
				wrti[10].setEdit(true);
					
				wrti[11] = new WorkflowRequestTableField();
				wrti[11].setFieldName("EMPLOYEE");// 销售雇员
				wrti[11].setFieldValue(contract.getEmployee());
				wrti[11].setView(true);
				wrti[11].setEdit(true);

				wrti[12] = new WorkflowRequestTableField();
				wrti[12].setFieldName("SALE_GROUP");//销售组
				wrti[12].setFieldValue(contract.getSaleGroup());// 
				wrti[12].setView(true);// 
				wrti[12].setEdit(true);// 

				wrti[13] = new WorkflowRequestTableField();
				wrti[13].setFieldName("SALE_ORG");//销售组织
				wrti[13].setFieldValue(contract.getSaleOrg());
				wrti[13].setView(true);
				wrti[13].setEdit(true);

				wrti[14] = new WorkflowRequestTableField();
				wrti[14].setFieldName("SALE_WAY");// 分销渠道
				wrti[14].setFieldValue(contract.getSaleWay());
				wrti[14].setView(true);
				wrti[14].setEdit(true);

				wrti[15] = new WorkflowRequestTableField();
				wrti[15].setFieldName("File_upload");// 附件上传
				wrti[15].setFieldType("http:baidu_sylogo1.gif");
				wrti[15].setFieldValue("http://www.baidu.com/img/baidu_sylogo1.gif");
				wrti[15].setView(true);
				wrti[15].setEdit(true);
				
				wrti[16] = new WorkflowRequestTableField();
				wrti[16].setFieldName("CONTRACT_ID"); // 合同id
				wrti[16].setFieldValue(contract.getContractId());
				wrti[16].setView(true);
				wrti[16].setEdit(true);
				
				wrti[17] = new WorkflowRequestTableField();
				wrti[17].setFieldName("PURCHASE_NO");// 客户采购编码
				wrti[17].setFieldValue(contract.getPurchaseNo());// 
				wrti[17].setView(true);// 字段是否可见
				wrti[17].setEdit(true);// 字段是否可编辑

				requestInfo.setRequestName("SD08-销售合同评审表（框架协议）");
														
				//只有一个主表单
				WorkflowRequestTableRecord[] wrtri= new WorkflowRequestTableRecord[1];
				
				wrtri[0]=new WorkflowRequestTableRecord();
				wrtri[0].setWorkflowRequestTableFields(wrti);
				
				workflowMainTableInfo = new WorkflowMainTableInfo();
				workflowMainTableInfo.setRequestRecords(wrtri);
				
				requestInfo.setWorkflowMainTableInfo(workflowMainTableInfo);//主表单信息
			}
			
			
			if(workflowMainTableInfo!=null){
		
				String addrss="http://192.168.0.35//services/WorkflowService";
				WorkflowServicePortTypeProxy client = new WorkflowServicePortTypeProxy(addrss);
			
				requestInfo.setCreatorId(createId+"");
				result =client.doCreateWorkflowRequest(requestInfo, Integer.valueOf(createId));
				
				//log.info(result);
				System.out.println(result);
			}
			
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	//标准，样片合同
	public static void chuFaOA(AikoContract contract,List<AikoContractDetail> details){
		List<Map<String,String>> itemTableMap = null;
		Map<String,String> mainTableMap =null;
		mainTableMap =new HashMap<String, String>();
    	mainTableMap.put("CONTRACT_NO", "1919191919");
    	itemTableMap=new ArrayList<Map<String,String>>();
    	for(int i=0;i<7;i++){
    		Map<String,String> map = new HashMap<String, String>();
    		/*map.put("SILICON", "09");
    		map.put("MAIN_GRID", "09");
    		map.put("TECH", "09");*/
    		itemTableMap.add(map);
    	}
    	String workflowId ="638";
    	int createId=1551;
		String result = new CreateXu().createWorkFlow(contract,details,mainTableMap, itemTableMap,workflowId,createId);
		System.out.print(result);
	}
	
	public String createWorkFlow(AikoContract contract,List<AikoContractDetail> details,Map<String,String> mainTable,List<Map<String,String>> itemTable,String workflowId,int createId){
		String result="0";
		WorkflowMainTableInfo workflowMainTableInfo=null;
		WorkflowRequestInfo requestInfo = new WorkflowRequestInfo();
		WorkflowBaseInfo workflowBaseInfo = new WorkflowBaseInfo();
		workflowBaseInfo.setWorkflowId(workflowId);//流程对应的id
		
		requestInfo.setCanEdit(true);
		requestInfo.setCanView(true);
		requestInfo.setWorkflowBaseInfo(workflowBaseInfo);
		
		try {
			if(mainTable!=null && !mainTable.isEmpty()){
				//主表单信息
				//主表字段信息
				//WorkflowRequestTableField[] wtfs = new WorkflowRequestTableField[mainTable.size()];//mainTable.size()
				WorkflowRequestTableField[] wrti = new WorkflowRequestTableField[31];
				wrti[0] = new WorkflowRequestTableField();
				wrti[0].setFieldName("CONTRACT_NO");// 合同编号
				wrti[0].setFieldValue(contract.getContractNo()==""?"":contract.getContractNo());// 被留言人字段的值，111为被留言人id
				wrti[0].setView(true);// 字段是否可见
				wrti[0].setEdit(true);// 字段是否可编辑
				
				wrti[1] = new WorkflowRequestTableField();
				wrti[1].setFieldName("CONTRACT_TYPE");// 合同类型
				wrti[1].setFieldValue(contract.getContractType());
				wrti[1].setView(true);
				wrti[1].setEdit(true);

				wrti[2] = new WorkflowRequestTableField();
				wrti[2].setFieldName("SERVICE_MODEL");// 业务模式
				wrti[2].setFieldValue(contract.getServiceModel());
				wrti[2].setView(true);
				wrti[2].setEdit(true);

				wrti[3] = new WorkflowRequestTableField();
				wrti[3].setFieldName("ISFORMATE");// 是否格式合同
				wrti[3].setFieldValue(contract.getIsformate());//
				wrti[3].setView(true);// 字段是否可见
				wrti[3].setEdit(true);// 字段是否可编辑

				wrti[4] = new WorkflowRequestTableField();
				wrti[4].setFieldName("SALE_ORG");// 销售组织
				wrti[4].setFieldValue(contract.getSaleOrg());
				wrti[4].setView(true);
				wrti[4].setEdit(true);

				wrti[5] = new WorkflowRequestTableField();
				wrti[5].setFieldName("SALE_WAY");// 分销渠道
				wrti[5].setFieldValue(contract.getSaleWay());
				wrti[5].setView(true);
				wrti[5].setEdit(true);

				wrti[6] = new WorkflowRequestTableField();
				wrti[6].setFieldName("PAYMENT_WAY");// 付款方式
				wrti[6].setFieldValue(contract.getPaymentWay());// 被留言人字段的值，111为被留言人id
				wrti[6].setView(true);// 字段是否可见
				wrti[6].setEdit(true);// 字段是否可编辑

				wrti[7] = new WorkflowRequestTableField();
				wrti[7].setFieldName("SALE_GROUP");// 销售组
				wrti[7].setFieldValue(contract.getSaleGroup());
				wrti[7].setView(true);
				wrti[7].setEdit(true);

				wrti[8] = new WorkflowRequestTableField();
				wrti[8].setFieldName("TRADE_TERM");// 贸易条款
				wrti[8].setFieldValue(contract.getTradeTerm());
				wrti[8].setView(true);
				wrti[8].setEdit(true);

				wrti[9] = new WorkflowRequestTableField();
				wrti[9].setFieldName("CUSTOMER_NO");//
				wrti[9].setFieldValue(contract.getCustomerNo());// 被留言人字段的值，111为被留言人id
				wrti[9].setView(true);// 字段是否可见
				wrti[9].setEdit(true);// 字段是否可编辑

				wrti[10] = new WorkflowRequestTableField();
				wrti[10].setFieldName("Customer_identify");// 客户标识
				wrti[10].setFieldValue(contract.getCustomerNo()+" "+contract.getCustomerName());
				wrti[10].setView(true);
				wrti[10].setEdit(true);

				wrti[11] = new WorkflowRequestTableField();
				wrti[11].setFieldName("PURCHASE_NO");// 客户采购编号/纸质合同编码
				wrti[11].setFieldValue(contract.getPurchaseNo()==""?"":contract.getPurchaseNo());
				wrti[11].setView(true);
				wrti[11].setEdit(true);

				wrti[12] = new WorkflowRequestTableField();
				wrti[12].setFieldName("STA_TIME");//
				wrti[12].setFieldValue(DateUtil.getDateFormat(contract.getStaTime()));// 被留言人字段的值，111为被留言人id
				wrti[12].setView(true);// 字段是否可见
				wrti[12].setEdit(true);// 字段是否可编辑

				wrti[13] = new WorkflowRequestTableField();
				wrti[13].setFieldName("END_TIME");//
				wrti[13].setFieldValue(DateUtil.getDateFormat(contract.getEndTime()));
				wrti[13].setView(true);
				wrti[13].setEdit(true);

				wrti[14] = new WorkflowRequestTableField();
				wrti[14].setFieldName("PAYMENT_TERM");// 付款条件
				wrti[14].setFieldValue(contract.getPaymentTerm());
				wrti[14].setView(true);
				wrti[14].setEdit(true);

				wrti[15] = new WorkflowRequestTableField();
				wrti[15].setFieldName("CURRENCY");//
				wrti[15].setFieldValue(contract.getCurrency());// 货币类型
				wrti[15].setView(true);// 字段是否可见
				wrti[15].setEdit(true);// 字段是否可编辑
				
				wrti[16] = new WorkflowRequestTableField();
				wrti[16].setFieldName("PURCHASE_NO");// 客户采购编码
				wrti[16].setFieldValue(contract.getPurchaseNo());// 
				wrti[16].setView(true);// 字段是否可见
				wrti[16].setEdit(true);// 字段是否可编辑

				/*wrti[16] = new WorkflowRequestTableField();
				wrti[16].setFieldName("Wafercost");// 硅片成本
				wrti[16].setFieldValue("44.87");
				wrti[16].setView(true);
				wrti[16].setEdit(true);

				wrti[17] = new WorkflowRequestTableField();
				wrti[17].setFieldName("NonsiliconCost");// 非硅成本
				wrti[17].setFieldValue("44.87");
				wrti[17].setView(true);
				wrti[17].setEdit(true);

				wrti[18] = new WorkflowRequestTableField();
				wrti[18].setFieldName("CapitalCost");// 资金成本
				wrti[18].setFieldValue("44.87");// 被留言人字段的值，111为被留言人id
				wrti[18].setView(true);// 字段是否可见
				wrti[18].setEdit(true);// 字段是否可编辑

				wrti[19] = new WorkflowRequestTableField();
				wrti[19].setFieldName("ContrProcefee");// 合同加工费
				wrti[19].setFieldValue("44.87");
				wrti[19].setView(true);
				wrti[19].setEdit(true);

				wrti[20] = new WorkflowRequestTableField();
				wrti[20].setFieldName("total");// 合计
				wrti[20].setFieldValue("44.87");
				wrti[20].setView(true);
				wrti[20].setEdit(true);

				wrti[21] = new WorkflowRequestTableField();
				wrti[21].setFieldName("CostTotal");// 成本合计
				wrti[21].setFieldValue("111");// 被留言人字段的值，111为被留言人id
				wrti[21].setView(true);// 字段是否可见
				wrti[21].setEdit(true);// 字段是否可编辑*/

				wrti[17] = new WorkflowRequestTableField();
				wrti[17].setFieldName("company");// 利润合计
				wrti[17].setFieldValue("爱旭");
				wrti[17].setView(true);
				wrti[17].setEdit(true);

				wrti[18] = new WorkflowRequestTableField();
				wrti[18].setFieldName("EMPLOYEE");// 销售雇员
				wrti[18].setFieldValue(contract.getEmployee());
				wrti[18].setView(true);
				wrti[18].setEdit(true);
				/**
				 * 注意：只能是int类型
				 */

				wrti[19] = new WorkflowRequestTableField();
				wrti[19].setFieldName("apply_date");// 申请日期
				wrti[19].setFieldValue(DateUtil.getDateFormat(contract.getCreateTime()));
				wrti[19].setView(true);
				wrti[19].setEdit(true);

				wrti[20] = new WorkflowRequestTableField();
				wrti[20].setFieldName("department"); // 部门
				wrti[20].setFieldValue("11");
				wrti[20].setView(true);
				wrti[20].setEdit(true);

				/**
				 * 申请人为 HrmResource 表的 id 字段
				 */
				wrti[21] = new WorkflowRequestTableField();
				wrti[21].setFieldName("apply_user"); // 申请人
				wrti[21].setFieldValue("1551");
				wrti[21].setView(true);
				wrti[21].setEdit(true);

				wrti[22] = new WorkflowRequestTableField();
				wrti[22].setFieldName("Purcontr_engine");// 采购合同引擎 注意：只能是int类型
				System.out.println(contract.getSaleFunc()+"--");
				wrti[22].setFieldValue(contract.getSaleFunc()==""?"":contract.getSaleFunc());
				wrti[22].setView(true);
				wrti[22].setEdit(true);

				wrti[23] = new WorkflowRequestTableField();
				wrti[23].setFieldName("apply_user_no");// 申请人工号
				wrti[23].setFieldValue("1016079");// 被留言人字段的值，111为被留言人id
				wrti[23].setView(true);// 字段是否可见
				wrti[23].setEdit(true);// 字段是否可编辑

				wrti[24] = new WorkflowRequestTableField();
				wrti[24].setFieldName("File_upload");// 附件上传
				wrti[24].setFieldType("http:baidu_sylogo1.gif");
				wrti[24].setFieldValue("http://www.baidu.com/img/baidu_sylogo1.gif");
				wrti[24].setView(true);
				wrti[24].setEdit(true);
				
				wrti[25] = new WorkflowRequestTableField();
				wrti[25].setFieldName("CONTRACT_ID"); // 合同id
				wrti[25].setFieldValue(contract.getContractId());
				wrti[25].setView(true);
				wrti[25].setEdit(true);

				requestInfo.setRequestName("SD06-合同审批");
														
				//只有一个主表单
				WorkflowRequestTableRecord[] wrtri= new WorkflowRequestTableRecord[1];
				//WorkflowRequestTableRecord mainTableR = new WorkflowRequestTableRecord();
				//mainTableR.setWorkflowRequestTableFields(wtfs);
				wrtri[0]=new WorkflowRequestTableRecord();
				wrtri[0].setWorkflowRequestTableFields(wrti);
				
				workflowMainTableInfo = new WorkflowMainTableInfo();
				workflowMainTableInfo.setRequestRecords(wrtri);
				
				requestInfo.setWorkflowMainTableInfo(workflowMainTableInfo);//主表单信息
			}
			
			
			//子表单信息
			if(itemTable!=null && itemTable.size()>0){
				WorkflowRequestTableRecord[] dtrs= new WorkflowRequestTableRecord[details.size()];
				for(int i=0;i<details.size();i++){
					Map<String,String> map=itemTable.get(i);
					//一行
					WorkflowRequestTableRecord dtr = new WorkflowRequestTableRecord();
					//字段
					WorkflowRequestTableField[] wrti = new WorkflowRequestTableField[30];
					wrti[0] = new WorkflowRequestTableField();
					wrti[0].setFieldName("SILICON");// 硅片晶体
					wrti[0].setFieldValue(details.get(i).getSilicon());
					wrti[0].setView(true);// 字段是否可见
					wrti[0].setEdit(true);// 字段是否可编辑

					wrti[1] = new WorkflowRequestTableField();
					wrti[1].setFieldName("MAIN_GRID");// 主栅
					wrti[1].setFieldValue(details.get(i).getMainGrid());
					wrti[1].setView(true);
					wrti[1].setEdit(true);
					
					wrti[2] = new WorkflowRequestTableField();
					wrti[2].setFieldName("TECH");// 工艺
					wrti[2].setFieldValue(details.get(i).getTech());
					wrti[2].setView(true);
					wrti[2].setEdit(true);

					wrti[3] = new WorkflowRequestTableField();
					wrti[3].setFieldName("CONVERT_RATE");// 转换效率
					wrti[3].setFieldValue(details.get(i).getConvertRate());//
					wrti[3].setView(true);// 字段是否可见
					wrti[3].setEdit(true);// 字段是否可编辑

					wrti[4] = new WorkflowRequestTableField();
					wrti[4].setFieldName("GRADE");// 等级
					wrti[4].setFieldValue(details.get(i).getGrade());
					wrti[4].setView(true);
					wrti[4].setEdit(true);

					wrti[5] = new WorkflowRequestTableField();
					wrti[5].setFieldName("MOUNT");// 数量
					wrti[5].setFieldValue(details.get(i).getMount().toString());
					wrti[5].setView(true);
					wrti[5].setEdit(true);

					wrti[6] = new WorkflowRequestTableField();
					wrti[6].setFieldName("UNIT");// 单位
					wrti[6].setFieldValue(details.get(i).getUnit());//
					wrti[6].setView(true);// 字段是否可见
					wrti[6].setEdit(true);// 字段是否可编辑

					wrti[7] = new WorkflowRequestTableField();
					wrti[7].setFieldName("UnitPricetax");// 单价
					wrti[7].setFieldValue(details.get(i).getUnitCost().toString());//
					wrti[7].setView(true);// 字段是否可见
					wrti[7].setEdit(true);// 字段是否可编辑
					
					wrti[8] = new WorkflowRequestTableField();
					wrti[8].setFieldName("SUM");// 总额
					wrti[8].setFieldValue(details.get(i).getSum().toString());//
					wrti[8].setView(true);// 字段是否可见
					wrti[8].setEdit(true);// 字段是否可编辑
					
					wrti[9] = new WorkflowRequestTableField();
					wrti[9].setFieldName("CONTRACT_DETAIL_ID");// 合同详情id
					wrti[9].setFieldValue(details.get(i).getContractDetailId());//
					wrti[9].setView(true);// 字段是否可见
					wrti[9].setEdit(true);// 字段是否可编辑
					
					dtr.setWorkflowRequestTableFields(wrti);
					dtrs[i]=dtr;
					
				}
				
				WorkflowDetailTableInfo wdtf = new WorkflowDetailTableInfo();
				wdtf.setWorkflowRequestTableRecords(dtrs);
				
				//只有一个子表单
				WorkflowDetailTableInfo[] workflowDetailTableInfos = new WorkflowDetailTableInfo[1];
				workflowDetailTableInfos[0]=wdtf;
				
				requestInfo.setWorkflowDetailTableInfos(workflowDetailTableInfos);//子表单信息
			}
			
			if(workflowMainTableInfo!=null){
		
				String addrss="http://192.168.0.35//services/WorkflowService";
				WorkflowServicePortTypeProxy client = new WorkflowServicePortTypeProxy(addrss);
			
				requestInfo.setCreatorId(createId+"");
				result =client.doCreateWorkflowRequest(requestInfo, Integer.valueOf(createId));
				
				log.info(result);
				System.out.println(result);
			}
			
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
}
 