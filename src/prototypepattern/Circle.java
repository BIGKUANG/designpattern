package prototypepattern;

public class Circle extends Shape {

	public Circle(){
		type = "Circle";
	}
	@Override
	void draw() {
		System.out.println("这是圆形的draw()方法");

	}

}
