
public class Rectangle extends Shape{
	protected double width;
	protected double length;
	Rectangle(){
		super();
		width = 1;
		length = 1;
	}
	Rectangle(double l, double w){
		super();
		length = l;
		width =w;
	}
	Rectangle(double l, double w, String color, Boolean filled){
		super(color,filled);
		length = l;
		width =w;
	}
    public double getWidth() {
    	return width;
    }
    public double getLength() {
    	return length;
    }
    public void setWidth(double w) {
    	width = w;
    }
    public void setLength(double l) {
    	length = l;
    }
	@Override
	public double getArea() {
		return length*width;
	}
	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return (length+width)*2;
	}

}
