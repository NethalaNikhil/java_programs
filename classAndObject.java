class classAndObject{
 public static void main(String args[])
 {
   Complex c1 = new Complex(10,20);
   c1.print();
   Complex c2 = new Complex(20,30);
   c1.add(c2);
   c1.print();
 }
}
class Complex{
 int real,img;
 void print()
 {
   System.out.println(real+"+i"+img);
 }
 Complex(int r , int i)
 {
  real = r;
  img = i;
 }
 void add(Complex c)
 {
  real = real + c.real;
  img  = img+c.img;
 }
}