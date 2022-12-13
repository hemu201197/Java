public class Barkingtest {
    public static void main(String[] args) {
        boolean i = shouldWakeUp(false, 2);
        System.out.println("Answer is " + i);

    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 23)
            return false;
        if (hourOfDay >= 0 || hourOfDay <= 23) {
            if (barking == true) {
                if (hourOfDay < 8 || hourOfDay > 22)
                    return true;
                else
                    return false;
            }
            if (barking == false) {
                return false;
            }
        }
        return false;
    }
}
