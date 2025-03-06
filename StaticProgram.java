class StaticProgram{
 public static void main (String args[]){
    StaticTest st = new StaticTest();
    StaticTest st1 = new StaticTest();
    StaticTest st2 = new StaticTest();
    StaticTest.print();
   }
}
class StaticTest{
static int no_of_objectsCreated;
  StaticTest()
  {
   no_of_objectsCreated++;
  }
  static void print(){
   System.out.println("count:"+no_of_objectsCreated); 
  }

}
