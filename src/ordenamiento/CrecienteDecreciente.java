package ordenamiento;

import java.util.Scanner;

public class CrecienteDecreciente {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int arreglo[], aux, nElementos;

		System.out.println("Digite el tamaño del arreglo");
		nElementos = entrada.nextInt();
		arreglo = new int[nElementos];

		for (int i = 0; i < nElementos; i++) {
			System.out.print("Digite un numero: ");
			arreglo[i] = entrada.nextInt();
		}

		for (int i = 0; i < (nElementos - 1); i++) {
			for (int j = 0; j < (nElementos - 1); j++) {
				if (arreglo[j] > arreglo[j + 1]) {
					aux = arreglo[j];
					arreglo[j] = arreglo[j + 1];
					arreglo[j + 1] = aux;

				}
			}
		}
		System.out.println("El arreglo ordenado de forma creciente es el siguiente: ");
		for (int i = 0; i < (nElementos); i++) {
			System.out.print(arreglo[i] + " ");
		}
		System.out.println(" ");
		System.out.println("El arreglo ordenado de forma decreciente es el siguiente: ");
		for (int i = (nElementos - 1); i >= 0; i--) {
			System.out.print(arreglo[i] + " ");
		}
		System.out.println("Adios ");
	}
}
