class BankDetails 
{
	//main method
	public static void main(String ...args)
	{
		
		//declaring objects of Bank 
		Bank b1= new Bank(101,"Farwa haider",90000.0);
	    Bank b2= new Bank(102,"Waniya",20000.0);
		
		// displaying the details 
		System.out.println("Account ID:  "+b1.getAccID()+"   Name:   "+b1.getAccName()+"  Balance:  "+b1.getBalance());
		System.out.println("Account ID:  "+b2.getAccID()+"   Name:   "+b2.getAccName()+"  Balance:  "+b2.getBalance());
		
		
		//declaring objects
		//Bank b3= new Bank();
		
		//setting the values of the object
		b1.setAdharNo(2245 2289 1222);
		b1.setPinNo(7777);
		b1.setAccountNo(897659765279);
		
		b2.setAdharNo(2245 2289 1222);
		b2.setPinNo(7779);
		b2.setAccountNo(898888897679);
		
		//getting the values
		System.out.println("Account ID:  "+b1.getAadharNo()+"   Name:   "+b1.getPinNo()+"  Balance:  "+b1.getAccountNo());
		System.out.println("Account ID:  "+b2.getAadharNo()+"   Name:   "+b2.getPinNo()+"  Balance:  "+b2.getAccountNo());
	}
	
}
