package state;

/**
 * Date: 2019/3/5
 * Created by LiuJian
 *
 * @author LiuJian
 */

class HasWaterState implements IState {

    PersonNight mPersonNight;

    public HasWaterState(PersonNight mPersonNight) {
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
        System.out.println("do not watch tv");
    }

    @Override
    public void takeBath() {
        System.out.println("take a bath");
        mPersonNight.setIState(mPersonNight.getHasWaterState());
    }

    @Override
    public void sleep() {
        System.out.println("do not sleep");
    }
}
