package proxypattern;

public class ProxyPatternDemo {
	public static void main(String[] args) {
		Image image = new ProxyImage("test1.jpg");
		
		//图像从磁盘加载
		image.display();
		System.out.println("");
		
		//图像无法从磁盘加载
		
		image.display();
	}
}
