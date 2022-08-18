public class PositiveNegativeZero {
    public static void main(String[] args) {
        CheckNumber(-4);
    }
    public static void CheckNumber(int Number){
        if(Number > 0)
            System.out.println("postive");
        else if (Number < 0 )
            System.out.println("negative");
        else
            System.out.println("zero");
    }
}

