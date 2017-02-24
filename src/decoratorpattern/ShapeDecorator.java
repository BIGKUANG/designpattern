package decoratorpattern;

public abstract class ShapeDecorator implements Shape {
	protected Shape decorateShape;

	public ShapeDecorator(Shape decorateShape) {
		super();
		this.decorateShape = decorateShape;
	}
	
	public void draw(){
		decorateShape.draw();
	}
}
