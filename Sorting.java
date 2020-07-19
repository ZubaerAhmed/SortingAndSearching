package SortingAndSearching;

import java.util.Arrays;
import java.util.Random;

public class Sorting {
	public static void main(String[] args) {
		int[] arr = generateRandomArray();
		printArray(arr);		
		bubbleSort(arr);		
		selectionSort(arr);
	}
//-- (Q: Linear sort NOT possible?----------------------------------
//-- bubble Sort ---------------------------------------------------
	public static void bubbleSort(int[] arr){		
		// i starts at the end of the Array
		// As it is decremented all indexes greater
		// then it are sorted		
		for(int i=arr.length-1; i>1; i--){		
			// The inner loop starts at the beginning of 
			// the array and compares each value next to each other. 
			// If the value is greater then they are 
			// swapped			
			for(int j = 0; j<i; j++){				
				if(arr[j] > arr[j+1]){					
//					int temp = arr[j];
//					arr[j] = arr[j+1];
//					arr[j+1] = temp;
					swapValues(arr, j, j+1);
				}				
			}		
		}
		System.out.println("\nBuble sorting");
		printArray(arr);
	}
//--- selection Sorting ----------------------------------------
// Selection sort search for the smallest number in the array
		// saves it in the minimum spot and then repeats searching
		// through the entire array each time		
	public static void selectionSort(int[] theArray){
		int arraySize = theArray.length;
		for(int i=0; i < arraySize; i++){
			  int minimum = i;				  
			  for(int y=i; y<arraySize; y++){				  
				  // To change direction of sort just change 
				  // this from > to <					  
				  if(theArray[minimum] > theArray[y]){
					  minimum = y;
				  }
			  }				  
			  swapValues(theArray, i, minimum);	 			  
			 // printArray(theArray, x, -1);
		}
		System.out.println("\nSelection sorting");
		printArray(theArray);
	}	
//---Insertion Sort-------------------------------------
// The Insertion Sort is normally the best of 
// the elementary sorts. Unlike the other sorts that
// had a group sorted at any given time, groups are
// only partially sorted here.	
	public void insertionSort(int[] theArray){	
		for (int i=1; i<theArray.length; i++){
			  int j = i;
			  int toInsert = theArray[i];
			  while ((j > 0) && (theArray[j-1] > toInsert)){
				  theArray[j] = theArray[j-1];
				  j--;			  
				  //printArray(theArray, i, j);				  
			  }
			  theArray[j] = toInsert;		  
			  //printArray(theArray, i, j); 
			  
			  System.out.println("\nArray[i] = " + theArray[i] + " Array[j] = " + theArray[j] + " toInsert = " + toInsert + "\n");		  
		}
		
	}
//--generate Random Array------------------------------------------
	public static int[] generateRandomArray(){	
		int[] arr = new int[10]; // Creates an array with 50 indexes	
		for(int i = 0; i < arr.length; i++){	
			//arr[i] = (int)(Math.random()*100);
			arr[i] = new Random().nextInt(10 + 10) - 10;
		}
		//for(int i : arr)System.out.print(i + " ");
		System.out.println();
		return arr;
	}		
//----swap Values ---------------------------------------
	public static void swapValues(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
//---PRINT array--------------------------------------------------
	public static void printArray(int[] arr) {
		System.out.println("Array elements:");
		for(int i : arr)
			System.out.print(i + ", ");
		System.out.println("");
	}
	
} // closing bracket for SortingSummery
