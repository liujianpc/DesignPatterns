package state;

/**
 * Date: 2019/3/5
 * Created by LiuJian
 *
 * @author LiuJian
 */

class SleepState implements IState {
    @Override
    public void watchTv() {
        System.out.println("do not watch TV");
    }

    @Override
    public void takeBath() {
        System.out.println("has taken bath already");
    }

    @Override
    public void sleep() {
        System.out.println("sleeping now");

    }
}
