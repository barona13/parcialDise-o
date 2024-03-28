public class Burbuja {

	public static void burbuja(int[] arregloEnteros) {
		for (int x = 0; x < arregloEnteros.length; x++) {
			for (int y = 0; y < arregloEnteros.length - 1; y++) {
				int elementoActual = arregloEnteros[y];
				int elementoSiguiente = arregloEnteros[y + 1];
				if (elementoActual > elementoSiguiente) {
					// Intercambiar
					arregloEnteros[y] = elementoSiguiente;
					arregloEnteros[y + 1] = elementoActual;
				}
			}
		}

	}
}
