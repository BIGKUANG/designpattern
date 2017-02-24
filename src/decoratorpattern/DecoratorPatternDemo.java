package decoratorpattern;

public class DecoratorPatternDemo {
	public static void main(String[] args) {
		Shape circle = new Circle();
		
		
		Shape redCircle = new RedShapeDecorator(new Circle());
		
		Shape redRectangle = new RedShapeDecorator(new Rectangle());
		
		System.out.println("ֻ���һ��Բ");
		circle.draw();
		
		System.out.println("���һ��Բ�Ӻ�ɫ�߿�");
		redCircle.draw();
		
		System.out.println("���һ�����μӺ�ɫ�߿�");
		redRectangle.draw();
		
	}
}
