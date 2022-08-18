public class LeapYear {
    public static void main(String[] args) {
        boolean hem = isLeapYear(1600);
        System.out.println("It is a leap year" +hem);

    }

    public static boolean isLeapYear(int year) {
        if (year >= 1 && year < 9999) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0)
                        return true;
                    else
                        return false;
                } else
                    return true;
            }
        } else {
            System.out.println("Not in range (1-9999)");
            return false;
        }
        return false;
    }
}

