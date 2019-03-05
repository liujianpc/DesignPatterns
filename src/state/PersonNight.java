package state;

/**
 * Date: 2019/3/5
 * Created by LiuJian
 *
 * @author LiuJian
 */

class PersonNight implements IState {
    IState mNoElecState;
    IState mHasElecState;

    IState mNoWaterState;
    IState mHasWaterState;

    IState mSleepState;

    private IState mIState = mNoWaterState;

    public PersonNight(IState mNoElecState, IState mHasElecState, IState mNoWaterState, IState mHasWaterState, IState mSleepState) {
        this.mNoElecState = mNoElecState;
        this.mHasElecState = mHasElecState;
        this.mNoWaterState = mNoWaterState;
        this.mHasWaterState = mHasWaterState;
        this.mSleepState = mSleepState;
    }

    public IState getNoElecState() {
        return mNoElecState;
    }

    public void setNoElecState(IState mNoElecState) {
        this.mNoElecState = mNoElecState;
    }

    public IState getHasElecState() {
        return mHasElecState;
    }

    public void setHasElecState(IState mHasElecState) {
        this.mHasElecState = mHasElecState;
    }

    public IState getNoWaterState() {
        return mNoWaterState;
    }

    public void setNoWaterState(IState mNoWaterState) {
        this.mNoWaterState = mNoWaterState;
    }

    public IState getHasWaterState() {
        return mHasWaterState;
    }

    public void setHasWaterState(IState mHasWaterState) {
        this.mHasWaterState = mHasWaterState;
    }

    public IState getSleepState() {
        return mSleepState;
    }

    public void setSleepState(IState mSleepState) {
        this.mSleepState = mSleepState;
    }

    @Override
    public void watchTv() {
        mIState.watchTv();


    }

    @Override
    public void takeBath() {
        mIState.takeBath();


    }

    @Override
    public void sleep() {
        mIState.sleep();

    }


    public IState getIState() {
        return mIState;
    }

    public void setIState(IState mIState) {
        this.mIState = mIState;
    }
}
