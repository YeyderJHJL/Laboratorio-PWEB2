import java.util.*;

//Imprimir nombre

public class IngresoNombre{

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese su nombre: ");
		String nombre = sc.nextLine();
		System.out.println("Hola "+nombre+", es un gusto tenerte en este curso");
	
	}
}

