package observer;

/**
 * Date: 2019/3/2
 * Created by Liuian
 */

class Observer implements IObserver {

    Observer(ISubject subject) {
        subject.registerObserver(this);
    }

    @Override
    public void onDataChanged(int subjectIndex, String subjectName, long subjectTimemills) {

    }
}
