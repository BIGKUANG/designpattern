package prototypepattern;

public class Rectangle extends Shape {

	public Rectangle(){
		type = "矩形";
	}
	@Override
	void draw() {
		System.out.println("这是矩形的draw方法 ");
	}

}
