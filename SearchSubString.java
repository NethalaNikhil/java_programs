import java.util.Scanner;
class SearchSubString{
 public static void main (String args[]){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter String:");
  String s = sc.nextLine();
  System.out.println("Enter String want to search from above string:");
  String search = sc.nextLine();
  int sLength = s.length();
  int searchLength = search.length();
  boolean flag = false;
  for(int i =0 ;i<=(sLength - searchLength);i++){
   if(s.regionMatches(i,search,0,searchLength)){
    flag = true;
    System.out.printf("String %s matches subString from %s \n : ",s,s.substring(i,i+searchLength));
    break;
   }
  }
   if(!flag){
    System.out.printf("The sub-String %s not found on String : %s",search,s);
   }
 }
}