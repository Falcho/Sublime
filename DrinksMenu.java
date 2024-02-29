import java.util.Scanner;
import java.util.ArrayList;

class DrinksMenu{
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);

	System.out.println("Hvor gammel er du?");
	String input = scan.nextLine();
    int age = Integer.parseInt(input);

    ArrayList<String> options = new ArrayList<>();
    	if(age > 18){
    		options.add("Gin&Tonic");
    		options.add("Rom&Cola");
    	}else{
    		options.add("Cola");
    		options.add("Saftevand");
    	}
	
	for(String option: options){
		System.out.println(option);

	}
	System.out.println("Hvor mange drinks vil du bestille?");
	int numberOfDrinks = Integer.parseInt(scan.nextLine());

	ArrayList<String> choices = new ArrayList<>();
	while(choices.size() < numberOfDrinks){
		System.out.println("Vaelg en drink fra listen");
		String choice = scan.nextLine();
		if(options.contains(choice)){
		choices.add(choice);
	}else{
		System.out.println("Dette er ikke end del af vores udvalg, prøv igen.");
	}
	}
	System.out.println("Du har valgt: "+choices);

}
}
	