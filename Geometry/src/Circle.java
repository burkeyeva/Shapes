
public class Circle extends Shape{
	protected double radius;
	public Circle() {
		super();
		radius = 1;
	}
	public Circle(double i) {
		super();
		radius = i;
	}
	public Circle(double radius, String color, Boolean filled) {
		super(color,filled);
		this.radius = radius;
	}

	public String toString() {
		return "Circle: x";
	}
	@Override
	public double getArea() {
		
		return Math.PI*radius*radius;
	}
	@Override
	public double getPerimeter() {
		return 2*Math.PI*radius;
	}
}
