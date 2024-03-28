/**
 * La clase Defectivo representa un número y tiene un método para detectar si el número es defectivo.
 */
public class Defectivo {
    private int numero;

    /**
     * Crea un objeto Defectivo con el número especificado.
     * @param numero El número a asignar al objeto Defectivo.
     */
    public Defectivo(int numero) {
        this.numero = numero;
    }

    /**
     * Detecta si el número es defectivo.
     * Un número es defectivo si la suma de sus divisores propios es menor que el número en sí mismo.
     * Imprime un mensaje indicando si el número es defectivo o no.
     */
    public void detectar() {
        int suma = 0;
        for (int i = numero - 1; i >= 1; i--) {
            if (numero % i == 0) {
                suma += i;
            }
        }

        if (numero > suma)
            System.out.println("El numero " + numero + " es defectivo");
        else
            System.out.println("El numero " + numero + " no es defectivo");
    }
}
