
public class Main {

	public static void main(String[] args) {
	    Shape arr[] = new Shape[3];
		arr[0] = new Circle(0,0);
		arr[1] = new Rectangle(0,0,60,70);
		arr[2] = new Circle(3, 4, 5);
		Circle s = new Circle(1, 2, 5);
		System.out.println(arr[1]);
		System.out.println(arr[2].calcArea());
	}

}
