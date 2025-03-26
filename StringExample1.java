class StringExample1{
 public static void main(String args[]){
  String s1 = "Hello";
  String s2 = s1;
  String s3 = "Hello";
  String s4 =  new String("Hello");
  if(s1==s4)
  {
    System.out.println("true");
  }
  else
   System.out.println("false");

}
}