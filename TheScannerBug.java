import java.util.Scanner;

class TheScannerBug{
	public static void main(String[]args){
	System.out.print("What is your name?");
	name = in.nextLine();
	System.out.print("What is your age?");
	age = in.nextInt();
	System.out.print("Hello %s, age %d/n", name, age);

	}
}