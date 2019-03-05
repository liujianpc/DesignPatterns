package observer;

/**
 * Date: 2019/3/2
 * Created by Liuian
 */

import java.util.ArrayList;
import java.util.List;

/**
 * 可以被订阅的主题
 */
class Subject implements ISubject {

    List<IObserver> observers;

    private int subjectIndex;
    private String subjectName;
    private long subjectTimemills;

    Subject() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(IObserver observer) {
        synchronized (observers) {
            observers.add(observer);
        }

    }

    @Override
    public void removeObserver(IObserver observer) {
        synchronized (observers) {
            observers.remove(observer);
        }

    }

    @Override
    public void clearObserever() {
        synchronized (observers) {
            observers.clear();
        }

    }

    @Override
    public void notifyObservers() {
        for (IObserver observer : observers
                ) {
            observer.onDataChanged(subjectIndex, subjectName, subjectTimemills);

        }
    }


    /**
     * 创造数据的时候通知订阅者
     *
     * @param subjectIndex
     * @param subjectName
     * @param subjectTimemills
     */
    private void generateSubjectData(int subjectIndex, String subjectName, long subjectTimemills) {
        this.subjectIndex = subjectIndex;
        this.subjectName = subjectName;
        this.subjectTimemills = subjectTimemills;
        notifyObservers();
    }
}
