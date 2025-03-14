import java.util.Scanner;
class ArrayDemo3{
 public static void main(String args[]){
  int arr[];
  int arrSize;
  System.out.println("Enter the size of the array");
  Scanner sc = new Scanner(System.in);
  arrSize = sc.nextInt();
  arr = new int[arrSize];
  for(int i = 0 ; i<arr.length;++i)
  {
    System.out.printf("Enter array position %d value :\n",i);
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
  System.out.print("]");
 }
}