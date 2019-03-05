package factoryMethod;

/**
 * Date: 2019/3/2
 * Created by Liuian
 */

class BeijingPizzaStore extends PizzaStore {
    @Override
    protected IPizza createPizza(String pizzaType) {

        switch (pizzaType){
            case "apple":
                return new BeijingApplePizza();

            case "pear":
                return new BeijingPearPizza();

            default:
                return new BeijingDefaultPizza();
        }
    }
}
