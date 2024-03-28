import java.util.Arrays;
import java.util.Scanner;


public class Utilidades {

	
	public static void main(String[] args) {
		menu();
	}

	public static void menu() {
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		

		do {
			System.out.println("----- MENU -----");
			System.out.println("1. Ordenar arreglo de enteros");
			System.out.println("2. Ordenar arreglo de strings");
			System.out.println("3. Verificar si un número es primo");
			System.out.println("4. Calcular resultado");
			System.out.println("5. Salir");
			System.out.print("Ingrese la opción deseada: ");
			opcion = sc.nextInt();

			switch (opcion) {
				case 1:
				

					break;
				case 2:
					String[] arregloStrings = { "Leon", "Chris", "Jill", "Wesker", "Ada" };
					System.out.println("Antes del método de la burbuja: " + Arrays.toString(arregloStrings));
					Burbujas.burbujas(arregloStrings);
					System.out.println("Después del método de la burbuja: " + Arrays.toString(arregloStrings));
					break;
				case 3:
					System.out.print("Ingrese el número para saber si es primo o no: ");
					int numero = sc.nextInt();
					boolean esPrimo = Primo.esPrimo(numero);
					System.out.println("El número " + numero + " es primo: " + esPrimo);
					break;
				case 4:
					System.out.println("Ingrese los 4 números double de la operación:");
					double a = sc.nextDouble();
					double b = sc.nextDouble();
					double c = sc.nextDouble();
					double d = sc.nextDouble();
					double resultado = CalcularResultado.calcularResultado(a, b, c, d);
					System.out.println("El resultado de la operación es: " + resultado);
					break;
				case 5:
					System.out.println("La ejecución ha terminado");
					break;
				default:
					System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
					break;
			}

			System.out.println();
		} while (opcion != 5);
	}

}
