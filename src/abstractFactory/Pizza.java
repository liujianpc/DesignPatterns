package abstractFactory;

/**
 * Date: 2019/3/4
 * Created by Liuian
 */

abstract class Pizza {
    String name;
    String process;
    String tag;
    String property;

    abstract void prepare();

    void bake(){
        System.out.println("bake the pizza");

    }

    void pack(){
        System.out.println("pack the pizza");
    }
}
