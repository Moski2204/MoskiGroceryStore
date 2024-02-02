import java.util.Scanner;

public class GroceryStoreTester {

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
        ;
        while (store.personalMoney > 0) {
            Scanner choice = new Scanner(System.in);
            System.out.println("What would you like to buy?");
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
                System.out.println();
                System.out.println("Invalid input. Please try again!");
                continue;
            }
            System.out.println("You have $" + store.personalMoney + " in your account.");
            System.out.println();
            if (store.personalMoney < 0) {
                System.out.println("You are bankrupt... Goodbye!");
                break;
            } else if (store.personalMoney == 0) {
                System.out.println("MMM (Make More Money)!");
            }
        }


    }
}
