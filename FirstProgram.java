public class FirstProgram{

	public static void main(String[]args){
		System.out.println("Hello World!");

		for(int i = 0; i<args.length;i++){
			System.out.println("i am testing you "+args[i]);
		}


		//For each loop
		for (String s: args){
		System.out.println("We are getting the hang of this "+s);
		}

		int a = 15;
		int b = 7;
		int c = 13;
		int d = 5;

		System.out.println(a+b+" "+(a+c)+" "+a+d);

	}



}