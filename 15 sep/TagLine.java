/*
Program : Write a java program to print the tagline of any 5 companies (Enahnced switch case)(Lab test)
@author : Farwa Haider  
@Date : 15 September 2022
*/
//declaring a class
class TagLine 
{
	//method 
	static void printTagLine()
	{
		int brand=5;  //taking input
		Switch(Tagline);   //using switch case
		
		//using different switch case 
		
		{
		     case "Nike" -> System.out.println("Nike: Just do it"); //first case and printing
			       
			 case "Burger King" -> System.out.println("Burger King: Have it your way"); //second case and printing 
			      
			 case "Lays "-> System.out.println("Lays: Just can't eat one"); //third case and printing
			        
			 case "Mcdonalds " -> System.out.println("Mcdonalds: I am loving it"); //fourth case and printing
			          
			 case "Tesco" -> System.out.println("Every little help"); //fifth case and printing
				          
		     default -> System.out.println("Wrong Input");  //default case and printing
			
		}
		//switch case ends 
	}
	//main method
    public static void main(String ...args)
    {
		//calling printTagline method 
        printTagLine();
    }

	

}
//end of a class