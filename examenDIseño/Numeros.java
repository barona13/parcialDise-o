import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Clase que contiene el programa principal para detectar diferentes tipos de números.
 */
public class Numeros {
    /**
     * Método principal que ejecuta el programa.
     * @param args los argumentos de la línea de comandos
     * @throws IOException si ocurre un error de entrada/salida
     */
    public static void main(String[] args) throws IOException {
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        int opcion;

        do {
            System.out.println("Programa que detecta los siguientes tipos de numeros: ");
            System.out.println("1. Perfecto");
            System.out.println("2. Defectivo");
            System.out.println("3. Abundante");
            System.out.println("Selecciona una opcion 1, 2, 3 (0 para salir): ");
            entrada = bufer.readLine();
            opcion = Integer.parseInt(entrada);
            System.out.println("---------------------------------");

            if (opcion != 0) {
                System.out.println("Ingresa un numero: ");
                entrada = bufer.readLine();
                int numero = Integer.parseInt(entrada);

                switch (opcion) {
                    case 1:
                        Perfecto perfecto = new Perfecto(numero);
                        perfecto.detectar();
                        break;
                    case 2:
                        Defectivo defectivo = new Defectivo(numero);
                        defectivo.detectar();
                        break;
                    case 3:
                        Abundante abundante = new Abundante(numero);
                        abundante.detectar();
                        break;
                    default:
                        System.out.println("Opcion no valida");
                }
            }
        } while (opcion != 0);
    }
}
