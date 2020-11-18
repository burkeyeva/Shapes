
public abstract class Shape {
	private double x;
	private double y;
	Shape(){
		x = 0;
		y = 0;
	}
	Shape(double x, double y){
		this.x = x;
		this.y = y;
	}
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public abstract double calcArea();
}
