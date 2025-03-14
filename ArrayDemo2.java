import java.util.Scanner;
class ArrayDemo2{
 public static void main (String args[]){
   Student studArr[] = new Student[5];
   for(int i=0; i<studArr.length;i++){
     System.out.printf("Enter student%d name:\n",i);
     Scanner sc = new Scanner(System.in);
     String stuName = sc.next();
     System.out.printf("Enter student%d Marks:\n",i);
	int marks = sc.nextInt();
	studArr[i] =  new Student(stuName,marks);
   }
   for(int j=0; j<studArr.length;j++)
   {
     System.out.print(studArr[j].name+":");
     System.out.println(studArr[j].marks);

   }
 }
}
class Student{
 String name;
 int marks;
 Student(String name, int marks)
 {
  this.name = name;
  this.marks = marks;
 }
}