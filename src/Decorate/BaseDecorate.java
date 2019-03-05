package Decorate;

/**
 * Date: 2019/3/2
 * Created by Liuian
 */

abstract class BaseDecorate extends Drink {
    Drink drink;

    BaseDecorate(Drink drink) {
        this.drink = drink;
    }

    abstract String getDescription();
}
