public class BankAccount{
  private double balance;
  private int accountID;
  private String password;

  //constructor
  public BankAccount(int ID, String pswrd){
    accountID = ID;
    password = pswrd;
    balance = 0.0;
  }

  public int getAccountID(){
    return accountID;
  }

  public double getBalance(){
    return balance;
  }
}
