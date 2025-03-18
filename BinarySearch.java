import java.util.Scanner;
class BinarySearch{
public static void main(String args[])
  {
   int arr[] = arrayCreation();
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter element to search");
   int element = sc.nextInt();
   int low=0;
   int high= (arr.length)-1;
   int result = binarySearch(arr,element,low,high);
   if(result == -1)
   System.out.println("Element is not found in the given array");
   else
    System.out.printf("Element is found at %d position in the array\n",result);
  }
  public static int[] arrayCreation()
  {
       int arr[];
       int arrSize;
	  System.out.println("Enter the size of the array in sorted order only");
	  Scanner sc = new Scanner(System.in);
	  arrSize = sc.nextInt();
	  arr = new int[arrSize];
	  for(int i = 0 ; i<arr.length;++i)
	  {
	    System.out.printf("Enter element at position %d value :\n",i);
	    arr[i] = sc.nextInt();
	  }
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
	  return arr;
  }
  public static int binarySearch(int arr[],int element,int low, int high){
   if(low>high)
   {
      return -1;
   }
    int mid = (low + high)/2;
    if(arr[mid] == element)
     return mid;
    else if(element>arr[mid])
      return binarySearch(arr,element,mid+1,high);
    else
      return binarySearch(arr,element,low,mid-1);
    }

}
