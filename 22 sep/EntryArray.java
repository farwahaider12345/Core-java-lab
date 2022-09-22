/*
Program : Duplicate entries , Sort the array and then remove the duplicate entry.  
@author : Farwa Haider  
@Date : 22 September 2022 
*/
import java.util.Scanner;
//declaring a class 
class EntryArray 
{
	static void inputArray()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		int rows= sc.nextInt();
		
		int arr[]= new int[rows];
		
		System.out.println("Enter the elements:");
		
		for(int i=0;i<rows;i++)
		{	
	     	arr[i]= sc.nextInt();	
		}
		System.out.println();
		
		System.out.println("Array elements are:");
         displayArray(arr);
		
		
		System.out.println();
		
		System.out.println("Duplicate elements are:");
         duplicate(arr);
		
	}
	
	static void displayArray(int myArray[])
	{
		
	   System.out.println();
	
		for(int myrow:myArray)
		{
		 System.out.print(myrow+ "  ");
					
		}
		
	}
   
   static void duplicate(int ar[])
   {
	   for(int i=0; i<ar.length;i++)
	   {
		   for(int j=i+1;j<ar.length;j++)
		   {
			   if(ar[i]==ar[j])
				   System.out.print(ar[i]+ "  ");
		   }
		   
	   }
   }
    //method to input elements in an array
   static void inputArray()
   {
    Scanner sc= new Scanner(System.in); // Scanner object for input of elements
	System.out.println("Enter the size of the array");
	int size= sc.nextInt();
	
	
	int arr[]= new int[size];// creating an array
	
	// loop to enter 10 elements
	 System.out.println("Enter "+ size +" elements");
	for(int i=0;i<size;i++)
	{
	  arr[i]= sc.nextInt();// taking integer input
	}
    // end of for
	 System.out.println("-------Array before Sorting are :----------");
   display(arr); // calling display method
   
  // sortArray(arr);
   
   Arrays.sort(arr); // sorting using java.util.Arrays
    
   System.out.println("-------Array after Sorting are :----------");
   display(arr); // calling display method
    
   }
   // end of inputArray method
   static void sortArray(int myar[])
   {
	   int temp;
	   for(int i=0;i<myar.length-1;i++)
	   {
		   for(int j=i+1;j<myar.length;j++)
		   {
			   if(myar[i]>myar[j])
			   {
				   temp = myar[i];
				   myar[i]=myar[j];
				   myar[j]=temp;
			   }
		   }
	   }
	    System.out.println();
	    System.out.println("-------Array after Sorting are :----------");
        displayEnhancedFor(myar); // calling display method
	   
   }
  
   static void displayEnhancedFor(int ar[])
   {
	  for(int i:ar)  // int : data type of array 
	  {
		  System.out.print(i+ "  ");
		  
	  }
    
	   
   }

	static void inputArray()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		int rows= sc.nextInt();
		
		
		int arr[]= new int[rows];
		
		System.out.println("Enter the elements:");
		
		
		for(int i=0;i<rows;i++)
		{
				
	     	arr[i]= sc.nextInt();
			
			
		}
		
        Arrays.sort(arr); // sorting the elements		

		System.out.println();
		
		System.out.println("Array elements are:");
         displayArray(arr);
		
		System.out.println();
		
		System.out.println("Removing Duplicate elements:");
        removeDuplicate(arr);
		
		
		
		
	}
	
	static void displayArray(int myArray[])
	{
		
	   System.out.println();
	
		for(int myrow:myArray)
		{
		 System.out.print(myrow+ "  ");
					
		}
		
	}
   
   static void removeDuplicate(int myArray[])
   {
	   int size= myArray.length;
	   int new_size;
	   if(size==0||size==1)
		   new_size=size;
	   
	   int temp[] = new int[size];
	   int j=0;
	   for(int i=0;i<size-1;i++)
	   {
		   if(myArray[i]!=myArray[i+1])
		   {
			   temp[j++]=myArray[i];
		   }
	   }
	   temp[j++]=myArray[size-1];
	   
	   //changing original array
	   for(int i=0; i<j;i++)
	   {
		   myArray[i]= temp[i];
	   }
	   
	   
	   //printing after removing duplicate entries
	   
	   for(int i=0;i<j;i++)
	   {
		   System.out.print(myArray[i]+"  ");
	   }
   }

   public static void main(String ...args)
  {

     inputArray();

  }


} 