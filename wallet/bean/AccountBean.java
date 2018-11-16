package com.cg.wallet.bean;

import java.sql.Date;

public class AccountBean {

	private double balance;
	private double initialDeposit;
	private int accountId;
	private Date dateOfOpening;
	private CustomerBean customerBean;
	public CustomerBean getCustomerBean() {
		return customerBean;
	}
	public void setCustomerBean(CustomerBean customerBean) {
		this.customerBean = customerBean;
	}
	@Override
	public String toString() {
		return "AccountBean [accountId=" + accountId + ", balance=" + balance + ", dateOfJoining=" + dateOfOpening
				+ ", initialDeposit=" + initialDeposit + "]";
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getInitialDeposit() {
		return initialDeposit;
	}
	public void setInitialDeposit(double initialDeposit) {
		this.initialDeposit = initialDeposit;
	}
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public Date getDateOfOpening() {
		return dateOfOpening;
	}
	public void setDateOfOpening(Date dateOfOpening) {
		this.dateOfOpening = dateOfOpening;
	}
	
	
}
