import java.util.Scanner;

public class SumScan {
    public static void main(String[] args) {
        Scanner some = new Scanner(System.in);
        int count =1;
        System.out.println("Start the count");
        int sum =0;
        while (count <= 10){
            System.out.println("Enter the number: " +count);
            boolean check = some.hasNextInt();
            if(check == true){
                int number = some.nextInt();
                some.nextLine();
                count++;
                sum = sum +number;
            }
            else{
                System.out.println("Invalid number");
                count = count--;
                some.nextLine();
            }

        }
        some.close();
        System.out.println("Sum of all numbers is "+sum);
    }
}
