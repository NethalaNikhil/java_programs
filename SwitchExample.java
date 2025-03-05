import java.util.Scanner;
public class SwitchExample{
   public static void main (String args[])
   {
     int x=0;
     System.out.println("Enter L to reduce value \nEnter R to increase value \n");
     Scanner sc = new Scanner(System.in);
     char move = sc.next().charAt(0);
     sc.nextLine();
     switch(move)
     {
       case 'L':
        x--;
        System.out.println(x);
        sc.close();
        break;
       case 'R':
        x++;
        System.out.println(x);
        sc.close();
        break;
       default:
       System.out.println("Enter valid character");     
     }
   }
}