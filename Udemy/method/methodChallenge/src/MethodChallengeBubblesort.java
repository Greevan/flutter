
import java.util.Scanner;


public class Main {

    public static void displayHighScorePosition(String[] name, int[] score) {
        System.out.println(name +" managed to get position "+position+" on the high score list\n");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of players :\n");
        int no = sc.nextInt();
        System.out.println("Enter your name & score\n");
        String[] name = new String[no];
        int[] score = new int[no];

        //getting inputs from the user
                for(int i=0;i<no;i++){
                    System.out.println("Enter the Name & Score of the " + no+1 + "person");
                    name[i] = sc.nextLine();
                    score[i] = sc.nextInt();
                }
        CalculateHighScorePosition(name, score,no);
        DisplayPosition();

       // displayHighScorePosition(name,score);
    }

    public static void CalculateHighScorePosition(String[] name, int[] score, int no) {
        for (int i = 0; i < no - 1; i++) {
            for (int j = 0; j < no - i - 1; j++) {

                if (score[j] < score[j - 1]) {
                    //swap scores
                    int temp = score[j];
                    score[j] = score[j - 1];
                    score[j - 1] = temp;
                    //swap names
                    String tempname = name[j];
                    name[j] = name[j - 1];
                    name[j - 1] = tempname;
                }

            }
        }
    }

    public static void DisplayPosition(int no, String[] name,int[] score){
        //displaying rankings
                for(int i=0;i<no;i++){
                    System.out.println("The Name & Position is :\n");
                    System.out.println(name[i]+"\n"+score[i]);
                }
    }
}