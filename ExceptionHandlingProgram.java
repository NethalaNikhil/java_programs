import java.util.Scanner;
import java.io.*;
class ExceptionHandlingProgram
{
 public static void main(String args[])
  {
 try
 {
  /*
  int a = Integer.parseInt(args[0]);
  int b = Integer.parseInt(args[1]);
  System.out.println("All arguments are passed");
  int c = a+b;
  System.out.println("Total of both :"+c);
  */
  Scanner s = new Scanner(new File("test20.text"));
  System.out.println("File was founded");
  }
catch(FileNotFoundException E)
{
  System.out.println("Particular file is not found ");
}
finally{
System.out.println("And finally block also excuted");
}
}
}