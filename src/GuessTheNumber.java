import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(20) + 1;
        int tries = 0;
        Scanner input = new Scanner(System.in);

        while (tries < 5){
            System.out.print("Bitte gib eine Nummer zwischen 1-20 ein, " + "(Versuche übrig: " + (5-tries) + "): ");
            int number = input.nextInt();

            tries++;

            if(number > randomNumber){
                System.out.println("Too high!");
            }
            if(number < randomNumber){
                System.out.println("Too low!");
            }
            if(number == randomNumber){
                System.out.println("Gewonnen!");
                break;
            } else if(tries == 5){
                System.out.println("Verloren! Die Nummer war: " + randomNumber);
            }
        }

        input.close();
    }
}
