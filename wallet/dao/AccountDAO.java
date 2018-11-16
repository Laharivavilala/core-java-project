package com.cg.wallet.dao;

import com.cg.wallet.bean.AccountBean;


public interface AccountDAO {

	boolean createAccount(AccountBean accountBean);
	double showBalance();
	boolean deposit(AccountBean accountBean);
	boolean withdraw(AccountBean accountBean);
	boolean fundTransfer(AccountBean accountBean);
	boolean printTransactions(AccountBean accountBean);
	
	

}
