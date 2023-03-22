package singleton;

/**
 * @author plumcheng
 * @create 2023-01-31 23:20
 */
public class SingletonTest02 {

    public static void main(String[] args) {
        //测试
        Singleton02 instance = Singleton02.getInstance();
        Singleton02 instance2 = Singleton02.getInstance();
        System.out.println(instance == instance2); // true
        System.out.println("instance.hashCode=" + instance.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());
    }

}

//饿汉式(静态代码块)

class Singleton02 {

    //1. 构造器私有化, 外部能new
    private Singleton02() {

    }


    //2.本类内部创建对象实例
    private  static Singleton02 instance;

    static { // 在静态代码块中，创建单例对象
        instance = new Singleton02();
    }

    //3. 提供一个公有的静态方法，返回实例对象
    public static Singleton02 getInstance() {
        return instance;
    }

}
