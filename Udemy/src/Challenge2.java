public class Challenge2 {
    public static void main (String[] args)
    {
        displayandcalculate("Dhoni", 1500);
        displayandcalculate("Virat", 500);
        displayandcalculate("Yuv", 100);
        displayandcalculate("viru", 50);



    }

    public static void displayHighScore(String playername , int playerposition){
        System.out.println(playername+   " managed to get into  "  +playerposition+   " on the high score board");
    }
    public static int CalculateHighscorePosition(int playerScore){
        if (playerScore >= 1000)
            return 1;
        else if (playerScore >= 500)
            return 2;
        else if (playerScore >= 100  )
            return 3;
        else
            return 4;
    }
    public static void displayandcalculate (String playername , int playerscore){
        int playerposition = CalculateHighscorePosition(playerscore);
        displayHighScore(playername,playerposition);

    }
}
