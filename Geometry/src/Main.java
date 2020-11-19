import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		if(n==1) {
			System.out.println("Enter radius for circle:");
			double r = in.nextDouble();
			Circle sh = new Circle(r);
			System.out.println(sh);
			System.out.println(sh.getArea()+" "+sh.getPerimeter());
		}else {
			System.out.println("Enter length and width for rectangle:");
			double l = in.nextDouble(),  w = in.nextDouble();
			Rectangle sh = new Rectangle(l,w);
			System.out.println(sh);
			System.out.println(sh.getArea()+" "+sh.getPerimeter());
		
		}
	}

}
