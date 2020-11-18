
public class Circle extends Shape{
	public double radius;
	public Circle(double i, double j) {
		super(i, j);
	}
	public Circle(double i, double j, double radius) {
		super(i, j);
		this.radius = radius;
	}
	public double calcArea() {
		return Math.PI*radius*radius;
	}
	public String toString() {
		return "Circle: x = "+ super.getX()+"y = "+super.getY();
	}
}
