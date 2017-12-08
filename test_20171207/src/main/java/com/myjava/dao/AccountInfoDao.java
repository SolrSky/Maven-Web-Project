package com.myjava.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.myjava.entity.AccountInfo;
import com.myjava.entity.AccountInfoExample;

public interface AccountInfoDao {
	int countByExample(AccountInfoExample example);

	int deleteByExample(AccountInfoExample example);

	int deleteByPrimaryKey(Integer accountId);

	int insert(AccountInfo record);

	int insertSelective(AccountInfo record);

	List<AccountInfo> selectByExample(AccountInfoExample example);

	AccountInfo selectByPrimaryKey(Integer accountId);

	int updateByExampleSelective(@Param("record") AccountInfo record, @Param("example") AccountInfoExample example);

	int updateByExample(@Param("record") AccountInfo record, @Param("example") AccountInfoExample example);

	int updateByPrimaryKeySelective(AccountInfo record);

	int updateByPrimaryKey(AccountInfo record);
}