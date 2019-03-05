package factoryMethod;

/**
 * Date: 2019/3/2
 * Created by Liuian
 */

/**
 * 抽象工厂方法，抽象类，生产方法是抽象的   依赖倒置原则
 * 将产品类与产品生产类解耦合 IPizza----->具体pizza-----具体PizzStore<-----抽象的PizzaStore
 */
abstract class PizzaStore {

    void orderPizza(String pizzaType) {

        IPizza pizza = createPizza(pizzaType);

        pizza.rotate();
        pizza.bake();
        pizza.pack();
    }

    protected abstract IPizza createPizza(String pizzaType);
}
