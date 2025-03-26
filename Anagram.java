import java.util.Scanner;
import java.util.Arrays;
class Anagram{
 public static String removingUnwantedData(String str){
  StringBuilder sb = new StringBuilder();
  char c;
  for(int i = 0 ;i<str.length();i++){
    c = str.charAt(i);
    if(Character.isLetter(c)){
     sb.append(c);
    }
  }
   String ans = new String(sb);
   return ans.toLowerCase();
}
public static String sortArray(String str){
  char charArray[] = str.toCharArray();
  Arrays.sort(charArray);
  String ans = new String(charArray);
  return ans;
}
 public static void main (String args[]){
  Scanner sc = new Scanner(System.in);
  String str1 = sc.nextLine();
  String str2 = sc.nextLine();
  String filteredData1 = removingUnwantedData(str1);
  String filteredData2 = removingUnwantedData(str2);
  if(sortArray(filteredData1).equals(sortArray(filteredData2))){
    System.out.println("Given Strings are anagram");
  }
  else
   System.out.println("Given Strings are not anagram");
 }
}