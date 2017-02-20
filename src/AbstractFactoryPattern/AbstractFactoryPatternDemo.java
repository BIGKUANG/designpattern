package AbstractFactoryPattern;

public class AbstractFactoryPatternDemo {

	public static void main(String[] args) {
		//获取工厂的工厂
		AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
		//获取形状Circle对象
		Shape shape1 = shapeFactory.getShape("CIRCLE");
		//调用图像Circle的draw方法
		shape1.draw();
		//获取Rectangle对象
		Shape shape2 = shapeFactory.getShape("RECTANGLE");
		//调用Rectangle的draw方法
		shape2.draw();
		//获取Square对象
		Shape shape3 = shapeFactory.getShape("SQUARE");
		//调用Square的draw方法
		shape3.draw();
		
		
		//获取颜色的工厂
		AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
		//获取红色对象
		Color color1 = colorFactory.getColor("RED");
		//调用Red的fill方法
		color1.fill();
		//创建绿色对象
		Color color2 = colorFactory.getColor("GREEn");
		//调用Green的fill方法
		color2.fill();
		//创建蓝色对象
		Color color3 =colorFactory.getColor("BLUE");
		//调用Blue的fill方法
		color3.fill();
		
		

	}

}
