package singletonpattern;
/**
 * 
 * 1.����ģʽ(����ģʽ):
 * 
 * �ص�:
 * (1)�����ʱ�ͳ�ʼ�����˷��ڴ�
 * (2)������ʱ�Ƚ�����������ʱ��ȡ������ٶȱȽϿ�,�̰߳�ȫ
 * @author Dekey.Shen
 *
 */
public class SingleObjectE {
	// ���� SingleObject ��һ������
	private static SingleObjectE instance = new SingleObjectE();
	
	//�ù��캯��private��,��������Ͳ��ᱻʵ����
	private SingleObjectE(){};
	
	//��ȡΨһ���õĶ���
	public static SingleObjectE getInstance (){
		return instance;
	}
	public  void showMessage(){
		System.out.println("���,���ǵ�������!");
	}
}
