public class Main {
    public static void main(String[] args) {
     //   BankAccount Hemanth = new BankAccount();
       // Hemanth.setAccountHolderName("Hemanth");
       // Hemanth.setAccountBalance(1000);
        // Hemanth.setEmail("hemanth@co.in");
       /// Hemanth.setPhoneNumber(96661329);
        /// Hemanth.setAccountNumber(201197);
        // Hemanth.depositfunds(100);
        // Hemanth.withdrawfunds(900);
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("subtract= " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());
    }
}
