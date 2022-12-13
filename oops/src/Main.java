public class Main {
    public static void main(String[] args) {
        BankAccount Hemanth = new BankAccount();
        Hemanth.setAccountHolderName("Hemanth");
        Hemanth.setAccountBalance(1000);
        Hemanth.setEmail("hemanth@co.in");
        Hemanth.setPhoneNumber(96661329);
        Hemanth.setAccountNumber(201197);
        Hemanth.depositfunds(100);
        Hemanth.withdrawfunds(900);
    }
}
