package com.cg.wallet.dao;

import java.util.ArrayList;
import java.util.List;

import com.cg.wallet.bean.AccountBean;


public class AccountDAOImpl implements AccountDAO {
 
	List<AccountBean> list = new ArrayList<>();
	
	@Override
	public boolean createAccount(AccountBean accountBean) {
		
		return list.add(accountBean);
	}

	@Override
	public double showBalance() {
	 
		double balance =0.0;
	for (AccountBean accountBean2 : list) {
		
	
		balance = accountBean2.getBalance();
	}
		return balance ;
	}

	@Override
	public boolean deposit(AccountBean accountBean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean withdraw(AccountBean accountBean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean fundTransfer(AccountBean accountBean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean printTransactions(AccountBean accountBean) {
		// TODO Auto-generated method stub
		return false;
	}

}
