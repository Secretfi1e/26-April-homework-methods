import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int randomnum = getRandomnum();
        while(true) {
            if (check(randomnum, getinputnum(sc))) {
                break;
            }
        }
    }
    public static int getRandomnum(){
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        System.out.println("Random ededimiz: " + randomNumber);
        return randomNumber;
    }
    static public int getinputnum(Scanner sc) {
        System.out.println("Bir eded dexmin edin");
        int number = sc.nextInt();

        return number;
    }
    static public boolean check(int randomNumber, int number){
        if (randomNumber == number) {
            System.out.println("tebrikler dogru texmin");
            return true;
        } else if(randomNumber>number) {
            System.out.println("Biraz daha boyuk eded daxil edin");
            return false;
        }else{
            System.out.println("Biraz daha kicik eded daxil edin");
        }
        return false;
    }
}
