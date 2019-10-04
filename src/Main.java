import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Welcome to my first project San!");

        System.out.println("Choose your options!");

        System.out.println("[1]");
        System.out.println("[2]");
        System.out.println("[3]");
        System.out.println("[4]");


        int imput = s.nextInt();

        if (imput == 1) {
            System.out.println("Kw0n arms are broken");

        }

        else if (imput ==2){
            System.out.println("Crim is secretly pro Doomfist");
        }

        else if (imput ==3){
            System.out.println("I’m gay with plants");

        }

        else if (imput==4){
            System.out.println("San is the best teacher");

        }
        else{
            System.out.println("Invalide Choice");

        }





    }
}
