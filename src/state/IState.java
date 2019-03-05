package state;

/**
 * Date: 2019/3/5
 * Created by LiuJian
 *
 * @author LiuJian
 */

/**
 * 状态接口
 * 主要有状态：
 * 1、有电看电视状态
 * 2、无电等电状态
 * 3、有洗澡状态
 * 4、无水看电视状态
 * 5、洗完睡觉
 * 注意状态机转换
 */
interface IState {

    void watchTv();
    void takeBath();
    void sleep();
}
