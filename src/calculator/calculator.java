package calculator;
import java.util.Scanner;
public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("what method would you like to use");
		String t = scanner.nextLine();

		System.out.println("Input numbers");
		int a = scanner.nextInt();
		int b = scanner.nextInt();

		if(t.equals("multiplication")){
			System.out.println(mult(a,b));
		}
		else if (t.equals("subtraction")){
			System.out.println(sub(a,b));
		}
		else if(t.equals("addition")){
			System.out.println(add(a,b));

		}
		else if(t.equals("division")){

			System.out.println(div(a,b));
		}

	}
	public static double mult(int a, int b){
		double mult = (a* b);
		return mult;

	}
	public static double sub(int a, int b){
		double sub = (a - b);
		return sub;
	}
	public static double add(int a, int b){
		double add = (a +b);
		return add;
	}
	public static double div(int a, int b){
		double div = (a /b);
		return div;
	}
}