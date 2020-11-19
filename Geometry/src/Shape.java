
public abstract class Shape {
	protected String color;
	protected Boolean filled;
	Shape(){
		color = "red";
		filled = true;
	}
	Shape(String color, Boolean filled){
		this();
		this.color = color;
		this.filled = filled;
	}
	public String getColor() {
		return color;
	}
	public Boolean isFilled() {
		return filled;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setFilled(Boolean filled) {
		this.filled = filled;
	}
	public abstract double getArea();
	public abstract double getPerimeter();
	public String toString() {
		return "Shape[color="+color+", filled="+filled+"]";
	}
}
