package com.ip.bankadapter;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BankCustomer extends BankDetails implements CreditCard {

	public void giveBankDetails() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the Account Holder Name");
			String customerName = br.readLine();
			System.out.println("/n");
			
			System.out.println("Enter The Account Number");
			long accNo = Long.parseLong(br.readLine());
			System.out.println("/n");
			
			System.out.println("Enter the Bank Name");
			String bankName = br.readLine();
			
			setAcHolderName(customerName);
			setAcNumber(accNo);
			setBankName(bankName);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public String getCreditCard() {
		long accno=getAcNumber();  
		   String accholdername=getAcHolderName();  
		   String bname=getBankName();
		return ("The Account number "+accno+" of "+accholdername+" in "+bname+ " bank is valid and authenticated for issuing the credit card. ");  
		          	 
	}
}
