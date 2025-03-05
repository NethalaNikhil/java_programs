public class BreakAndContinue{
 public static void main(String args[])
 {
   int i,j;
   for(i = 0 ; i<2;i++)
   {
    for(j=0;j<2;j++)
    {
     if(i==1)
     {
      break;
     }
     System.out.println(j);
    }
    }
 }
}