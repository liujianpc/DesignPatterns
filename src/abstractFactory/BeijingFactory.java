package abstractFactory;

/**
 * Date: 2019/3/4
 * Created by Liuian
 */

/**
 * 实现的具体工厂
 */
class BeijingFactory implements IFactory {
    @Override
    public String createName() {
        return "BeijingName";
    }

    @Override
    public String createProcess() {
        return "BeijingProcess";
    }

    @Override
    public String createTag() {
        return "BeijingTag";
    }

    @Override
    public String createProperty() {
        return "BeijingProperty";
    }
}
