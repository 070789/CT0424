package basicJava;

public class Ejemplo_Metodos {

	public static void main(String[] args) {
		int resultado = suma(30,45);
		
		System.out.println(resultado);
		
		String marca = carro(2);
		System.out.println(marca);

	}
	public static int suma(int a, int b) {
		int c = a + b;
		return c;
	}
	
	public static String carro(int a) {
		String[] cars = {"Volvo", "BMW", "Ford"};
		return cars[a];
	}

}
