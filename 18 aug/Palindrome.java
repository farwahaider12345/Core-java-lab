/*
Program : Java Program to check the number is pallindrome (Lab Test)
@author : Farwa Haider 
@Date : 18 August 2022
*/ 

class Palindrome 
{

	static void checkPalindrome()
	{
	int num = 1234;  
	int r,num2 =0;
	
	int temp = num;
	while(num>0)
	{
	 r = num%10;
	 num2 =(num2*10)+r;
	 num = num/10;
	   if(num2==temp)
              System.out.println("number" + temp + " is a palindrome");
     else
		      System.out.println("number"+ temp + " is not palindrome"); 

	 }
	 
}
      //calling main method 
	 public static void main(String arg[])
	 {
		checkPalindrome(); 
	 }
	 
} 
