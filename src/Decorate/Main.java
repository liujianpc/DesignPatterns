package Decorate;

/**
 * Date: 2019/3/2
 * Created by Liuian
 */

class Main {
    public static void main(String[] args) {
        Decorate1 drink = new Decorate1(new ConcreteDrink1());
        drink.getDescription();
        drink.cost();

        Decorate2 decorate2 = new Decorate2(new ConcreteDrink1());
        decorate2.getDescription();
        decorate2.cost();
    }
}
