package machine;


import java.util.Scanner;

import static machine.Counter.checkCoffee;


public abstract class CoffeeMachine {
    public static void main(String[] args) {
        //System.out.println("Write how many cups of coffee you will need: ");
        Stock stock = new Stock(540, 120, 400, 9, 550);
        while(true) {
            choose(stock);
        }
    }
    static Scanner scanner = new Scanner(System.in);
    static void choose (Stock stock){
        ask();
        String answer = scanner.nextLine();
        switch (answer) {
            case ("buy") -> buy(stock);
            case ("fill") -> fill(stock);
            case ("take") -> take(stock);
            case ("exit") -> System.exit(0);
            case ("remaining") -> stock.printState();
        }
    }
    static void ask (){
        System.out.println("Write action (buy, fill, take, remaining, exit): "); //убрать позорище
    }
    static void buy(Stock stock) {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ");
        switch (scanner.nextLine()) {
            case ("1"):
                checkCoffee(stock,1);
                //buy espresso
                break;
            case ("2"):
                checkCoffee(stock,2);
                // buy latte
                break;
            case ("3"):
                checkCoffee(stock,3);
                //capuccino
                break;
            case ("back"): choose(stock);
        }
    }
    public static void take(Stock stock) {
        System.out.println("I gave you $"+stock.getMoney());
        stock.setMoney(0);
    }
    public static void fill(Stock stock) {
        System.out.println("Write how many ml of water you want to add: ");
        stock.setWater(stock.getWater()+scanner.nextInt());
        System.out.println("Write how many ml of milk you want to add: ");
        stock.setMilk(stock.getMilk()+scanner.nextInt());
        System.out.println("Write how many grams of coffee beans you want to add: ");
        stock.setCoffee(stock.getCoffee()+scanner.nextInt());
        System.out.println("Write how many disposable cups you want to add: ");
        stock.setCups(stock.getCups()+scanner.nextInt());
    }
}