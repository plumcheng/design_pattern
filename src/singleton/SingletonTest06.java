package singleton;

/**
 * @author plumcheng
 * @create 2023-02-05 22:46
 */
public class SingletonTest06 {
    public static void main(String[] args) {
        System.out.println("使用静态内部类完成单例模式");
        Singleton06 instance = Singleton06.getInstance();
        Singleton06 instance2 = Singleton06.getInstance();
        System.out.println(instance == instance2); // true
        System.out.println("instance.hashCode=" + instance.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());

    }
}
// 静态内部类完成， 推荐使用
class Singleton06 {
    private static volatile Singleton06 instance;

    //构造器私有化
    private Singleton06() {}

    //写一个静态内部类,该类中有一个静态属性 Singleton
    private static class SingletonInstance {
        private static final Singleton06 INSTANCE = new Singleton06();
    }

    //提供一个静态的公有方法，直接返回SingletonInstance.INSTANCE

    public static synchronized Singleton06 getInstance() {

        return SingletonInstance.INSTANCE;
    }
}