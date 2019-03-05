package state;

/**
 * Date: 2019/3/5
 * Created by LiuJian
 *
 * @author LiuJian
 */

class HasElecState implements IState {
    PersonNight mPersonNight;

    public HasElecState(PersonNight mPersonNight) {
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
        mPersonNight.setIState(mPersonNight.getHasElecState());
        System.out.println("watch the TV");
    }

    @Override
    public void takeBath() {
        System.out.println("do not take bath");
    }

    @Override
    public void sleep() {
        System.out.println("do not sleep");

    }
}
