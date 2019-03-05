package command;

/**
 * Date: 2019/3/4
 * Created by Liuian
 */

/**
 * 命令模式：
 * 命令发送者与命令接受者解耦
 * 1、命令发送者，持有命令
 * 2、命令，持有命令命令接受者和命令的具体操作
 * 3、command在中间做一个转接作用
 */
class RemoteController {

    ICommand[] onCommands;
    ICommand[] offCommands;

    ICommand undoCommand;

    public void setOnCommands(ICommand[] onCommands) {
        this.onCommands = onCommands;
    }

    public void setOffCommands(ICommand[] offCommands) {
        this.offCommands = offCommands;
    }

    void onButtonPressed(int index) {
        onCommands[index].execute();
        undoCommand = offCommands[index];
    }

    void offButtonPressed(int index) {
        offCommands[index].execute();
        undoCommand = onCommands[index];
    }

    void undoButtonPressed() {
        undoCommand.execute();
    }


}
