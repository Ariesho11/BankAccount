public class Tester{
  public static void main(String[]args){
    BankAccount ba = new BankAccount(2345, "password");
    System.out.println("Account Balance: " + ba.getBalance());
    System.out.println("Account ID " + ba.getAccountID());

    ba.setPassword("new1234");
    System.out.println(ba.deposit(200.5));
    System.out.println(ba.deposit(-200));
    System.out.println("Account Balance: " + ba.getBalance());
  }
}
