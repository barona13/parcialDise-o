/**
 * La clase Perfecto representa un número perfecto y proporciona métodos para detectar si un número es perfecto o no.
 */
class Perfecto {
    private int numero;

    /**
     * Crea un objeto Perfecto con el número especificado.
     * @param numero El número a verificar si es perfecto.
     */
    public Perfecto(int numero) {
        this.numero = numero;
    }

    /**
     * Verifica si el número especificado es perfecto.
     * Un número perfecto es aquel cuya suma de sus divisores propios es igual al número.
     */
    public void detectar() {
        int suma = 0;
        for (int i = numero - 1; i >= 1; i--) {
            if (numero % i == 0) {
                suma += i;
            }
        }

        if (numero == suma)
            System.out.println("El numero " + numero + " es perfecto");
        else
            System.out.println("El numero " + numero + " no es perfecto");
    }
}
