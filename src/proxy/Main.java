package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Date: 2019/3/5
 * Created by LiuJian
 *
 * @author LiuJian
 */

class Main {

    public static void main(String[] args) {
        IPerson person = new Person("jack", 100);

        IPerson personProxy = (IPerson) Proxy.newProxyInstance(person.getClass().getClassLoader(),
                person.getClass().getInterfaces(), new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                        if (method.getName().equals("getAge")) {
                            throw new IllegalStateException("getAge() is unsupported");
                        } else {
                            invoke(proxy, method, args);
                        }

                        return null;
                    }
                });

        personProxy.setAge(100);
        personProxy.getAge();//这里会有一场抛出，权限访问达到了控制效果

    }
}
