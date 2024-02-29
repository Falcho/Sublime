import java.util.Scanner;
import java.time.Year;
import java.time.YearMonth;
import java.time.LocalDate;

public class Dialog{
	public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);
		LocalDate currentDate = LocalDate.now();


		System.out.println("Hvilket år er du født i?");
		//String input = scanner.nextLine();
		int input = scanner.nextInt();

		//int thisYear = Year.now().getValue(); // Bruger java.time.year
		int thisYear = currentDate.getYear(); // Bruger .LocalDate
		int birthYear = thisYear-input;

		System.out.println("Du er "+birthYear+" år!");

	}
}