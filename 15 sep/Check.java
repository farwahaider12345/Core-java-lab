/*
Program : Java progam to find whether the character entered is vowel ,consonant ,number and special character.
@author : Farwa Haider  
@Date : 15 September 2022
*/
//declaring a class 
class Check
{
	//calling method 
	static void checkChar(char cValue)
	{
		{
			if((cValue=='A')||(cValue=='E')||(cValue=='I')||(cValue=='O')||(cValue=='U'))
			{
				System.out.println("Its a vowel");//printing 
			}
			else
			{
				System.out.println("Its a consonant");//printing 
			}	

		}
		
		{
			if  ((cValue=='a')||(cValue=='e')||(cValue=='i')||(cValue=='o')||(cValue=='u'))
			{
				System.out.println("Its a vowel"); //printing
			}
			else
			{
				System.out.println("Its a consonant");//printing
			}	
		}
		{	
		  if ((cValue=='1')||(cValue=='2')||(cValue=='3')||(cValue=='4')||(cValue=='5')||(cValue=='6')||(cValue=='7')||(cValue=='8')||(cValue=='9'))
		  {
			System.out.println("Its a number");//printing
		  }
		   else
			  System.out.println("Its a special character");//printing
		}	 
		
	}
	// end of method
	//calling main method
   public static void main(String ...args)
   {
	   char value = args[0].charAtUppercase(0);// taking a character input
	   
	  checkChar(value);
    
    }

   // end of main

}

// end of class