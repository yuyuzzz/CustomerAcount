package com.atguigu.exer3;

public class Customer {
 private String firstName;
 private String lastName;
 private Account account;
	
 public Customer(String f,String l) {
	 f=firstName;
	 l=lastName;

	 }
 
 public String getFirstname() {
	 return firstName;
 }
 
 public String getLastName() {
	 return lastName;
 }
 
 public Account getAccount() {
	 return account;
 }
 
 public void setAccount(Account account) {
	 this.account=account;
 }
}
