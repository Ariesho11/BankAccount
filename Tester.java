public class Tester{
  public static void main(String[]args){
    BankAccount ba = new BankAccount(2345, "password");
    System.out.println("Account Balance: " + ba.getBalance());
    System.out.println("Account ID " + ba.getAccountID());
  }
}
