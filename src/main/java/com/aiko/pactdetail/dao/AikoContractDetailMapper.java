package com.aiko.pactdetail.dao;

import com.aiko.pactdetail.dto.AikoContractDetail;
import com.aiko.pactdetail.dto.AikoContractDetailExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AikoContractDetailMapper {
    int countByExample(AikoContractDetailExample example);

    int deleteByExample(AikoContractDetailExample example);

    int deleteByPrimaryKey(String contractDetailId);

    int insert(AikoContractDetail record);

    int insertSelective(AikoContractDetail record);

    List<AikoContractDetail> selectByExample(AikoContractDetailExample example);

    AikoContractDetail selectByPrimaryKey(String contractDetailId);

    int updateByExampleSelective(@Param("record") AikoContractDetail record, @Param("example") AikoContractDetailExample example);

    int updateByExample(@Param("record") AikoContractDetail record, @Param("example") AikoContractDetailExample example);

    int updateByPrimaryKeySelective(AikoContractDetail record);

    int updateByPrimaryKey(AikoContractDetail record);
}