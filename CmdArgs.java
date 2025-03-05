public class CmdArgs
{
  public static void main(String args[])
  {
   if(args.length>0)
   {
   	System.out.println("Arguments are available");
   	for(String str : args)
   	{
   	 System.out.println(str);
   	}
   	
   }
   else
    System.out.println("No arguments available ");
  }
}