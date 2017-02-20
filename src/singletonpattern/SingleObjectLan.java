package singletonpattern;
/**
 * 单例模式(懒汉模式):
 * 特点:
 * 1.调用getInstance()时类才创建,不耗费内存
 * 2.这种方式具备很好的 lazy loading,懒汉模式的特点是加载类时比较快，但是在运行时获取对象的速度比较慢， 
 * 3.线程不安全,一般在getInstance()加synchronized才能保证单例，但加锁会影响效率
 * @author Dekey.Shen
 *
 */
public class SingleObjectLan {
	private static SingleObjectLan instance;
	//构造函数私有化
	private SingleObjectLan(){};
	//获取单例
	public SingleObjectLan getInstance(){
		if (instance == null){
			instance = new SingleObjectLan();
		}
		return instance;
	}
	
}
