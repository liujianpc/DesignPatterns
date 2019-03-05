package adapter;

/**
 * Date: 2019/3/4
 * Created by LiuJian
 *
 * @author LiuJian
 */

/**
 * 适配器模式，注意与装饰器模式却别开
 */
class TurkeyAdapter implements IDuck {
    private Turkey turkey;

    TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.tweets();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 10; i++) {

            turkey.slowFly();
        }

    }
}
