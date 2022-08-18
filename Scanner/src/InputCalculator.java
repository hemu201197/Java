import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();

    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        double average = 0;
        double count = 1;
        while (true){
            boolean check = scan.hasNextInt();
            if(check == true){
                int number = scan.nextInt();
                sum = (sum+number);
                System.out.println(+count);
                average = Math.round (sum/count);
                count++;
            }
            else {
                break;
            }
            scan.nextLine();
        }

        System.out.println("SUM = " +(sum)+ "AVG = " +(average));
        System.out.println(+count);
    }
}
