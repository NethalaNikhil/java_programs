//nethala nikhil
//Nethala nikhil
import java.util.Scanner;
class Task{
 public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   String name = sc.nextLine();
   char c ;
   StringBuilder sb = new StringBuilder();
   for(int i=0 ; i<name.length();i++){
    c = name.charAt(i);
    if(Character.isUpperCase(c)){
     sb.append(c);
    }
   }
   System.out.println(sb);
   }
}