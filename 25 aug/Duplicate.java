/*
Program : Write a program to remove duplicate entry from array (lab test)
@author : Farwa Haider 
@Date : 25 August 2022
*/
// declaring a class 
 class Duplicate
 {  
 //method to remove elements
  static void removeElements(int arr[], int n)
  {  
        if (n==0 || n==1){  
            return n;  
        }  
        int[] temp = new int[n];  //swapping 
        int j = 0;  
        for (int i=0; i<n-1; i++){  
            if (arr[i] != arr[i+1]){  
                temp[j++] = arr[i];  
            }  
         }  
        temp[j++] = arr[n-1];     
        // Changing original array  
        for (int i=0; i<j; i++){  
            arr[i] = temp[i];  
        }  
        return j;  
    }  
       
    public static void main (String ...args)
	{  
        int arr[] = {10,20,20,30,30,40,50,50};  
        int length = arr.length;
        //calling method	
        length = removeElements(arr, length);  
        //printing array elements  
        for (int i=0; i<length; i++)  
           System.out.print(arr[i]+" ");  
    } 
 }	