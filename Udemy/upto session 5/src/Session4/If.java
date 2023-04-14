import java.util.Scanner;
/*Here I have used string methods like equalIgnoreCase*/
public class If {
    public static void main(String[] args) {
        System.out.println("Hello! Now wer are going to check if statements");
        Scanner scan= new Scanner(System.in);
        System.out.println("Type either 1/0 or True/False");
        String input1=scan.nextLine();
        if(input1.equals("1")||input1.equalsIgnoreCase("true")) {
            System.out.println("He is an alien from mars!");
            System.out.println("But he is generous like Human!");
        }
        else {
            System.out.println("He is Human of India!");
        }
    }
}
