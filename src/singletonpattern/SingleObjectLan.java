package singletonpattern;
/**
 * ����ģʽ(����ģʽ):
 * �ص�:
 * 1.����getInstance()ʱ��Ŵ���,���ķ��ڴ�
 * 2.���ַ�ʽ�߱��ܺõ� lazy loading,����ģʽ���ص��Ǽ�����ʱ�ȽϿ죬����������ʱ��ȡ������ٶȱȽ����� 
 * 3.�̲߳���ȫ,һ����getInstance()��synchronized���ܱ�֤��������������Ӱ��Ч��
 * @author Dekey.Shen
 *
 */
public class SingleObjectLan {
	private static SingleObjectLan instance;
	//���캯��˽�л�
	private SingleObjectLan(){};
	//��ȡ����
	public SingleObjectLan getInstance(){
		if (instance == null){
			instance = new SingleObjectLan();
		}
		return instance;
	}
	
}
