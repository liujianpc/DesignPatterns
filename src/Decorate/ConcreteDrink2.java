package Decorate;

/**
 * Date: 2019/3/2
 * Created by Liuian
 */

class ConcreteDrink2 extends Drink {
    ConcreteDrink2(){
        description = "concreteDrink2";
    }

    @Override
    int cost() {
        return 2;
    }
}
