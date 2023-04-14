public class AndOperator {
    public static void main(String[] args) {
    int topscore=99;
    if(topscore<100){
        System.out.println("You got the high score");
    }
    int second_topscore=87;
    if(topscore>second_topscore&&topscore<100){
        System.out.println("Greater than second top score and less than 100");
    }
    }
}
