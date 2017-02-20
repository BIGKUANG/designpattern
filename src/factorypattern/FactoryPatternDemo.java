package factorypattern;
/**
 * ����ģʽ:����һ����������Ľӿڣ����������Լ�����ʵ������һ�������࣬����ģʽʹ�䴴�������ӳٵ�������С�
 *��ʱʹ��:������ȷ�ؼƻ���ͬ�����´�����ͬʵ��ʱʹ�ù���ģʽ.
 * ע��:
 * ��Ϊһ�ִ�����ģʽ�����κ���Ҫ���ɸ��Ӷ���ĵط���������ʹ�ù�������ģʽ��
 * ��һ����Ҫע��ĵط����Ǹ��Ӷ����ʺ�ʹ�ù���ģʽ�����򵥶����ر���ֻ��Ҫͨ�� new 
 * �Ϳ�����ɴ����Ķ�������ʹ�ù���ģʽ�����ʹ�ù���ģʽ������Ҫ����һ�������࣬������ϵͳ�ĸ��Ӷȡ�
 * @author Dekey.Shen
 *
 */
public class FactoryPatternDemo {
	
	public static void main(String[] args) {
		
		ShapeFactory shapeFactory = new ShapeFactory();
		
		//��ȡ Circle �Ķ��󣬲��������� draw ����
		Shape shape = shapeFactory.getShape("CIRCLE");
		//���� Circle �� draw ����
		shape.draw();
		
		 //��ȡ Rectangle �Ķ��󣬲��������� draw ����
		 shape = shapeFactory.getShape("RECTANGLE");
		 //����Rectangle��draw()����
		 shape.draw();
		 
	     //��ȡ Square �Ķ��󣬲��������� draw ����
	     Shape shape3 = shapeFactory.getShape("SQUARE");
	     //���� Square �� draw ����
	     shape3.draw();
	}

} 
