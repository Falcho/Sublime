public class DieGame{


	public static void main(String[]args){
		Terning die = new Terning(12);


		System.out.println("Du rullede : "+die.throwDice());
	}
}