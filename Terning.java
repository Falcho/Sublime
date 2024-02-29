import java.util.Random;

public class Terning{
int sides;

	Terning(int sides){ 	//Constructor (må ikke have andet end et navn som er det samme som class)
		this.sides = sides;
	}

		public int throwDice(){ // Method
			Random random = new Random();


			return random.nextInt(sides)+1; // Return value +1

			
		}

	}


