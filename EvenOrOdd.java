import java.util.Scanner;
public class EvenOrOdd{
  public static void main(String args[])
  {
   System.out.println("Enter number to check even or not");
   Scanner sc = new Scanner(System.in);
   int a = sc.nextInt();
   if(a % 2 == 0)
    System.out.printf("%d is a even number \n",a);
   else
    System.out.printf("%d is a odd number \n",a);  
  }
}