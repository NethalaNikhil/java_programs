import java.io.*; // * because it consists both IoException and InputStreamReader
class JavaBufferReaderProgram
{
  public static void main (String args[]) throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter String value");
    String s = br.readLine();
    System.out.println("The Entered value is "+ s);
  }
}