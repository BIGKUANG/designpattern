package iteratorpattern;
/**
 * ������ģʽ:����ģʽ����˳����ʼ��϶����Ԫ�أ�����Ҫ֪�����϶���ĵײ��ʾ��
 * ��ͼ���ṩһ�ַ���˳�����һ���ۺ϶����и���Ԫ��, �������뱩¶�ö�����ڲ���ʾ��
 * �ŵ㣺
 * 1����֧���Բ�ͬ�ķ�ʽ����һ���ۺ϶��� 
 * 2�����������˾ۺ��ࡣ
 * 3����ͬһ���ۺ��Ͽ����ж��������
 * 4���ڵ�����ģʽ�У������µľۺ���͵������඼�ܷ��㣬�����޸�ԭ�д��롣
 * @author Dekey.Shen
 *
 */
public class IteratorPatternDemo {
	
	public static void main(String[] args) {
		NameRepository nameRepository = new NameRepository();
		
		for(Iterator iter = nameRepository.getIterator();iter.hasNext();){
			String name = (String)iter.next();
			System.out.println("name:"+name);
		}
	}
}
