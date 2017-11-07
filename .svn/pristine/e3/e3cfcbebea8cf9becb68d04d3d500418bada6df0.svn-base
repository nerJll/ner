package com.aiko.pact.dao;

import com.aiko.pact.dto.AikoContract;
import com.aiko.pact.dto.AikoContractExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AikoContractMapper {
    int countByExample(AikoContractExample example);

    int deleteByExample(AikoContractExample example);

    int deleteByPrimaryKey(String contractId);

    int insert(AikoContract record);

    int insertSelective(AikoContract record);

    List<AikoContract> selectByExample(AikoContractExample example);

    AikoContract selectByPrimaryKey(String contractId);

    int updateByExampleSelective(@Param("record") AikoContract record, @Param("example") AikoContractExample example);

    int updateByExample(@Param("record") AikoContract record, @Param("example") AikoContractExample example);

    int updateByPrimaryKeySelective(AikoContract record);

    int updateByPrimaryKey(AikoContract record);
}