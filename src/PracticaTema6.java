import java.util.*;
public class PracticaTema6 {

	public static void main(String[] args) {
		
		int[] numeros = new int[20];
		int Aleatorio = 0;
		int mayor = 0;
		int menor = 1;
		int decision = 1;
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < numeros.length; i++) {
			
			Aleatorio = (int) Math.floor(Math.random()*(10)+1);
			numeros[i] = Aleatorio;
			
		}
		
		
		while(decision != 0) {
			
			System.out.println("MENU");
			System.out.println("Pulse 1 para mostrar el valor maximo");
			System.out.println("Pulse 2 para mostrar el valor minimo");
			System.out.println("Pulse 3 para calcular la media");
			System.out.println("Pulse 4 para mostrar el array");
			System.out.println("Pulse 5 para mostrar el numero de veces que se repite un numero");
			System.out.println("Pulse 0 para salir del programa");
			
		decision = sc.nextInt();
		
		switch(decision) {
		
		case 1: 
			
			int resultadomaximo = Maximo(mayor, numeros);
			System.out.println("El valor mas alto es: " + resultadomaximo);break;

		case 2: 
		
			int resultadominimo = Minimo(menor, numeros);
			System.out.println("El valor mas bajo es: " + resultadominimo);break;
		
		case 3:
		
			int resultadomedia = Media(numeros);	
			System.out.println("La media de los valores del array es: " + resultadomedia);break;
				
		case 4: 
			
			MostrarArray(numeros);
			break;
			
		case 5: 
			
			System.out.println("introduce un numero a buscar");
			int elegido = sc.nextInt();
			int resultadorepeticiones = RepeticionesArray(elegido, numeros);
			System.out.println("El numero introducido se ha repetido " + resultadorepeticiones + " veces");break;
			
		case 0: System.out.print("Has introducido un 0, saliendo del programa.");break;
			
		default: System.out.println("El valor introducido no es correcto");
		
		}
		
		}
		
		sc.close();

	}
	
	public static int Maximo(int mayor, int[] numeros) {
		
			for(int i = 0; i < numeros.length; i++) {
			
						if(mayor <= numeros[i]) {
				
								mayor = numeros[i];
				
							}
		
				}
		
				return mayor;
		
	}
	
	public static int Minimo(int menor, int[] numeros) {
		
			for(int i = 0; i < numeros.length; i++) {
			
					if (menor >= numeros[i]) {
				
							menor = numeros[i];
				
						}
			
				}
			
			return menor;
		
			}
	
	public static int Media(int[] numeros) {
		
		int suma = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			
			suma += numeros[i];
			
		}
		
		int media = suma / numeros.length;
		return media;
		
	}
	
	public static void MostrarArray(int[] numeros) {
		
		System.out.print("El array generado es: ");
		
		for (int i = 0; i < numeros.length; i++) {
		
		System.out.print(numeros[i] + " ");
		
	}
		
		System.out.print("\n");
		
	}
	
	public static int RepeticionesArray(int elegido, int[] numeros) {

		int repeticiones = 0;
		
		for(int i = 0; i < numeros.length; i++) {
			
			if(elegido == numeros[i]) {
				
				repeticiones++;
				
			}
			
		}
		
		return repeticiones;
		
	}

}
