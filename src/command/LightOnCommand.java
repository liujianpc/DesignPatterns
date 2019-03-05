package command;

/**
 * Date: 2019/3/4
 * Created by Liuian
 */

class LightOnCommand implements ICommand {

    IDevice light;

    LightOnCommand(IDevice light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();

    }

    @Override
    public void undo() {
        light.off();
    }
}
