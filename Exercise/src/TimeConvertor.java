public class TimeConvertor {
    public static void main(String[] args) {

    }

    public static void get_Duration(int minutes , int seconds) {
        if(minutes > 0 && seconds >= 0 && seconds <= 59){
            int total_Seconds = (minutes * 60) + seconds;
            int hours = total_Seconds / 3600;
            int remaining_minutes = (total_Seconds % 3600) / 60;
            int remaining_seconds = ((total_Seconds % 3600) % 60);
            System.out.println(+hours+ " hours and " +remaining_minutes+ " minutes and " +remaining_seconds);

        }
        else
            System.out.println("Invalid value");

    }

    public static void get_Duration(int seconds){
        if (seconds > 0 ){
            int minutes_con = seconds / 60;
            int seconds_conv = seconds % 60;
            get_Duration(minutes_con,seconds_conv);
        }
        else
            System.out.println("Invalid value");
    }
}
