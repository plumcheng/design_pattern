package singleton;

/**
 * @author plumcheng
 * @create 2023-01-31 23:20
 */
public class SingletonTest01 {

	public static void main(String[] args) {
		//测试
		Singleton01 instance = Singleton01.getInstance();
		Singleton01 instance2 = Singleton01.getInstance();
		System.out.println(instance == instance2); // true
		System.out.println("instance.hashCode=" + instance.hashCode());
		System.out.println("instance2.hashCode=" + instance2.hashCode());
	}

}

//饿汉式(静态变量)

class Singleton01 {

	//1. 构造器私有化, 外部能new
	private Singleton01() {

	}

	//2.本类内部创建对象实例
	private final static Singleton01 instance = new Singleton01();

	//3. 提供一个公有的静态方法，返回实例对象
	public static Singleton01 getInstance() {
		return instance;
	}

}