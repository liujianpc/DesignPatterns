package abstractFactory;

/**
 * Date: 2019/3/4
 * Created by Liuian
 */

class BeijingPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String pizzaType) {

        switch (pizzaType) {
            case "beijing":
                return new BeijingPizza(new BeijingFactory());
            default:
                return null;
        }
    }
}
