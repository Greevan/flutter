public class AndOperatorChallenge {
    public static void main(String[] args) {
        double var1=20.00d;
        double var2=81.00d;
        double res1=(var2+var1)*100;
        System.out.println(res1);
        double res2=res1%40.00;
        System.out.println(res2);

        boolean res3=(res2==0)?true:false;
        System.out.println("is no remainder ="+ res3);
        if (!res3){
        System.out.println("GOT SOME REMAINDER");
        }
}
}