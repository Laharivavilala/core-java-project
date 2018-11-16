package com.cg.wallet.service;

import com.cg.wallet.bean.AccountBean;
import com.cg.wallet.bean.CustomerBean;
import com.cg.wallet.dao.AccountDAO;
import com.cg.wallet.dao.AccountDAOImpl;

public class AccountServiceImpl implements AccountService {

	@Override
	public boolean createAccount(AccountBean accountBean) {
		AccountDAO dao = new AccountDAOImpl();
		boolean result = dao.createAccount(accountBean);
		return result;
		
	}

	@Override
	public double showBalance() {
		AccountDAO dao = new AccountDAOImpl();

	return dao.showBalance();
		
		
	}

	@Override
	public boolean deposit(AccountBean accountBean) {
		AccountDAO dao = new AccountDAOImpl();
		boolean result = dao.deposit(accountBean);
		
		return result;
		
	}

	@Override
	public boolean withdraw(AccountBean accountBean) {
	AccountDAO dao = new AccountDAOImpl();
	boolean result = dao.withdraw(accountBean);
	
		return result;
	}

	@Override
	public boolean fundTransfer(AccountBean accountBean) {
		AccountDAO dao = new AccountDAOImpl();
		boolean result = dao.fundTransfer(accountBean);
		return result;
	}

	@Override
	public boolean printTransactions(AccountBean accountBean) {
		AccountDAO dao = new AccountDAOImpl();
		boolean result = dao.printTransactions(accountBean);
		// TODO Auto-generated method stub
		return result;
	}

}
