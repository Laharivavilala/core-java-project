package com.cg.wallet.ui;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

import com.cg.wallet.bean.AccountBean;
import com.cg.wallet.bean.CustomerBean;
import com.cg.wallet.service.AccountService;
import com.cg.wallet.service.AccountServiceImpl;

public class Client {

	static AccountService service = new AccountServiceImpl();
	static Client client = new  Client();
	 static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) throws Exception {
		
		char ch;
	
		do{
			System.out.println("****Payment Wallet *****");
			System.out.println("1. create Account");
			System.out.println("2. Show Balance");
			System.out.println("3. Deposit");
			System.out.println("4. WithDraw");
			System.out.println("5. FundTransfer");
			System.out.println("6. Print Transactions");
			System.out.println("7. Exit");
	
			System.out.println("Choose an option");
			
			int option = scanner.nextInt();
			
			switch (option) {
			case 1:client.createAccount();
				
				break;
			case 2:client.showBalance();
				
				
				break;
				
			case 3:
				
				break;
				
			case 4:
				
			   break;
			case 5:
				
				break;
			case 6:
				
				break;
			case 7:
				
				break;
			default:
				break;
			}
			System.out.println("Do you want to continue y/n");
			ch= scanner.next().charAt(0);			

	}while(ch=='y'||ch=='n');

	}
	
		
	
	


	void createAccount() throws Exception {
		CustomerBean customerBean = new CustomerBean();
		System.out.println("Enter first name:");
		String fname = scanner.next();
		customerBean.setFname(fname);
		
		System.out.println("Enter last name:");
		String lname = scanner.next();
		customerBean.setLname(lname);
		
		System.out.println("Enter phone number:");
		String phoneNum = scanner.next();
		customerBean.setPhoneNum(phoneNum);
		
		System.out.println("Enter email:");
		String email = scanner.next();
		customerBean.setEmail(email);
		
		System.out.println("Enter address:");
		String address = scanner.next();
		customerBean.setAddress(address);
		
		System.out.println("Enter pan number:");
		String pan = scanner.next();
		customerBean.setPan(pan);
		
		AccountBean accountBean = new AccountBean();
		
		
		int accountId = (int) (Math.random()*10000);
		System.out.println("your account ID is.."+accountId);
		
		/*System.out.println("Enter the date of opening");
		String date = scanner.next();*/
		
		//SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		LocalDateTime ldt = LocalDateTime.now();
		DateTimeFormatter f =DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
		System.out.println("Date of opening:"+ldt.format(f));
	
		
		System.out.println("enter the initial deposit amount ");
		double initDeposit = scanner.nextDouble();
		accountBean.setInitialDeposit(initDeposit);
		
		System.out.println("your current balance is..");
		System.out.println(accountBean.getInitialDeposit());
		
	accountBean.setCustomerBean(customerBean);	
		
		boolean result = service.createAccount(accountBean) ;
		
			if(result==true) {
				System.out.println("Your account has been created successfully");
			}
			else {
				System.out.println("Invalid Details");
			}
			

		}
	 void showBalance() {
			AccountBean accountBean = new AccountBean();
		 double balance = accountBean.getBalance();
		 System.out.println(balance);
			
		}

	
	
	
	

	
		
	
}