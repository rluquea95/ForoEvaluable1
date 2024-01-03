import java.util.Scanner;
public class Ejemplo3Iterativa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		String respuesta = "";
		
		while(respuesta.equalsIgnoreCase("h")==false && respuesta.equalsIgnoreCase("m")==false){
			
			System.out.println("¿Eres hombre o mujer?. Introduce 'h' o 'm'");
		
			respuesta = sc.next();
		}		
		sc.close();
	}
}
