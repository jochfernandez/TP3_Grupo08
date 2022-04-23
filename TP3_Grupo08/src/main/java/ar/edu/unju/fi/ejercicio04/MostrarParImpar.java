package ar.edu.unju.fi.ejercicio04;

import java.util.Scanner;

public class MostrarParImpar {
	public static void main(String[] args) {
		Scanner entradaInt = new Scanner(System.in);
		int arreglo[] = new int[8];
		for(int i=0; i<arreglo.length;i++) {
			System.out.println("Ingrese un numero entero: ");
			arreglo[i] = entradaInt.nextInt();
		}
		for(int mostrar: arreglo) {
			if(mostrar%2==0) {
				System.out.println(mostrar+" par");
			}else {
				System.out.println(mostrar+" impar");
			}
		}
		entradaInt.close();
	}
}
