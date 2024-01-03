import java.util.Scanner;
public class Ejemplo1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int num = 0;
		
		int res = 0;
		
		boolean comp = false;
		
		
		do{
			System.out.println("Introduce un número para saber si es primo o no:");
		
			num=sc.nextInt();
		
			if(num<0){
				System.out.println("Los números negativos no son números primos ya que pueden divirse por -1." + "\n");
			}
		
		}while(num<0);
		
		// En este bucle, se ejecutará el código hasta que el usuario introduzca un número positivo.
		
		
		for (int i=2;i<num;i++){
			
			res=num%i; // Guarda el resto de la division en 'res'
			
			if (res==0){
				
				comp = true;
			}
		}
		
		/* En este bucle, el valor de 'i' incrementará hasta que tome el valor que está por debajo del
		   número introducido por el usuario.*/
		
			
		if(comp==true){
			
			System.out.println(num + " no es primo.");
			
		}
		
		// Con este Si, indicamos que si 'comp' es verdadero el numero que ha introducido el usuario no es primo.
		
		
		else{
			
			System.out.println(num + " es primo.");
			
		}
		
		// Con else, indicamos que 'comp' es falso, por lo tanto el numero que ha introducido el usuario es primo.
		
		sc.close();
	}

}
