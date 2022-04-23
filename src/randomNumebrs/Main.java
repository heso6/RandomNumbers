package randomNumebrs;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int numberToGuess = getNumberToGuess();
        System.out.println(numberToGuess);
        System.out.println("„Proszę zgadnij liczbę z zakresu 0-99”");


        for (int i = 5; i >= 1; i--) {
            int userNumber = getNumberFromUser();

            if (userNumber == numberToGuess) {
                System.out.println("Zgadłeś!");
                break;
            }
            if(userNumber < numberToGuess) {
                System.out.println("Podałeś za małą liczbę");
            } else {
                System.out.println("Podałeś za duża liczbę");
            }

            if (i - 1 == 0) {
                System.out.println("Niestety nie udało Ci się zgadnąć, poprawna odpowiedź to: " + numberToGuess);
            } else {
                System.out.println("Pozostało Ci jeszcze " + (i - 1) + " prób");
            }
        }


    }

    public static int getNumberFromUser() {
        System.out.println("podaj liczbę!");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static int getNumberToGuess() {
        return new Random().nextInt(100);
    }

}

