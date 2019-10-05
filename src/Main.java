import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to my first project San!");
        System.out.println("Choose your options!");

        int input;

        do {
            System.out.println("[1]");
            System.out.println("[2]");
            System.out.println("[3]");
            System.out.println("[4]");

            input = scanner.nextInt();

            switch (input) {
                case 1:
                    System.out.println("Kw0n arms are broken");
                    break;
                case 2:
                    System.out.println("Crim is secretly pro Doomfist");
                    break;
                case 3:
                    System.out.println("I’m gay with plants");
                    break;
                case 4:
                    System.out.println("San is the best teacher");
                    break;
                case 0:
                    System.out.println("bai bai!");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }

            /*
            if (input == 1) {
                System.out.println("Kw0n arms are broken");

            } else if (input == 2) {
                System.out.println("Crim is secretly pro Doomfist");
            } else if (input == 3) {
                System.out.println("I’m gay with plants");

            } else if (input == 4) {
                System.out.println("San is the best teacher");

            } else if (input == 0) {
                System.out.println("bai bai!");
            } else {
                System.out.println("Invalide Choice");
            }*/

        } while (input != 0);

    }
}
