package singletonpattern;

public class SingleObjectDemo {

	public static void main(String[] args) {
		//���Ϸ��Ĺ��캯��
		//����ʱ����:���캯��singleObject()�ǲ��ɼ���
		//SingleObject object = new SingleObject();
		
		SingleObjectE object = SingleObjectE.getInstance();
		
		object.showMessage();
		
		//SingleObject object1 = SingleObject.getInstance();
		//System.out.println(object==object1);

	}

}
