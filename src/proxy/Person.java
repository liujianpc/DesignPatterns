package proxy;

/**
 * Date: 2019/3/5
 * Created by LiuJian
 *
 * @author LiuJian
 */

class Person implements IPerson {
    String name;
    int age;

    public Person(String mName, int mAge) {
        name = mName;
        age = mAge;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void setName(String name) {

    }

    @Override
    public int getAge() {
        return 0;
    }

    @Override
    public void setAge() {

    }
}
