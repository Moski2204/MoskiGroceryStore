public class GroceryStore {

    String egg = "Eggs";
    String meat = "Meat";
    String fish = "Fish";
    String milk = "Milk";
    int priceOfEgg = 100;
    int priceOfMeat = 500;
    int priceOfFish = 400;
    int priceOfMilk = 50;
    int personalMoney = 1000;

    void boughtMilk(){
            personalMoney = personalMoney - priceOfMilk;
            System.out.println();
            System.out.println("You bought Milk which is $" + priceOfMilk + "." );
        }
    void boughtEgg(){
        personalMoney = personalMoney - priceOfEgg;
        System.out.println();
        System.out.println("You bought Eggs which is $" + priceOfEgg + "." );
    }
    void boughtMeat(){
        personalMoney = personalMoney - priceOfMeat;
        System.out.println();
        System.out.println("You bought Meat which is $" + priceOfMeat + "." );
    }
    void boughtFish(){
        personalMoney = personalMoney - priceOfFish;
        System.out.println();
        System.out.println("You bought Fish which is $" + priceOfFish + "." );
    }

    }

