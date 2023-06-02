package machine;

public class Counter {
    final static int CUP = 1;
    final static int WATER_FOR_ESPRESSO = 250;
    final static int COFFEE_FOR_ESPRESSO = 16;
    final static int MILK_FOR_LATTE = 75;
    final static int WATER_FOR_LATTE = 350;
    final static int COFFEE_FOR_LATTE = 20;
    final static int WATER_FOR_CAPPUCCINO = 200;
    final static int MILK_FOR_CAPPUCCINO = 100;
    final static int COFFEE_FOR_CAPPUCCINO = 12;
    final static int ESP_COST = 4;
    final static int LAT_COST = 7;
    final static int CAP_COST = 6;


    static void checkCoffee(Stock stock, int coffeeType) {
        if (stock.getCups() < CUP) {
            System.out.println("Sorry, not enough cups for coffee!");
        } else {
            switch (coffeeType) {
                case 1 -> checkEspresso(stock);
                case 2 -> checkLatte(stock);
                case 3 -> checkCappuccino(stock);
                default -> throw new IllegalArgumentException("Invalid coffee type: " + coffeeType);
            }
        }
    }

    private static void checkEspresso(Stock stock) {
        if (stock.getWater() < WATER_FOR_ESPRESSO) {
            System.out.println("Sorry, not enough water for espresso!");
        } else if (stock.getCoffee() < COFFEE_FOR_ESPRESSO) {
            System.out.println("Sorry, not enough coffee beans for espresso!");
        } else {
            stock.setCups(stock.getCups()-CUP);
            stock.setWater(stock.getWater()-WATER_FOR_ESPRESSO);
            stock.setCoffee(stock.getCoffee()-COFFEE_FOR_ESPRESSO);
            stock.setMoney(stock.getMoney()+ESP_COST);
        }
    }

    private static void checkLatte(Stock stock) {
        if (stock.getWater() < WATER_FOR_LATTE) {
            System.out.println("Sorry, not enough water for latte!");
        } else if (stock.getCoffee() < COFFEE_FOR_LATTE) {
            System.out.println("Sorry, not enough coffee beans for latte!");
        } else if (stock.getMilk() < MILK_FOR_LATTE) {
            System.out.println("Sorry, not enough milk for latte!");
        } else {
            stock.setCups(stock.getCups()-CUP);
            stock.setWater(stock.getWater()-WATER_FOR_LATTE);
            stock.setMilk(stock.getMilk()-MILK_FOR_LATTE);
            stock.setCoffee(stock.getCoffee()-COFFEE_FOR_LATTE);
            stock.setMoney(stock.getMoney()+LAT_COST);
        }
    }

    private static void checkCappuccino(Stock stock) {
        if (stock.getWater() < WATER_FOR_CAPPUCCINO) {
            System.out.println("Sorry, not enough water for cappuccino!");
        } else if (stock.getCoffee() < COFFEE_FOR_CAPPUCCINO) {
            System.out.println("Sorry, not enough coffee beans for cappuccino!");
        } else if (stock.getMilk() < MILK_FOR_CAPPUCCINO) {
            System.out.println("Sorry, not enough milk for cappuccino!");
        } else {
            stock.setCups(stock.getCups()-CUP);
            stock.setWater(stock.getWater()-WATER_FOR_CAPPUCCINO);
            stock.setMilk(stock.getMilk()-MILK_FOR_CAPPUCCINO);
            stock.setCoffee(stock.getCoffee()-COFFEE_FOR_CAPPUCCINO);
            stock.setMoney(stock.getMoney()+CAP_COST);
        }
    }
}
