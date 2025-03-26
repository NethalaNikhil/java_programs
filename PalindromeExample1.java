import java.util.Scanner;
class PalindromeExample1{
   public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter string to check palindrome or not");
    String p = sc.nextLine();
    StringBuilder sb = new StringBuilder(p);
    /*String[] days = p.split("\\s");
    for(int i = 0 ;i<days.length;i++){
     sb.insert(0,days[i]);
     if(i<days.length){
      sb.insert(0,' ');
     }
   }
   String reverse = new String(sb);*/
   sb.reverse();
   System.out.println(sb);
 }
}
