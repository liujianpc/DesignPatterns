package simplefactory;

/**
 * Date: 2019/3/2
 * Created by Liuian
 */

class SimplePizzaFactory {

    static IPizza createPizza(String pizzaType) {
        switch (pizzaType) {
            case "apple":
                return new ApplePizza();
            case "banana":
                return new BananaPizza();
            case "pear":
                return new PearPizza();
            default:
                return new  DefaultPizza();
        }
    }
}
