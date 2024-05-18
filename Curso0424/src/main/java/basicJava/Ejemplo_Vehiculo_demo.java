package basicJava;

public class Ejemplo_Vehiculo_demo {

	//mandar a llamar los objetos de otra clase
	public static void main(String[] args) {
		Ejemplo_Vehiculo minivan = new Ejemplo_Vehiculo();
		
		int rango;
		
		//Asignar valor a las variables de minivan
		minivan.pasajeros = 9;
		minivan.capacidad = 15;
		minivan.kmh = 20;
		
		
		// Calcular el rango asumiendo un tanque lleno
		rango = minivan.capacidad * minivan.kmh;
		
		System.out.println("La minivan puede llevar " + minivan.pasajeros + " pasajeros con rango de " + rango + "kilometros");
		

	}

}
