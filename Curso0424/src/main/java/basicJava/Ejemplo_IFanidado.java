package basicJava;

public class Ejemplo_IFanidado {

	public static void main(String[] args) {
		int temperatura = 10;
		
		if (temperatura > 15) {
			if (temperatura > 25) {
				System.out.println("A la playa!!!");
			}else { 
				System.out.println("A la montaña!!!");
			}
			
		}else {
			System.out.println("A descanzar...");
		}

	}

}
