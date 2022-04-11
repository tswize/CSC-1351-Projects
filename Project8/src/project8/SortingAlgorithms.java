//Teddie Swize
//89-591-0511
//TA: Zeke Abshire
//Submitted around 1745

package project8;

public class SortingAlgorithms 
{ 
  public static void BubbleSort(int[] array) //bubble up the max
  { 
    for(int i = 0; i < array.length-1; i++) //this loop will go through array (broad)
       for(int j = 0; j < array.length-i-1; j++) //this for loop with go through array to compare, possibly swap, and shift
          if(array[j] > array[j+1])
          { int temp = array[j];
            array[j] = array[j+1];
            array[j+1] = temp;
          }
    // [5, 3, 7, 6] --> array.length = 4; array.length-1 = 3; array.length-i-1
    // i = 0 (0<3), j = 0 (j<3)
    // array[0] = 5 > array[1] = 3
    // temp = 5, array[0] = 3, array[1] = 5
    // [3, 5, 7, 6]
    // i = 0, j = 1 (j<3)
    // array[1] = 5 < array[2] = 7
    // i = 0, j = 2 (j<3)
    // array[2] = 7 > array[3] = 6
    // temp = 7, array[2] = 6, array[3] = 7
    // [3, 5, 6, 7]
    // i = 0, j = 3 (j is not < 3), end loop
    // i = 1 (i<3), j = 0 (j<2) 
    // array[0] = 3 < array[1] = 5....will keep going even though already sorted
  }
  
  public static void BubbleSortSC(int[] array)
  { for(int i = 0; i < array.length-1; i++)
    {  boolean swap = false;
       for(int j = 0; j < array.length-i-1; j++)
       {  if(array[j] > array[j+1])
          { int temp = array[j];
            array[j] = array[j+1];
            array[j+1] = temp;
            swap = true;
          }
       }
       if(!swap)
         break;
    }
    // works the same as bubble sort above except that
    // while bubble sort above kept going even after it was completely sorted
    // short circuit incorporates boolean swap to end once no more swaps
  }
 
  //assume first element min; loop thru rest, find min, replace it w/first element
  public static void SelectionSort(int[] array) 
  { for(int i = 0; i < array.length - 1; i++)
    {  int index = i;
       for(int j = i + 1; j < array.length; j++)
          if(array[j] < array[index])
            index = j;
       int smallerNumber = array[index];
       array[index] = array[i];
       array[i] = smallerNumber;
    }
    //[5, 3, 7, 6] --> array.length = 4
    // i = 0 (i<3)
    // index = 0
    // j = 0 + 1 = 1 (j<4)
    // array[1] = 3 < array[0] = 5 --> index = 1
    // j = 2 (j<4)
    //array[2] = 7 > array[1] = 3 --> index = 1
    // j = 3 (j<4)
    //array[3] = 6 > array[1] = 3 --> index = 1
    // j = 4 (j is not < 4)
    // smallerNum = array[1] = 3
    // array[1] = array[0]
    // array[0] = 3
    // [3, 5, 7, 6]
    // i = 1....until all sorted
  }
  
  public static void InsertionSort(int[] array) //start at second element, compare each item w/item to left, if smaller move to right location
  { int i, key, j;
    for(i = 1; i < array.length; i++)
    {  key = array[i];
       j = i - 1;
       while(j >=0 && array[j] > key)
       {  array[j + 1] = array[j];
          j = j - 1;
       }
       array[j + 1] = key;  
    }
    // [5, 3, 7, 6]
    // i = 1 (i<4)
    // key = array[1] = 3
    // j = 1-1 = 0
    // while(j = 0 (j >= 0) and 5>3)
    //      array[1] = array[0] = 5)
    //      j = 0 - 1 = -1 (exit while loop)
    // array[-1+1] = array[0] = 3 
    // [3, 5, 7, 6]
  }
    
  public static void MergeSort(int[] array)
  { if(array.length < 2)
      return;
    int mid = array.length/2;
    int[] l = new int[mid];
    int[] r = new int[array.length - mid];
    
    for(int i = 0; i < mid; i++)
       l[i] = array[i];
    
    for(int i = mid; i <array.length; i++)
       r[i - mid] = array[i];
    
    MergeSort(l);
    MergeSort(r);
    
    merge(array, l, r, mid, array.length - mid);
  }
  
  public static void merge(int[] array, int[] l, int[] r, int left, int right)
  { int i = 0, j = 0, k = 0;
    
    while(i < left && j < right)
    { if(l[i] <= r[j])
      { array[k] = l[i];
        i++;
      }
      else
      { array[k] = r[j];
        i++;
      }
      k++;
    }
    
    while (i < left)
      array[k++] = l[i++];
    while(j < right)
      array[k++] = r[j++];
  }
  
  // code for Gnome Sort from GeeksforGeeks 
  public static void GnomeSort(int arr[], int n)
  { int index = 0;
    while (index < n) 
    {   if (index == 0)
            index++;
        if (arr[index] >= arr[index - 1])
            index++;
        else 
        {   int temp = 0;
            temp = arr[index];
            arr[index] = arr[index - 1];
            arr[index - 1] = temp;
            index--;
            }
    }
     //   return;
  }
  
 // code for Quick Sort from GeeksforGeeks
  public static void swap(int[] arr, int i, int j)
  { int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
  
  public static int partition(int[] array, int low, int high)
  { int pivot = array[high];
    int i = (low - 1);
    
    for(int j= low; j <= high - 1; j++)
    {  if(array[j] < pivot)
       { i++;
         swap(array, i, j);
       }
    }
    swap(array, i + 1, high);
    return(i + 1);
  }
  
  public static void QuickSort(int[] array, int low, int high)
  { if(low < high) 
    { int pi = partition(array, low, high);
      QuickSort(array, low, pi - 1);
      QuickSort(array, pi + 1, high);
    }
  }  
}
