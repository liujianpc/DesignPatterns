package abstractFactory;

/**
 * Date: 2019/3/4
 * Created by Liuian
 */

class BeijingPizza extends Pizza {

    IFactory factory;

    BeijingPizza(IFactory factory) {
        this.factory = factory;

    }

    @Override
    void prepare() {
        name = factory.createName();
        process = factory.createProcess();
        tag = factory.createTag();
        property = factory.createProperty();
    }
}
