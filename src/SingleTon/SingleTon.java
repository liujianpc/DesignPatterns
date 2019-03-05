package SingleTon;

/**
 * Date: 2019/3/2
 * Created by Liuian
 */

/**
 * 单例模式  内部静态类的方式   线程安全且懒加载  还有
 * <p>
 * 饿汉模式：一开始就初始化，线程安全，但是不是懒加载
 * 懒汉模式：懒加载，有需要的时候才初始化
 * double-check模式：注意 valotile 关键字修饰
 * 枚举方式： 枚举常量就是单例
 * <p>
 */
class SingleTon {

    private SingleTon() {
    }

    private static class Holder {
        static final SingleTon INSTANCE = new SingleTon();
    }

    public static SingleTon getInstance() {
        return Holder.INSTANCE;
    }


}
