public class Main {
    public static void main(String[] args) {
        int health=200;
        if (health<1000){
            health=1000+health;
        }
        int power=200;
        if ((health<1500)&&(power>100)){
            System.out.println("HIGH POWER!");
        }
    }
}