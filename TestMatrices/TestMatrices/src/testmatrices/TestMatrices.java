/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testmatrices;

import java.util.Scanner;

public class TestMatrices {
    	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		int matriz[][] = new int[3][3];


		float sumaFila = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.println("Ingrese el número en la fila " + (i)
						+ " columna " + j + " :");
				matriz[i][j] = entrada.nextInt();
			}
		}
		for (int i = 0; i < matriz.length; i++) {
			sumaFila = 0;
			for (int j = 0; j < matriz[i].length; j++) {
				sumaFila += matriz[i][j];
				System.out.print(String.format(" %d ", matriz[i][j]));
			}
			System.out.print(String.format(
					" Suma fila: %f, promedio fila: %f ", sumaFila, sumaFila
							/ matriz.length));
			System.out.println();
		}
	}
}
