package singletonpattern;

/**
 * ����ģʽ:
 * ˫����/˫��У����
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
		System.out.println("���,���ǵ�������!");
	}
}
