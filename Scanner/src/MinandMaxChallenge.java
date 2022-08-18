import java.util.Scanner;

public class MinandMaxChallenge {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        while (true){
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the number: " );
            boolean check = scan.hasNextInt();
            if(check == true){
                int number = scan.nextInt();
                if(number < min )
                    min = number;
                else if(number > max)
                    max = number;
                else {
                    max = max;
                    min = min;
                }
            }
            else {
                System.out.println("Invalid number");
                break;
            }
            scan.nextLine();
        }
        System.out.println("Minimum value is " +min);
        System.out.println("Maximum value is " +max);

    }
}
