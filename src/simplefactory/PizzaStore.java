package simplefactory;

/**
 * Date: 2019/3/2
 * Created by Liuian
 */

/**
 * 简单工厂模式
 * <p>
 */
class PizzaStore {
    void orderPizza(String pizzaType) {

        IPizza pizza = SimplePizzaFactory.createPizza(pizzaType);

        pizza.rotate();
        pizza.bake();
        pizza.pack();
    }

}
