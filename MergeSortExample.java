import java.util.Scanner;
class MergeSortExample{
 public static void main(String args[]){
 int arr[] = arrayCreation();
 mergeSort(arr,0,arr.length-1);
 printArray(arr);
 }
 public static int[] arrayCreation(){
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
  public static void printArray(int arr[]){
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

 public static void mergeSort(int arr[], int leftArr,int rightArr){
  	if(leftArr<rightArr){
  	 int midOfArr = (leftArr+rightArr)/2;
  	 mergeSort(arr,leftArr,midOfArr);
  	 mergeSort(arr,midOfArr+1,rightArr);
  	 mergeArr(arr,leftArr,midOfArr,rightArr);
  	}
 }
 
 public static void mergeArr(int arr[],int leftArr,int midOfArr, int rightArr){
 	int leftArrSize = (midOfArr - leftArr)+1 ;
 	int rightArrSize = rightArr - midOfArr ;
 	int array1[] = new int [leftArrSize];
 	int array2[] = new int [rightArrSize];
 	for(int i = 0 ; i< leftArrSize;i++){
 	 array1[i] = arr[leftArr+ i];
 	}
 	for(int j=0 ; j< rightArrSize;j++){
 	 array2[j] = arr[midOfArr +1+j];
 	}
 	int n = 0 ;
 	int m = 0 ;
 	int k = leftArr;
 	while(n<leftArrSize && m< rightArrSize){
 	  if(array1[n]<array2[m]){
 	   arr[k] = array1[n];
 	   n++;
 	  }
 	  else{
 	   arr[k] = array2[m];
 	   m++;
 	}
 	k++;
 	}
 	
 	while(n<leftArrSize ){
 	arr[k] = array1[n];
 	n++;
 	k++;
 	}
 	while(m<rightArrSize){
 	arr[k] = array2[m];
 	m++;
 	k++;	
     }
  }
 } 