package proxy;

/**
 * Date: 2019/3/5
 * Created by LiuJian
 *
 * @author LiuJian
 */

interface IPerson {

    String getName();
    void setName(String name);

    //假若年龄是隐私
    int getAge();
    void setAge(int mAge);


}
