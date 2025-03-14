public class ExceptionDemo {
 public static void main(String args[])
 {
   int balance;
   try{
    balance = Integer.parseInt(args[0]);
    updateBalance(balance);
   }
   catch (InvalidBalanceException ex){
   System.out.println(ex);
   }
   catch (NumberFormatException ex){
   System.out.println(ex);
   }
   catch (ArrayIndexOutOfBoundsException ex){
   System.out.println(ex);
   }
   catch (Exception ex){
   System.out.println(ex);
   }
 }
  public static void updateBalance(int number) throws InvalidBalanceException {
     if(number < 0)
     {
       throw (new InvalidBalanceException("Account balance should not be negative"));
     }
     System.out.println("No Exception");
   }

}
class InvalidBalanceException extends Exception{
 public InvalidBalanceException (String message){
 super(message);
 }
}

  
 