/* 
@Program : Java Program to print a pattern (Lab test)
@author : Farwa Haider
@Date : 25 Aug
*/
// declaring a class
class NestedFor
{
	//method to print pattern
   static void  printPattern();
   {
        for(int i=1;i<=5;i++) // first loop
        {
	      for(int j=1;j<=i;j++) // second loop 
       
          {
	         System.out.print(j); //printing 
	        //end of a inner loop
          }
               System.out.println(); 
                 //end of a outer loop
		}
    }
            //calling main 
            public static void main(String ...args)
		   {
			      //calling printPattern method
		            printPattern();
		   }
}