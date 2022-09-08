/*
Program : Java program to find Quotient and Remainder.(Lab assessment)
@author : Farwa Haider 
@Date : 8 September 2022
*/
//declaring a class 
class Quotient
{
    //calling main
    public static void main(String ...args)
     {
      int divisor=Integer.parseInt(args[0]);
	  int dividend=Integer.parseInt(args[1]);
	  
	  int q=dividend/divisor;
	  int r=(dividend%divisor);
	 
	   System.out.println("The quotient is :"+q); //Printing a statement 
	   System.out.println("The remainder is :"+r); //Printing a statement 
	 }//end of main
	 
}
//end of class Quotient 