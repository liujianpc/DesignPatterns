package command;

/**
 * Date: 2019/3/4
 * Created by Liuian
 */

/**
 * 命令集合
 * 一个按键可以操作多个操作
 */
class PartyCommand implements ICommand {
    private ICommand[] commands;

    PartyCommand(ICommand[] commands) {
        this.commands = commands;
    }


    @Override
    public void execute() {
        for (ICommand command : this.commands) {
            command.execute();

        }
    }

    @Override
    public void undo() {
        for (ICommand command : commands) {
            command.undo();
        }

    }
}
