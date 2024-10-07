import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int nights = 0;
        String leaving = "";
        String halfPension = "";
        int after12pm = 0;
        int half_board = 0;

        System.out.println("How many night will you stay in? (20€ per night).");

        while (!input.hasNextInt()) {
            System.out.println("Invalid input, try again.");
            input.nextLine();
        }

        nights = input.nextInt();

        System.out.println("Are you leaving before or after 12pm? (Keep in mind that leaving after 12pm has a charge of 15€).");
        input.nextLine();

        while (!input.hasNext("before") && !input.hasNext("after")) {
            System.out.println("Invalid input, type 'before' or 'after'");
            input.nextLine();

        }

        leaving = input.next();

        if (leaving.equalsIgnoreCase("after")) {
            after12pm = 15;
        } else {
            after12pm = 0;
        }

        System.out.println("Do you want a half board which includes breakfast and dinner for only 20€? yes/no (It can not be more than full days).");

        while (!input.hasNext("yes") && !input.hasNext("no")) {
            System.out.println("Invalid input, type 'before' or 'after'");
            input.nextLine();
        }
        halfPension = input.next();

        if (halfPension.equalsIgnoreCase("yes")) {
            System.out.println("How many days are you staying in half board?");
            half_board = input.nextInt();

            while (half_board > nights) {
                System.out.println("Sorry, you cannot stay more half board days than nights.");
                half_board = input.nextInt();
            }
        }

        System.out.println("The total price is " + (nights*20 + half_board*20 + after12pm) + "€.");

    }


}



