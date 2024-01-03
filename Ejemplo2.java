import java.util.Scanner;
public class Ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		int num = 0;
		
		int res = 0;
		
		
		System.out.println("Introduce un número para obtener su factorial:");
		
		num = sc.nextInt();
		
		res = num;
		
		
		for(int i=1;i<num;i++){
			
			res*=i;
		}
		
		/* En este bucle, el valor de 'i' incrementará hasta que tome el valor por debajo 
		del número que ha introducido el usuario. En la variable 'res' se va almacenando
		el resultado de multiplicarse por 'i'*/
		
		sc.close();
		
		System.out.println("El factorial de " + num + " es: " + res);
	}

}
