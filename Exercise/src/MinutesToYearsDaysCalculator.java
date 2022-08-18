public class MinutesToYearsDaysCalculator {
    public static void main(String[] args) {
        printYearsAndDays(525600);

    }

    public static void printYearsAndDays(long minutes) {
        if (minutes > 0) {
            long totaldays = minutes / 1440;
            long years = totaldays / 365;
            long days = totaldays % 365;
            System.out.println(+minutes + " min = " + years + "y and " + days + "d");
        }
        else
            System.out.println("Invalid value");
    }
}
