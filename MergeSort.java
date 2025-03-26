import java.util.Scanner;
class MergeSort{
public static void main(String args[])
  {
   int arr[] = arrayCreation();
   int left=0,right= arr.length-1;
   mergeSort(arr,left,right);
   printArray(arr);
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
  public static void mergeSort(int arr[],int left,int right)
  {
    if(left<right)
    {
	    int mid = (left+right)/2;
	    mergeSort(arr,left,mid);
	    mergeSort(arr,mid+1,right);
	    merge(arr,mid,left,right);
    } 	
 }
 public static void merge(int arr[],int mid , int left ,int right)
 {
   int array1Size = (mid-left)+1;
   int array2Size = right - mid;
   int array1[] = new int [array1Size];
   int array2[] = new int [array2Size];
   for(int i=0;i<array1Size ;i++)
   {
    array1[i] = arr[left+i];
   }
   for(int j=0;j<array2Size;j++)
   {
    array2[j] = arr[j+(mid+1)];
   }
   int i=0, j=0; 
   int k =left;
   while(i<array1Size && j <array2Size )
   {
     if(array1[i]<=array2[j])
     {
      arr[k] = array1[i];
      i++;
     }
     else
     {
       arr[k] = array2[j];
       j++;
     }
     k++;
   }
   while(i<array1Size)
   {
    arr[k] = array1[i];
    i++;
    k++;
   }
    while(j<array2Size)
    {
    arr[k] = array2[j];
    j++;
    k++;
    }
   
 }
 
}

