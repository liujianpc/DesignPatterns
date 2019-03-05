package policy; /**
 * Date: 2019/3/2
 * Created by Liuian
 */

/**
 * 策略模式：
 * 组合算法族
 */
class Duck {
    IFlyable flyable;
    IQuackable quackable;

    Duck(IFlyable flyable, IQuackable quackable){
        this.flyable = flyable;
        this.quackable = quackable;
    }

    void fly(){

        flyable.fly();

    }

    void quack(){
        quackable.quack();
    }

}
