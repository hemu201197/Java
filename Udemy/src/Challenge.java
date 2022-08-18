public class Challenge {
    public static void main(String[] args){
        boolean gameover = true;
        int score = 800;
        int level_completed = 5;
        int bonus = 100;
        if (gameover == true){
            int finalscore = score + (level_completed * bonus);
            System.out.println("Your final score was = " +finalscore);
        }

        int score_2 = 10000;
        int level_completed_2 = 8;
        int bonus_2 = 200;
        if (gameover == true){
            int finalscore = score_2 + (level_completed_2 * bonus_2 );
            System.out.println("Your final score was = " +finalscore);
        }
    }
}
