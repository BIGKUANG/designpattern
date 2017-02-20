package AbstractFactoryPattern;

public class AbstractFactoryPatternDemo {

	public static void main(String[] args) {
		//��ȡ�����Ĺ���
		AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
		//��ȡ��״Circle����
		Shape shape1 = shapeFactory.getShape("CIRCLE");
		//����ͼ��Circle��draw����
		shape1.draw();
		//��ȡRectangle����
		Shape shape2 = shapeFactory.getShape("RECTANGLE");
		//����Rectangle��draw����
		shape2.draw();
		//��ȡSquare����
		Shape shape3 = shapeFactory.getShape("SQUARE");
		//����Square��draw����
		shape3.draw();
		
		
		//��ȡ��ɫ�Ĺ���
		AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
		//��ȡ��ɫ����
		Color color1 = colorFactory.getColor("RED");
		//����Red��fill����
		color1.fill();
		//������ɫ����
		Color color2 = colorFactory.getColor("GREEn");
		//����Green��fill����
		color2.fill();
		//������ɫ����
		Color color3 =colorFactory.getColor("BLUE");
		//����Blue��fill����
		color3.fill();
		
		

	}

}
