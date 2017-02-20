package singletonpattern;

public class SingleObjectDemo {

	public static void main(String[] args) {
		//不合法的构造函数
		//编译时错误:构造函数singleObject()是不可见的
		//SingleObject object = new SingleObject();
		
		SingleObjectE object = SingleObjectE.getInstance();
		
		object.showMessage();
		
		//SingleObject object1 = SingleObject.getInstance();
		//System.out.println(object==object1);

	}

}
