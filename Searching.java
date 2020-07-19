package SortingAndSearching;

import java.util.Arrays;
import java.util.Random;
public class Searching {

	public static void main(String[] args) { 
		int[] arr = generateRandomArray();
		printArray(arr);
		System.out.println("\nlinear Search For Value"); 
		System.out.println(linearSearchForValue(arr, 8));
		//----------------------------------------------
		System.out.println("\nbinary Search For Value"); 
		System.out.println(binarySearchForValue(arr, 8) );
	
	}
//=================================================================
//--Leanear search ------------------------------------------------
	public static String linearSearchForValue(int[] arr, int value){	
		boolean bool = false;
		for(int i=0; i<arr.length; i++){			
			if(arr[i] == value) {			
				System.out.println(i + " index is: "+ arr[i]+" -> ");
				bool = true;
			}//else {System.out.println("Not matching with: "+ value); }			
		}
		return (value + " " + bool);
	}
//=======Built-in search (Arrays)======================================
	public static void binarySortSearch() {
        byte byteArr[] = {10,20,15,22,35}; 
        char charArr[] = {'g','p','q','c','i'}; 
        int intArr[] = {10,20,15,22,35}; 
        double doubleArr[] = {10.2,15.1,2.2,3.5}; 
        float floatArr[] = {10.2f,15.1f,2.2f,3.5f}; 
        short shortArr[] = {10,20,15,22,35}; 
  //Before searching need to do sorting
        Arrays.sort(intArr);
        int intKey = 22; 
        System.out.println(intKey + " found at index = "
        					+ Arrays.binarySearch(intArr,intKey)); 
	}
//--Binary Search --------------------------------------------------
// The Binary Search is quicker than the linear search
// because all the values are sorted. 
// Because everything is sorted once you get to a number larger than 
// what you are looking for you can stop the search. 
// Also you be able to start searching from the middle which speeds the search. 
// (NO DUPLICATE ELEMENT) It works best when there are no duplicates.
		
		public static String binarySearchForValue(int[] theArray, int value){		 
			boolean bool = false;
			int lowIndex = 0;
			int highIndex = theArray.length-1;			
			while(lowIndex <= highIndex){			
				int middleIndex = (highIndex + lowIndex) / 2;			
				if(theArray[middleIndex] < value) 
					lowIndex = middleIndex + 1;			
				else if(theArray[middleIndex] > value) 
					highIndex = middleIndex - 1;				
				else {					
					System.out.println("Found a Binary Match for " + value + " at Index " + middleIndex);					
					lowIndex = highIndex + 1;
					bool = true;
				}			
				
				//printArray(theArray);
			}
			return (value + " " + bool); 
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
//---PRINT array--------------------------------------------------
		public static void printArray(int[] arr) {
			System.out.println("Array elements are:");
			for(int i : arr)
				System.out.print(i + ", ");
			System.out.println("");
		}
}  // closing bracket fpr Searching class
