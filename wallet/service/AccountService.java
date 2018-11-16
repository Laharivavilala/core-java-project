package com.cg.wallet.service;

import com.cg.wallet.bean.AccountBean;


public interface AccountService {

	boolean createAccount(AccountBean accountBean);
	double showBalance();
	boolean deposit(AccountBean accountBean);
    boolean withdraw(AccountBean accountBean);
    boolean fundTransfer(AccountBean accountBean);
    boolean printTransactions(AccountBean accountBean);
    
	

}
