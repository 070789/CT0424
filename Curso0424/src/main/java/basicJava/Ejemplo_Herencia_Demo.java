package basicJava;

public class Ejemplo_Herencia_Demo {

	public static void main(String[] args) {
		Ejemplo_Herencia_Triangulo t1 = new Ejemplo_Herencia_Triangulo();
		
		t1.base = 4.0;
		t1.altura = 4.0;
		t1.estilo ="Estilo 1";
		
		System.out.println("información pata T1: ");
		t1.mostrarEstilo();
		t1.mostrarDimension();
		System.out.println("Su area es: " + t1.area());
		
  //falta completar el otro ejemplo
	
	}

}
