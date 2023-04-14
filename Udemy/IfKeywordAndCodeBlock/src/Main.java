public class MainChallenge {
    public static void main(String[] args) {

        boolean gameover = true;
        int level = 8;
        int bonus = 200;
        int score = 10_000;

        if (gameover) {
            int final_score = score;
            final_score += (level * bonus);
            System.out.println("Your final score is " + final_score);
        }
    }
}