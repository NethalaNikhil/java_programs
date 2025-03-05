import java.util.Scanner;
public class SumOfn{
 public static void main (String args[])
 { 
  System.out.println("Enter n value");
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  if(n == 0)
  {
   System.out.println("Zero");
   return;
  }
  else if(n>0 && n%2 ==0)
  {
   System.out.println("Positive even number");
   return;
  }
  else if(n>0 && n%2 !=0)
  {
   System.out.println("Positive odd number");
   return;
  }
  else if(n<0 && n%2 ==0)
  {
   System.out.println("negative even number");
   return;
  }
  else{
   System.out.println("negative odd number");
   return;
  }


 }
}