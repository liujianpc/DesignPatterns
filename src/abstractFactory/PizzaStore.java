package abstractFactory;

/**
 * Date: 2019/3/4
 * Created by Liuian
 */

abstract class PizzaStore {

    void orderPizza(String pizzaType) {
        Pizza pizza = createPizza(pizzaType);

        pizza.bake();
        pizza.pack();

    }

    abstract Pizza createPizza(String pizzaType);
}

