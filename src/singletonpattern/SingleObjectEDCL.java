package singletonpattern;

/**
 * 单例模式:
 * 双检锁/双重校验锁
 * @author Dekey.Shen
 *
 */

public class SingleObjectEDCL {
	
	private volatile static SingleObjectEDCL instance;
	private SingleObjectEDCL(){};
	
	public static SingleObjectEDCL getInstance(){
		if (instance == null){
			synchronized (SingleObjectEDCL.class) {  
		        if (instance == null) {  
		            instance = new SingleObjectEDCL();  
		        }  
		        }  
		}
		return instance;
	}

	public  void showMessage(){
		System.out.println("你好,我是单例对象!");
	}
}
