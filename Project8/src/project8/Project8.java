package project8;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Project8 {

    public static void main(String[] args)
    { Scanner input = new Scanner(System.in);
      System.out.print("Enter array size: ");
      int arraySize = input.nextInt();
      int[] myArray = new int[arraySize];
      populateArray(myArray);
      
      //Bubble Sort
      long start = System.currentTimeMillis();
      SortingAlgorithms.BubbleSort(myArray.clone());
      long elapsed = System.currentTimeMillis() - start; 
      System.out.println("Bubble Sort: " + elapsed + " (ms.)");
      
      //Bubble Sort Short Circuit
      start = System.currentTimeMillis();
      SortingAlgorithms.BubbleSortSC(myArray.clone());
      elapsed = System.currentTimeMillis() - start; 
      System.out.println("Bubble Sort (SC): " + elapsed + " (ms.)");
      
      //Gnome Sort
      start = System.currentTimeMillis();
      SortingAlgorithms.GnomeSort(myArray.clone(), myArray.length - 1);
      elapsed = System.currentTimeMillis() - start; 
      System.out.println("Gnome Sort: " + elapsed + " (ms.)");
      
      //Selection Sort
      start = System.currentTimeMillis();
      SortingAlgorithms.SelectionSort(myArray.clone());
      elapsed = System.currentTimeMillis() - start; 
      System.out.println("Selection Sort: " + elapsed + " (ms.)");
      
      //Insertion Sort
      start = System.currentTimeMillis();
      SortingAlgorithms.InsertionSort(myArray.clone());
      elapsed = System.currentTimeMillis() - start; 
      System.out.println("Insertion Sort: " + elapsed + " (ms.)");
      
      //Merge Sort
      start = System.currentTimeMillis();
      SortingAlgorithms.MergeSort(myArray.clone());
      elapsed = System.currentTimeMillis() - start; 
      System.out.println("Merge Sort: " + elapsed + " (ms.)");
      
      //Java Sort
      start = System.currentTimeMillis();
      Arrays.sort(myArray.clone());
      elapsed = System.currentTimeMillis() - start; 
      System.out.println("Java Sort: " + elapsed + " (ms.)");
      
      //Quick Sort
      start = System.currentTimeMillis();
      SortingAlgorithms.QuickSort(myArray.clone(), 0, myArray.length - 1);
      elapsed = System.currentTimeMillis() - start; 
      System.out.println("Quick Sort: " + elapsed + " (ms.)");
    }
    
    public static void populateArray(int[] array)
    { Random rand = new Random();
      for(int i = 0; i < array.length; i++)
         array[i] = rand.nextInt(1001);
    }
}
