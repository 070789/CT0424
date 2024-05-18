package basicJava;

public class Ejemplo_Ciclo_DoWhile {

	public static void main(String[] args) {
		int b = 10;
		
	//El código dentro del "do" se imprime incluso si la condición es falsa porque se ejecuta primero la condición 
		do {
			System.out.println("El valor de b es: " + b);
			b++;
		} while (b <= 20);

	}

}
