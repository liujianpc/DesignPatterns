package observer;

/**
 * Date: 2019/3/2
 * Created by Liuian
 */

/**
 * 主题
 */
 interface ISubject {
    /**
     * 注册监听者
     */
    void registerObserver(IObserver observer);

    /**
     * 移除监听者
     */
    void removeObserver(IObserver observer);

    /**
     * 清空监听者
     */
    void clearObserever();

    /**
     * 通知监听者
     */
    void notifyObservers();

}
