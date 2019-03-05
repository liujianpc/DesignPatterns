package observer;

/**
 * Date: 2019/3/2
 * Created by Liuian
 */

/**
 * 观察者
 */
interface IObserver {

    void onDataChanged(int subjectIndex, String subjectName, long subjectTimemills);

}
