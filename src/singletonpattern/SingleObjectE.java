package singletonpattern;
/**
 * 
 * 1.单例模式(饿汉模式):
 * 
 * 特点:
 * (1)类加载时就初始化，浪费内存
 * (2)加载类时比较慢，但运行时获取对象的速度比较快,线程安全
 * @author Dekey.Shen
 *
 */
public class SingleObjectE {
	// 创建 SingleObject 的一个对象
	private static SingleObjectE instance = new SingleObjectE();
	
	//让构造函数private化,这样该类就不会被实例化
	private SingleObjectE(){};
	
	//获取唯一可用的对象
	public static SingleObjectE getInstance (){
		return instance;
	}
	public  void showMessage(){
		System.out.println("你好,我是单例对象!");
	}
}
