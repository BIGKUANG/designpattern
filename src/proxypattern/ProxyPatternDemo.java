package proxypattern;

public class ProxyPatternDemo {
	public static void main(String[] args) {
		Image image = new ProxyImage("test1.jpg");
		
		//ͼ��Ӵ��̼���
		image.display();
		System.out.println("");
		
		//ͼ���޷��Ӵ��̼���
		
		image.display();
	}
}
