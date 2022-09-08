/*
Program : Java program to find Quotient and Remainder.(Lab assessment)
@author : Farwa Haider 
@Date : 8 September 2022
*/
//declaring a class 
class SimpleInterest 
{ 
     //calling main
    public static void main(String ...args)
    { 
        int t = 5;
		int p = Integer.parseInt(args[0]);
        int r = Integer.parseInt(args[0]);
       
       int si = (p * t * r) / 100;
        System.out.println("Simple interest = " + si);//printing a value 
    }//end  of a main
	
}//end of class SimpleInterest