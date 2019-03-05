package templateMethod;

/**
 * Date: 2019/3/4
 * Created by LiuJian
 *
 * @author LiuJian
 */

class LinuxComputer extends Computer {
    @Override
    protected void computeWithSoft() {
        System.out.println("compute with soft A");

    }

    @Override
    protected void loadOperateSystem() {
        System.out.println("load operate system Linux");

    }
}
