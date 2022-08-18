/*
Program : Java Program to print the tagline of the brand  (Lab Test)
@author : Farwa Haider 
@Date : 18 August 2022
*/


class BrandTagLine 
{
	static void printTagline()
	{
		int brand=5; //taking input
		Switch(Tagline); //using switch case
		//using different case 
		{
			case 1 -> System.out.println("Nike: Just do it");
			   
			        
			case 2 -> System.out.println("Apple: think different");
			     
			      
			case 3 -> System.out.println(" Loreal: because you are worth it");
			      
			        
			case 4 -> System.out.println("Puma: Always first");
			       
			           
			case 5 -> System.out.println("Adidas: Impossible is Nothing");
			        
			          
		default -> System.out.println("Wrong Input");
		}
	}
	
    public static void main(String args[])
    {
        printTagline();
    }

	

}