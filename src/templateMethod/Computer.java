package templateMethod;

/**
 * Date: 2019/3/4
 * Created by LiuJian
 *
 * @author LiuJian
 */

/**
 * 模版方法模式：就是简单的继承，基类定义了final类型的算法模版，定义了算法的完整步骤
 * 子类负责实现某些抽象的算法步骤
 */
abstract class Computer {

    final void compute() {
        powerOn();//开机
        loadOperateSystem();
        computeWithSoft();
        if (shouldDisplay()) {
            displayResult();
        }
    }

    /**
     * 是否显示结果，这是一个钩子方法，有默认的实现，子类可以覆写
     *
     * @return
     */
    protected boolean shouldDisplay() {
        return true;
    }

    /**
     * 显示在显示器上
     */
    private void displayResult() {
        System.out.println("display the result on monitor");
    }

    /**
     * 利用软件进行计算
     */
    protected abstract void computeWithSoft();

    /**
     * 加载操作系统
     */
    protected abstract void loadOperateSystem();

    private void powerOn() {
        System.out.println("the computer is power on now!");

    }

}
