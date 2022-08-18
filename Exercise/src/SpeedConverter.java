public class SpeedConverter {
    public static void main(String[] args) {
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0){
            return -1;
        }

        else if (kilometersPerHour >0) {
            return (Math.round(kilometersPerHour/ 1.609));
        }else
        return 0;
    }

    public static void PrintConversion(double Kilometersperhour) {
        double MilesPerHour = toMilesPerHour(Kilometersperhour);
        if (MilesPerHour != -1) {
            System.out.println(+Kilometersperhour + " km/h =" + MilesPerHour + " mi/h");
        }
        else{
            System.out.println("Invalid Value");
        }

    }
}
