public class BarkingDog {
    public static void main(String[] args) {
        boolean i = shouldWakeUp(true,1);
        System.out.println("Answer is " +i);

    }
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (hourOfDay >= 0 && hourOfDay <= 23){
            if(hourOfDay < 8 && hourOfDay > 22 && barking == true){
                return true;
            }
            else if (hourOfDay >= 8 && hourOfDay <= 22 && barking == true)
                return false;
            else if (hourOfDay < 8 && hourOfDay > 22 && barking == false){
                System.out.println("Dog is not barking");
                return false;
            } else if (hourOfDay >= 8 && hourOfDay <= 22 && barking == false) {
                System.out.println("Dog is not barking");
                return false;
            }
        }


        else {
            System.out.println(+hourOfDay + "parameter should be in the range of 0 and 23");
            return false;
        }
        return barking;
    }
}
