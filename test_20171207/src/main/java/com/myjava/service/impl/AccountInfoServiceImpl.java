/**
 * 
 */
package com.myjava.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myjava.dao.AccountInfoDao;
import com.myjava.entity.AccountInfo;
import com.myjava.service.AccountInfoService;

/**
 * @author dingjunjie
 *
 */
@Service
public class AccountInfoServiceImpl implements AccountInfoService{

	@Autowired
	private AccountInfoDao accountInfoDao;
	/* (non-Javadoc)
	 * @see com.myjava.service.AccountInfoService#getAccountInfoById(java.lang.Integer)
	 */
	public AccountInfo getAccountInfoById(Integer accountId) {
		return accountInfoDao.selectByPrimaryKey(accountId);
	}

	
}
