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
    return "#" + accountID + "\t $" + balance;
  }//Java automatically calls toString, replaces the built in toString
  //you can't type cast objects

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

  private boolean authenticate(String password){
    return this.password.equals(password);
  }

  public boolean transferTo(BankAccount other, double amount, String password){
    if(autenticate(password) && withdraw(amount)){
      if(other.deposit(amount)) return true;
    return false;
    }
  }

}
