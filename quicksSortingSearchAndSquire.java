package SortingAndSearching;

import java.util.Arrays;
import java.util.Random;
import java.lang.Math; 

public class quicksSortingSearchAndSquire {

	public static void main(String[] args) {
		Random rand = new Random();
		int[] arr = new int[5];
		for(int i=0; i<arr.length; i++) {
			arr[i] = rand.nextInt(30 + 20) - 20; //(max - min) + min;  
			//arr[i] = rand.nextInt(50);			 
		}
		
//		lenearSearchSquire(arr) ;
//		System.out.println("\n");
//		
//		for(int i : arr) {System.out.print(i + "  ");}
//		System.out.println();
//		Quicksort.sortLenear(arr);
//		for(int i : arr) {
//			System.out.print(i + "  ");
//		}
		

	}
//===Lenear sorting SQUIRE==============================
	public static void lenearSearchSquire(int[] arr) {
		int[] squire = new int[arr.length];
		int left = 0;
		int right = arr.length-1;
		Arrays.sort(arr); 
		
		for(int i=0; i<squire.length; i++) {
			if(Math.abs(arr[left]) > arr[right] ) {
				squire[squire.length-1-i] = arr[left] * arr[left];
				left++;
			}else {
				squire[squire.length-1-i] = arr[right] * arr[right] ;
				right--;
			}
		}
		//return squire; 
		for(int i : arr) {
			System.out.print(i + "  ");
		}
		System.out.println();
		for(int i : squire) {
			System.out.print(i + "  ");
		}
	}
	
}
//================================================
//================================================
class Quicksort2  {
    private static int[] numbers;
    private static int number;

    public static void sortLenear(int[] values) {
        if (values ==null || values.length==0){
            return;
        }
        numbers = values;
        number = values.length;
        quicksort(0, number - 1);
    }
//---------------------------------------------------------
    private static void quicksort(int low, int high) {
        int i = low, j = high;
        int pivot = numbers[low + (high-low)/2];  //pivot element from the middle of the list

        // Divide into two lists let and right
        while (i <= j) {
            while (numbers[i] < pivot) {
                i++;
            }
            while (numbers[j] > pivot) {
                j--;
            }

            if (i <= j) {
                exchange(i, j);
                i++;
                j--;
            }
        }
//===== Recursion =================================
        if (low < j)
            quicksort(low, j);
        if (i < high)
            quicksort(i, high);
    }

    private static void exchange(int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }
 //-----------------------------------------------
}