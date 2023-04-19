
import java.util.Scanner;


public class Main {

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name +" managed to get position "+position+" on the high score list\n");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name & position\n");
        String name = sc.nextLine();
        int position = sc.nextInt();


        displayHighScorePosition(name,position);
    }


}
/*import java.util.Scanner;

public class Main {

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get position " + position + " on the high score list\n");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name & position\n");
        String name = sc.nextLine();
        int position = sc.nextInt();

        displayHighScorePosition(name, position);
    }
}*/
