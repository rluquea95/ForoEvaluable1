import java.util.*;
public class Ejemplo4While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String eleccion = "", eleccion_juego = "", resultado = "", tecla = "";
		
		int aleatorio = 0;
		
		Scanner sc = new Scanner (System.in);
		
		// Se repite hasta que el usuario introduzca 'n'.
		do {
			
			// Se repite hasta que el usuario introduzca una respuesta válida.
			while(eleccion.equalsIgnoreCase("Piedra")== false && eleccion.equalsIgnoreCase("Papel") == false && eleccion.equalsIgnoreCase("Tijera") == false){
			
				System.out.print("Juguemos a Piedra, Papel o Tijera. \n\nIntroduce 'Piedra', 'Papel' o 'Tijera':");
			
				eleccion=sc.next();
			}  
			// Fin de la eleccion del usuario.
			
		// Se genera número aleatorio entre 0 y 100.	
		aleatorio = (int)(Math.random()*100);
		
		// Dependiendo del número aleatorio generado el código entrará en las distintas opciones para elegir 'Piedra', 'Papel' o 'Tijera'.
		
			if (aleatorio>=0 && aleatorio<=32) {
				eleccion_juego = "Piedra";
			
				if (eleccion.equalsIgnoreCase("Piedra")) {
					resultado = "Empate";
				}
				else if (eleccion.equalsIgnoreCase("Papel")) {
					resultado = "Ganaste";
				}
				else {
				resultado = "Perdiste";
				}
			}
		
			else if (aleatorio>=33 && aleatorio<=66) {
				eleccion_juego = "Papel";
			
				if (eleccion.equalsIgnoreCase("Piedra")) {
					resultado = "Perdiste";
				}
				else if (eleccion.equalsIgnoreCase("Papel")) {
					resultado = "Empate";
				}
				else {
					resultado = "Ganaste";
				}
			}	
		
			else if (aleatorio>=67 && aleatorio<=100) {
				eleccion_juego = "Tijera";
			
				if (eleccion.equalsIgnoreCase("Piedra")) {
					resultado = "Ganaste";
				}
				else if (eleccion.equalsIgnoreCase("Papel")) {	
					resultado = "Perdiste";
				}
				else {
					resultado = "Empate";
				}
			}
			// Fin de las distintas opciones que se mostrarán al usuario.
		
			System.out.println("\nHas elegido: " + eleccion.substring(0, 1).toUpperCase() + eleccion.substring(1) + ". " + "Y yo he sacado: " 
								+ eleccion_juego + ". " + resultado + ".");
		
			// Se repite mientras el usuario no introduzca una respuesta válida.
			do {
				System.out.println("¿Quieres volver a jugar? Pulsa 's' para continuar o 'n' para salir.");
		
				tecla = sc.next();
				
			}while(tecla.equalsIgnoreCase("s")== false && tecla.equalsIgnoreCase("n")== false);
			// Fin repetición respuesta usuario.
			
			
			eleccion = "";
		
		}while(tecla.equalsIgnoreCase("n")==false);
		// Fin repetición de 'Piedra', 'Papel' o 'Tijera'.
		
		sc.close();
	}
} // Fin del programa.

