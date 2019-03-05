package state;

/**
 * Date: 2019/3/5
 * Created by LiuJian
 *
 * @author LiuJian
 */

class NoWaterState implements IState {
    PersonNight mPersonNight;

    public NoWaterState(PersonNight mPersonNight) {
        this.mPersonNight = mPersonNight;
    }

    public PersonNight getPersonNight() {
        return mPersonNight;
    }

    public void setPersonNight(PersonNight mPersonNight) {
        this.mPersonNight = mPersonNight;
    }

    @Override
    public void watchTv() {
        System.out.println("watch the tv");
        mPersonNight.setIState(mPersonNight.getNoWaterState());
    }

    @Override
    public void takeBath() {
        System.out.println("has no water, so do not take bath");
    }

    @Override
    public void sleep() {
        System.out.println("do not sleep");

    }
}
