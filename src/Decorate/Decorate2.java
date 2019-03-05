package Decorate;

/**
 * Date: 2019/3/2
 * Created by Liuian
 */

class Decorate2 extends BaseDecorate {
    Decorate2(Drink drink) {
        super(drink);
    }

    @Override
    String getDescription() {
        return "Decorate2" + "/" + drink.getDescription();
    }

    @Override
    int cost() {
        return 2 + drink.cost();
    }
}
