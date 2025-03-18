import java.util.Scanner;
class BubbleSort{
public static void main(String args[])
  {
   int arr[] = arrayCreation();
   int sortedArray[] = bubbleSort(arr);
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
  public static int[] bubbleSort(int arr[]){
     boolean swapped;
     int n = arr.length;
     int temp;
     for(int i=0;i<n-1;i++)
     {
       swapped = false;
       for(int j=0;j< n-1 ;j++)
       {
         if(arr[j]>arr[j+1])
         {
          temp = arr[j+1];
          arr[j+1] = arr[j];
          arr[j] = temp;
          swapped = true;
         }
       }
       if(swapped == false)
          break;
     }
     return arr;
   }
}

