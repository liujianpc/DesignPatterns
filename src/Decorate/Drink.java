package Decorate;

/**
 * Date: 2019/3/2
 * Created by Liuian
 */

/**
 * 装饰模式的共同父类：抽象
 */
abstract class Drink {

    String description;

    String getDescription() {
        return description;
    }

    abstract int cost();

}
