public class MethodsExample{
 int x,y;
}
class TestMethods{
 public static void main(String args[])
 {
   MethodsExample me = new MethodsExample();
   me.x = 10;
   me.y = 20;
   fun1(me);
   System.out.println(me.x +" " +me.y);
 }
 public static void fun1(MethodsExample me)
 {
   me = new MethodsExample();
   me.x = 30;
   me.y = 40;
 } 
}