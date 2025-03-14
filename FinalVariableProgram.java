class FinalVariableProgram{
  public static void main(String args[])
  {
  /*
   final int a;
   {a =100;}
   System.out.println("a = "+a);
   */
   FinalVariableTest1 ft = new FinalVariableTest1();
   ft.func();
  }
}
class FinalVariableTest extends FinalVariableTest1{
 void func(){
   System.out.println("Hi");
 }
}
final class FinalVariableTest1{
  void func(){
   System.out.println("Hello");
 }
}
