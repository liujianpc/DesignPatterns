package command;

/**
 * Date: 2019/3/4
 * Created by Liuian
 */

class Light implements IDevice {


    private int state;

    @Override
    public void on() {
        System.out.println("light is on");
        state = IDevice.ON;
    }

    @Override
    public void off() {
        System.out.println("light is off");
        state = IDevice.OFF;

    }

    public int getState() {
        return state;
    }
}
