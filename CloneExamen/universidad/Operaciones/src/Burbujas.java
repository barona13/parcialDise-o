public class Burbujas {
    public static void burbujas(String[] arreglo) {
		for (int x = 0; x < arreglo.length; x++) {
			for (int y = 0; y < arreglo.length - 1; y++) {
				String elementoActual = arreglo[y];
				String elementoSiguiente = arreglo[y + 1];
				if (elementoActual.compareTo(elementoSiguiente) > 0) {
					// Intercambiar
					arreglo[y] = elementoSiguiente;
					arreglo[y + 1] = elementoActual;
				}
			}
		}
	}
    
}
