package factorypattern;
/**
 * 工厂模式:定义一个创建对象的接口，让其子类自己决定实例化哪一个工厂类，工厂模式使其创建过程延迟到子类进行。
 *何时使用:我们明确地计划不同条件下创建不同实例时使用工厂模式.
 * 注意:
 * 作为一种创建类模式，在任何需要生成复杂对象的地方，都可以使用工厂方法模式。
 * 有一点需要注意的地方就是复杂对象适合使用工厂模式，而简单对象，特别是只需要通过 new 
 * 就可以完成创建的对象，无需使用工厂模式。如果使用工厂模式，就需要引入一个工厂类，会增加系统的复杂度。
 * @author Dekey.Shen
 *
 */
public class FactoryPatternDemo {
	
	public static void main(String[] args) {
		
		ShapeFactory shapeFactory = new ShapeFactory();
		
		//获取 Circle 的对象，并调用它的 draw 方法
		Shape shape = shapeFactory.getShape("CIRCLE");
		//调用 Circle 的 draw 方法
		shape.draw();
		
		 //获取 Rectangle 的对象，并调用它的 draw 方法
		 shape = shapeFactory.getShape("RECTANGLE");
		 //调用Rectangle的draw()方法
		 shape.draw();
		 
	     //获取 Square 的对象，并调用它的 draw 方法
	     Shape shape3 = shapeFactory.getShape("SQUARE");
	     //调用 Square 的 draw 方法
	     shape3.draw();
	}

} 
