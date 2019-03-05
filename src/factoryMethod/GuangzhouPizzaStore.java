package factoryMethod;

/**
 * Date: 2019/3/2
 * Created by Liuian
 */

class GuangzhouPizzaStore extends PizzaStore {
    @Override
    protected IPizza createPizza(String pizzaType) {
        switch (pizzaType){
            case "apple":
                return new GuangzhouApplePizza();
            case "pear":
                return new GuangzhouPearPizza();
            default:
                return new GuangzhouDefaultPizza();
        }

    }
}
