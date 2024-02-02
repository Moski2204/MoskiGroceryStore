package FreeTIme;

import java.util.Scanner;

public class GrocerStoreTester {

    public static void main(String args[]) {
        GroceryStore store = new GroceryStore();

        System.out.println("Welcome to the Moski Store.");
        System.out.println("You have $" + store.personalMoney + " in your account!");

        String next = "";

        while (!next.equalsIgnoreCase("next")) {
            System.out.print("Please type 'Next' to continue : ");
            Scanner typeNext = new Scanner(System.in);
            next = typeNext.nextLine();

            if (!next.equalsIgnoreCase("next")) {
                System.out.println("Invalid input. Please try again!");
            } else {
                break;
            }
        }

        System.out.println();
        System.out.println("The prices of the following items at the Moski Grocery Store are: ");
        System.out.println("Milk - $" + store.priceOfMilk);
        System.out.println("Eggs - $" + store.priceOfEgg);
        System.out.println("Meat - $" + store.priceOfMeat);
        System.out.println("Fish - $" + store.priceOfFish);
        System.out.println();

        System.out.println("Please type the name of the following item's above that you'd like to buy.");
        while (store.personalMoney > 0) {
            Scanner choice = new Scanner(System.in);
            String myChoice = choice.nextLine();
            if (myChoice.equalsIgnoreCase("Milk")) {
                store.boughtMilk();
            }
            else if (myChoice.equalsIgnoreCase("Eggs")) {
                store.boughtEgg();
            }
            else if (myChoice.equalsIgnoreCase("Meat")) {
                store.boughtMeat();
            }
            else if (myChoice.equalsIgnoreCase("Fish")) {
                store.boughtFish();
            }
            else {
                System.out.println("Invalid input. Please try again!");
                continue;
            }
            if (store.personalMoney < 0) {
                System.out.println("You have $" + store.personalMoney + " in your account.");
                System.out.println("You are bankrupt... Goodbye!");
                break;
            } else if (store.personalMoney == 0) {
                System.out.println("You have $0 left in your account.");
                System.out.println("MMM (Make More Money)!");
            } else {
                System.out.println("You have $" + store.personalMoney + " left in your account.");
            }
        }

    }
}



