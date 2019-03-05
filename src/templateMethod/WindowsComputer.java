package templateMethod;

/**
 * Date: 2019/3/4
 * Created by LiuJian
 *
 * @author LiuJian
 */

class WindowsComputer extends Computer {
    @Override
    protected void computeWithSoft() {
        System.out.println("compute with soft B");
    }

    @Override
    protected void loadOperateSystem() {
        System.out.println("load operate system Windows");
    }

    @Override
    protected boolean shouldDisplay() {
        return false;
    }
}
