package singleton;

/**
 * @author plumcheng
 * @create 2023-02-05 22:45
 */
public class SingletonTest05 {
    public static void main(String[] args) {
        System.out.println("双重检查");
        Singleton05 instance = Singleton05.getInstance();
        Singleton05 instance2 = Singleton05.getInstance();
        System.out.println(instance == instance2); // true
        System.out.println("instance.hashCode=" + instance.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());

    }
}

class Singleton05 {
    private static volatile Singleton05 instance;

    private Singleton05() {}

    //提供一个静态的公有方法，加入双重检查代码，解决线程安全问题, 同时解决懒加载问题
    //同时保证了效率, 推荐使用

    public static Singleton05 getInstance() {
        if(instance == null) {
            synchronized (Singleton05.class) {
                if(instance == null) {
                    instance = new Singleton05();
                }
            }

        }
        return instance;
    }
}