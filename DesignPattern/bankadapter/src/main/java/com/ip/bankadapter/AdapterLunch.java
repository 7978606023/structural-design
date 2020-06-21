package com.ip.bankadapter;

public class AdapterLunch {

	public static void main(String[] args) {
		CreditCard targetInterface=new BankCustomer();  
		  targetInterface.giveBankDetails();  
		  System.out.print(targetInterface.getCreditCard());  

	}

}
