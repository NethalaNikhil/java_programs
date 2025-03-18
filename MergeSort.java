import java.util.Scanner;
class MergeSort{
public static void main(String args[])
  {
   int arr[] = arrayCreation();
   int left=0,right= arr.length-1;
   int sortedArray[] = mergeSort(arr,left,right);
   printArray(sortedArray);
  }
  public static int[] arrayCreation()
  {
       int arr[];
       int arrSize;
	  System.out.println("Enter the size of the array");
	  Scanner sc = new Scanner(System.in);
	  arrSize = sc.nextInt();
	  arr = new int[arrSize];
	  for(int i = 0 ; i<arr.length;++i)
	  {
	    System.out.printf("Enter element at position %d value :\n",i);
	    arr[i] = sc.nextInt();
	  }
	  printArray(arr);
	  return arr;
  }
  public static void printArray(int arr[])
  {
   System.out.print("[");
	  for(int j = 0 ; j<arr.length;++j)
	  {
	   if(j == 0)
	   {
	    System.out.print(arr[j]);
	   }
	   else
	   {
	     System.out.print(","+arr[j]);
	   }
	  }
	  System.out.print("]\n");

  }
  public static int[] mergeSort(int arr[],int left,int right)
  {
   if(right>0)
   {
    int mid = right/2;
    mergeSort(arr,left,mid);
    mergeSort(arr,mid+1,right);
    int sortedArray[] = merge(arr,mid,left,right);
   }
   return sortedArray;
 }
 public static int[] merge(int arr[],int mid , int left ,int right)
 {
   int array1Size = (mid-left)+1;
   int array2Size = right - mid;
   int array1[] = new int [array1Size];
   int array2[] = new int [array2Size];
   for(int i=0;i<array1.length;i++)
   {
    array1[i] = arr[i];
   }
   for(int j=0;j<array2.length;j++)
   {
    array1[j] = arr[j+(mid+1)];
   }
   int i=0, j=0; 
   int k =1;
 }
}

