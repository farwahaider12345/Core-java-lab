/*
Program : Find the largest and the second largest number in a array (lab test)
@author : Farwa Haider 
@Date : 25 August 2022
*/
// declaring a class 
class Array
{
	//method to print Array
   static void printArray(int arr[])
   {
	   
	   // printing all the elements of the array
	    for(int i:arr)
		{
			System.out.println(i);
		}
	   
	   sortArray(arr);
	   	   
	   
   }
   
   // method to sort the array
   
   static void sortArray(int myarray[])
   {
	   int len= myarray.length;
	   System.out.println("The size of the array is :"+len);
	   int temp;
	   // sorting the array in order
	   
	   for(int j=0;j<len;j++)
	   {
		   for(int k=j+1;k<len;k++)
		   {
			   if(myarray[j]>myarray[k])
			   {
				   temp=myarray[j];
				   myarray[j]=myarray[k];
				   myarray[k]=temp; //swapping the values
				   
			   }
				   
		   }
		   
	   }
	   // ending sorting
	   
	   System.out.println("Largest element is:"+ myarray[len-1]); //print largest number
	   System.out.println("Second Largest element is:"+ myarray[len-2]); //print second largest number
	   
   }

    //calling main method
   public static void main(String ...args)
   {
	   printArray(45,89,56,87,90,3,7); //giving values
	  int size =args.length; 

	  int newArray[]= new int[size];
	   
	   // setting array elements
	   for(int i=0;i<size;i++)
	   {
		   newArray[i]= Integer.parseInt(args[i]);
	   }
	   //calling printArray 
	 	printArray(newArray);   
   }

  
}