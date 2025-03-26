public class EncapsulationExample{
 public static void main(String args[]){
 Student.setCGPA(9.7f);
 System.out.println(Student.getCGPA());
  }
}
class Student{
 String name;
 private static float CGPA;
 public static void setCGPA(float newCGPA){
  CGPA = newCGPA;
 }
 public static float getCGPA(){
  return CGPA; }
}