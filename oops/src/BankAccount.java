public class BankAccount {
    private int AccountNumber;
    private double AccountBalance;
    private String AccountHolderName;
    private long PhoneNumber;
    private String Email;

    public int getAccountNumber() {
        return AccountNumber;
    }

    public double getAccountBalance() {
        return AccountBalance;
    }

    public String getAccountHolderName() {
        return AccountHolderName;
    }

    public long getPhoneNumber() {
        return PhoneNumber;
    }

    public String getEmail() {
        return Email;
    }

    public void setAccountNumber(int accountNumber) {
        AccountNumber = accountNumber;
    }

    public void setAccountBalance(double accountBalance) {
        AccountBalance = accountBalance;
    }

    public void setAccountHolderName(String accountHolderName) {
        AccountHolderName = accountHolderName;
    }

    public void setPhoneNumber(long phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public void depositfunds(double depositamount) {
        if(depositamount >= 0) {
            AccountBalance = depositamount + AccountBalance;
            System.out.println("Your account Balance is = " +AccountBalance);
        }
        else {
            System.out.println("Invalid deposit ammount");
            System.out.println("Your account Balance is = " +AccountBalance);
        }
    }
    public void withdrawfunds(double withdrawamount){
        if((AccountBalance - withdrawamount) < 0){
            System.out.println("Not enough Balance in your account");
            System.out.println("Your account Balance is = " +AccountBalance);
        }
        else {
            System.out.println("Withdrew amount = " +withdrawamount);
            AccountBalance = AccountBalance - withdrawamount;
            System.out.println("Now your account Balance is " +AccountBalance);
        }
    }
}
