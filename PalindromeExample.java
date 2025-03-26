import java.util.Scanner;
class PalindromeExample{
   public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter string to check palindrome or not");
    String p = sc.next();
    int pLength = p.length();
    char stringToCharArray [] = new char [pLength];
    char CharArrayToString [] = new char [pLength];
    p.getChars(0,pLength,stringToCharArray,0);
    for(int i = 0;i<pLength;i++){
     	CharArrayToString [i] = stringToCharArray[(pLength-1)-i];
    }
    String reverseString = new String(CharArrayToString);
    /*System.out.println("Original String:"+p);
    System.out.println("Reverse String:"+reverseString);*/
    if(p.equalsIgnoreCase(reverseString)){
     System.out.printf("The given string : %s is a palindrome \n",p);
    }
    else
     System.out.printf("The given string : %s is not a palindrome \n",p);
  }
}