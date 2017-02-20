package prototypepattern;

public class Square extends Shape {
	public Square(){
		type = "Square";
	}
	@Override
	void draw() {
		System.out.println("这是正方形的draw()方法");

	}

}
