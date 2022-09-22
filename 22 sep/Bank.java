/*
Program: create a BankAccount and display the people with balance less than 1000.
@author: Shuruti Singhal
@Date: 22 sept 2022
*/

//declaring a class Bank

class Bank
{
	//declaring instance variable
	
	private int accID;
	private String accName;
	private double balance;
	private double aadharNo;
	private double pinNo;
	private double accountNo;
	
	//default constructor no arg constructor
    Bank()
	{
		
	}
	
	//parameterized constructor
	Bank(int accID,String accName,double balance)
	{
		this.accID=accID;
		this.accName=accName;
		this.balance=balance;
		
	}
	
	//getters and setters               	                                                       
	public double getAadharNo()
	{
		return this.aadharNo;
	}
	
	public void setAadharNo(double aadharNo)
	{
		this.aadharNo=aadharNo;
	}

	//////////////////////////////
	public double getPinNo()
	{
		return this.pinNo;
	}
	
	public void setPinNo(double pinNo)
	{
		this.pinNo=pinNo;
	}
	
	//////////////////////////////
	public double getAccountNo()
	{
		return this.accountNo;
	}
	
	public void setAccountNo(double accountNo)
	{
		this.accountNo=accountNo;
	}
}


