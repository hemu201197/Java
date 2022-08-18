public class DecimalComparator {
    public static void main(String[] args) {

    }

    public static boolean areEqualByThreeDecimalPlaces(double first, double second) {
        if ((int) first == (int) second) {
            double first_con = first * 1000;
            double second_conv = second * 1000;
            if ((int) first_con == (int) second_conv)
                return true;
            else
                return false;
        }
        else
            return false;
    }
}
