public class cont_and_break {
    public static void main(String[] args) {
        int number = 0;
        while (number < 15) {
            number++;
            if (number <= 5) {
                System.out.println("Skipping number" + number);
                continue;
            }
            System.out.println("Number" + number);
            if (number >= 10) {
                System.out.println("Breaking number at" + number);
                break;
            }
        }

    }
}
