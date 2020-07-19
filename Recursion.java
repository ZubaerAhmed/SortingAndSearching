package SortingAndSearching;

import java.util.Arrays;

public class Recursion {
//Goto web to learn recursion -> algoexpert.io
/*
Recursion Idea:
1. Base Case: If array size is 1, return.
2. Do One Pass of normal Bubble Sort. 
   This pass fixes last element of current subarray.
3. Recur for all elements except last of current subarray.
 */
    public static void main(String[] args){
        int arr[] = {64, 34, 3, 25, 10, 12, 22, 11, 90}; 
        System.out.println("Array elements: ");
        System.out.println(Arrays.toString(arr)); 
//// METHOD FOR RECURSION BUBLE SORT------------------------------
//        recursionBubbleSort(arr, arr.length);       
//        System.out.println("Sorted array : ");
//        System.out.println(Arrays.toString(arr));
////--Searching with Bubble sort----------------------------------
//        int x = 3;  
//        int index = recursionBubbleSearch(arr, 0, arr.length-1, x); 
//        if (index != -1) 
//           System.out.println("Element " + x + " is present at index " + index); 
//        else
//            System.out.println("Element " + x + " is not present"); 
//--Searching with Binary Recursion-----------------------------------
        int n = arr.length; 
        int searchingValue = 10; 
        int result = recursionBinarySearch(arr, 0, n - 1, searchingValue); 
        if (result == -1) System.out.println("Element not present"); 
        else System.out.println(searchingValue+" Element found at index " + result); 
       
    }
//===Recursion for bubble SORT=========================================
    static void recursionBubbleSort(int arr[], int n){
        if (n == 1) return;      

        for (int i=0; i<n-1; i++)
            if (arr[i] > arr[i+1]) {
                //swap arr[i], arr[i+1]
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }      
        // Largest element is fixed, recur for remaining array
        recursionBubbleSort(arr, n-1);
    }
//===recursion for bubble SEARCH==========================================  
    public static int recursionBubbleSearch(int arr[], int l, int r, int x) { 
         if (r < l) 
            return -1; 
         if (arr[l] == x) 
            return l; 
         if (arr[r] == x) 
            return r; 
         return recursionBubbleSearch(arr, l+1, r-1, x); 
    } 
 //===Recursion with binary Search==================================
    public static int recursionBinarySearch(int arr[], int l, int r, int x) { 
        if (r >= l) { 
            int mid = l + (r - l) / 2; 
            // If the element is present at the middle itself 
            if (arr[mid] == x) 
                return mid; 
            // If element is smaller than mid, then it can only 
            // be present in left subarray 
            if (arr[mid] > x) 
                return recursionBinarySearch(arr, l, mid - 1, x);   
            // Else the element can only be present in right 
            // subarray 
            return recursionBinarySearch(arr, mid + 1, r, x); 
        } 
        // We reach here when element is not present in array 
        return -1; 
    } 
      
} // closing bracket for Recursion class
