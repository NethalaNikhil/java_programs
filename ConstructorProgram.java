class ConstructorProgram{
public static void main(String args[])
{
	ConstructorTest ct = new ConstructorTest();
	ct.print();
}
}
class ConstructorTest{
int x,y;
ConstructorTest(){
 this(10,10);
 System.out.printf("x = %d \ny= %d",x,y);  
}
ConstructorTest(int x , int y)
{
 this.x = x;
 this.y = y;
}
void print(){
System.out.printf("x = %d \ny= %d",x,y); 
}
}