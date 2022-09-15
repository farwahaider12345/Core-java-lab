/*
Program : Printing a pattern (Lab Test)
@author : Farwa Haider  
@Date : 15 September 2022
*/
//declaring a class 
class PrintingPattern
{
	//main method for pattern
	static void pattern(int noOfRows)
	{
		for(int i=1;i<=noOfRows;i++) 
		{
			System.out.println(); // new line after each row

			for(int spaces=noOfRows;spaces>i;spaces--) //for loop
			{
				System.out.print(" "); //printing
			}//end of for loop

			for(int j=1;j<=i;j++) //for loop
			{
				System.out.print("* "); //printing
			}//end of for loop


		}//end of for loop


	}

  //calling main method 
  public static void main(String...args)
  {
	  pattern();
	  
  }  

}
//end of class