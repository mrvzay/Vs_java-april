package constructors;

public class Account {

  private String number;
  private double balance;
  private String customerName;
  private String customerEmail;
  private String customerPhone;

  public Account() {
    this("56789", 2.50, "Default name", "Default address", "Default phone");
    System.out.println("Empty constructors called");
  }

  public Account(String number, double balance, String customerName, String email, String phone) {
    System.out.println("Account constructor with parameters called");
    this.number = number;
    this.balance = balance;
    this.customerName = customerName;
    customerEmail = email;
    customerPhone = phone;
  }

  public Account(String customerName, String customerEmail, String customerPhone) {
    this("99999", 100.55, customerName, customerEmail, customerPhone);
  }

  public void depositFunds(double depositAmount) {

    balance += depositAmount;
    System.out.println("Deposit of $" + depositAmount + " made. New balance is $" + balance);
  }

  public void withdrawFunds(double withdrawalAmount) {

    if (balance - withdrawalAmount < 0) {
      System.out.println("Insufficient Funds! You only have $" + balance + " in you account.");
    } else {
      balance -= withdrawalAmount;
      System.out.println("Withdrawal of $" + withdrawalAmount + " processed, Remaining balance = $" + balance);
    }
  }

  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public String getCustomerName() {
    return customerName;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  public String getCustoemrEmail() {
    return customerEmail;
  }

  public void setCustomerEmail(String customerEmail) {
    this.customerEmail = customerEmail;
  }

  public void setCustomerPhone(String customerPhone) {
    this.customerPhone = customerPhone;
  }

  public String getCustomerPhone() {
    return customerPhone;
  }

}
