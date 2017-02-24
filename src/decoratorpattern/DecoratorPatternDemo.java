package decoratorpattern;

public class DecoratorPatternDemo {
	public static void main(String[] args) {
		Shape circle = new Circle();
		
		
		Shape redCircle = new RedShapeDecorator(new Circle());
		
		Shape redRectangle = new RedShapeDecorator(new Rectangle());
		
		System.out.println("只输出一个圆");
		circle.draw();
		
		System.out.println("输出一个圆加红色边框");
		redCircle.draw();
		
		System.out.println("输出一个矩形加红色边框");
		redRectangle.draw();
		
	}
}
