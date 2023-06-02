package machine;

import java.util.Scanner;

import static machine.CoffeeMachine.choose;
import static machine.CoffeeMachine.scanner;

class Stock {
    private int milk;
    private int coffee;
    private int water;
    private int cups;
    private int money;

    public void setCups(int cups) {
        this.cups = cups;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getCups() {
        return cups;
    }

    public int getMoney() {
        return money;
    }

    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public int getMilk() {
        return milk;
    }

    public void setMilk(int milk) {
        this.milk = milk;
    }

    public int getCoffee() {
        return coffee;
    }

    public void setCoffee(int coffee) {
        this.coffee = coffee;
    }
    public Stock(int milk, int coffee, int water, int cups, int money) {
        this.milk = milk;
        this.coffee = coffee;
        this.water = water;
        this.cups = cups;
        this.money = money;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water the coffee machine has:");
        int water = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        int milk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int coffee = scanner.nextInt();
        this.setWater(water);
        this.setMilk(milk);
        this.setCoffee(coffee);
        scanner.close();
    }

    public void printState() {
        System.out.println("\n"+
                "The coffee machine has:\n" +
                ""+this.getWater()+" ml of water\n" +
                ""+this.getMilk()+" ml of milk\n" +
                ""+this.getCoffee()+" g of coffee beans\n" +
                ""+this.getCups()+" disposable cups\n" +
                "$"+this.getMoney()+" of money\n");
    }
}