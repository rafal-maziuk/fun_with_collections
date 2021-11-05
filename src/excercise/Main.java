package excercise;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean shouldContinue = true;
        Scanner scanner = new Scanner(System.in);

        while (shouldContinue){
            System.out.println("choose option: ");
            System.out.println("1. show guests");
            System.out.println("2. add guest");
            System.out.println("3. show dishes");
            System.out.println("4. find by phone number");
            System.out.println("5. exit");

            int userChoice = scanner.nextInt();

            switch (userChoice){        // new switch since java 12 !
                case 1 -> System.out.println("wybrano 1");
                case 2 -> System.out.println("wybrano 2");
                case 3 -> System.out.println("wybrano 3");
                case 4 -> System.out.println("wybrano 4");
                case 5 -> shouldContinue = false;
            }
        }
    }
}
