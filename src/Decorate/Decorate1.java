package Decorate;

/**
 * Date: 2019/3/2
 * Created by Liuian
 */

class Decorate1 extends BaseDecorate {
    Decorate1(Drink drink) {
        super(drink);
    }

    @Override
    String getDescription() {
        return "Decorate2" + "/" + drink.getDescription();
    }

    @Override
    int cost() {
        return 1 + drink.cost();
    }
}
