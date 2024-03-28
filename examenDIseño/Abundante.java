/**
 * La clase Abundante representa un número y tiene un método para detectar si el número es abundante.
 */
public class Abundante {
    private int numero;

    /**
     * Crea un objeto Abundante con el número especificado.
     * @param numero El número a ser evaluado.
     */
    public Abundante(int numero) {
        this.numero = numero;
    }

    /**
     * Detecta si el número es abundante.
     * Un número es abundante si la suma de sus divisores propios es mayor que el número mismo.
     */
    public void detectar() {
        int suma = 0;
        for (int i = numero - 1; i >= 1; i--) {
            if (numero % i == 0) {
                suma += i;
            }
        }

        if (numero > 2 * suma)
            System.out.println("El numero " + numero + " es abundante");
        else
            System.out.println("El numero " + numero + " no es abundante");
    }
}
