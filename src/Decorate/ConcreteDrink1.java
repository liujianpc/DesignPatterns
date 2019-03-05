package Decorate;

/**
 * Date: 2019/3/2
 * Created by Liuian
 */

class ConcreteDrink1 extends Drink {

    ConcreteDrink1(){
        description = "concreteDrink1";
    }
    @Override
    int cost() {
        return 1;
    }
}
