public class BankAccount{
  private double balance;
  private int accountID;
  private String password;

  public BankAccount(int ID, String pswrd){
    accountID = ID;
    password = pswrd;
    balance = 0.0;
  }

  public String toString(){
    return accountID + "\t" + balance;
  }

  public int getAccountID(){
    return accountID;
  }

  public double getBalance(){
    return balance;
  }

  public void setPassword(String newPass){
    password = newPass;
  }

  public boolean deposit(double amount){
    if (amount < 0) return false;
    else {
      balance = balance + amount;
      return true;
    }
  }

  public boolean withdraw(double amount){
    if ((amount > balance) || (amount < 0)) return false;
    else{
      balance = balance - amount;
      return true;
    }
  }
}
