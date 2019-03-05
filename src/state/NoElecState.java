package state;

/**
 * Date: 2019/3/5
 * Created by LiuJian
 *
 * @author LiuJian
 */

/**
 * 没电状态
 */
class NoElecState implements IState {
    PersonNight mPersonNight;

    public NoElecState(PersonNight mPersonNight) {
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
        System.out.println("has no electricity");
    }

    @Override
    public void takeBath() {
        System.out.println("do no take bath");
    }

    @Override
    public void sleep() {
        System.out.println("do not sleep");

    }
}
