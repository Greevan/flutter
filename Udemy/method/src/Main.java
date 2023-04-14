public class Main {
    public static void main(String[] args) {
        boolean gameover= true;
        int score =1000;
        int levelCompleted = 5;
        int Bonus = 100;

        calculateScore(true, 800,levelCompleted,Bonus);
        calculateScore(true,1000, 8,200);
    }
    public static void calculateScore(boolean gameover, int score, int levelCompleted, int bonus){

        int finalScore = score;

        if ( gameover){
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score is " + finalScore);
        }
    }
}
