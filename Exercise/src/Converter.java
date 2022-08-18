public class Converter {
    public static void main(String[] args) {
        double height = FeetToConetimeters(5, 4);
        System.out.println("height in cm is " + height);
        double heightINC = FeetToConetimeters(-64);
        System.out.println("height in cm is " + heightINC);

    }

    public static double FeetToConetimeters(double feet, double inches) {
        if (feet >= 0 && inches >= 0 && inches <= 12) {
            double TotalInches = (feet * 12) + inches;
            double centimeters = TotalInches * 2.53999863;
            return centimeters;
        } else
            return -1;

    }

    public static double FeetToConetimeters(double inches) {
        if (inches >= 0 ) {
            double feet = (int) (inches / 12);
            double remainingInches = inches % 12;
            double onlyInches = FeetToConetimeters(feet, remainingInches);
            return onlyInches;
        }
        else
            return -1;

    }
}


