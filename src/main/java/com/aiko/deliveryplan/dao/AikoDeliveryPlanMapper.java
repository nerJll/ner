package com.aiko.deliveryplan.dao;

import com.aiko.deliveryplan.dto.AikoDeliveryPlan;
import com.aiko.deliveryplan.dto.AikoDeliveryPlanExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AikoDeliveryPlanMapper {
    int countByExample(AikoDeliveryPlanExample example);

    int deleteByExample(AikoDeliveryPlanExample example);

    int deleteByPrimaryKey(String deliveryPlanId);

    int insert(AikoDeliveryPlan record);

    int insertSelective(AikoDeliveryPlan record);

    List<AikoDeliveryPlan> selectByExample(AikoDeliveryPlanExample example);

    AikoDeliveryPlan selectByPrimaryKey(String deliveryPlanId);

    int updateByExampleSelective(@Param("record") AikoDeliveryPlan record, @Param("example") AikoDeliveryPlanExample example);

    int updateByExample(@Param("record") AikoDeliveryPlan record, @Param("example") AikoDeliveryPlanExample example);

    int updateByPrimaryKeySelective(AikoDeliveryPlan record);

    int updateByPrimaryKey(AikoDeliveryPlan record);
}