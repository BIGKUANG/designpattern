package prototypepattern;

public class Rectangle extends Shape {

	public Rectangle(){
		type = "����";
	}
	@Override
	void draw() {
		System.out.println("���Ǿ��ε�draw���� ");
	}

}
