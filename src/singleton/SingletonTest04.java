package singleton;

/**
 * @author plumcheng
 * @create 2023-02-05 22:42
 */
public class SingletonTest04 {
    public static void main(String[] args) {
        System.out.println("懒汉式2 ， 线程安全~");
        Singleton04 instance = Singleton04.getInstance();
        Singleton04 instance2 = Singleton04.getInstance();
        System.out.println(instance == instance2); // true
        System.out.println("instance.hashCode=" + instance.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());
    }
}

class Singleton04{
    private Singleton04(){};

    private static Singleton04 instance;

    public static synchronized Singleton04 getInstance(){
        if (instance == null){
            instance = new Singleton04();
        }
        return instance;
    }
}
