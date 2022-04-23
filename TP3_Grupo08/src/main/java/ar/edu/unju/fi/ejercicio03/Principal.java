package ar.edu.unju.fi.ejercicio03;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner entradaStr = new Scanner(System.in);
		Scanner entradaInt = new Scanner(System.in);
		double arreglo[] = new double [5];
		int num;
		System.out.println("Ingrese nombre: ");
		String nombre = entradaStr.nextLine();
		System.out.println("Ingrese apellido: ");
		String apellido = entradaStr.nextLine();
		System.out.println("Ingrese Libreta Universitaria: ");
		String libreta = entradaStr.nextLine();
		System.out.println("Ingrese notas: ");
		for(int i=0; i<(arreglo.length); i++) {
			System.out.println("Nota N°"+(i+1)+": ");
			num = entradaInt.nextInt();
			arreglo[i] = num;
		}
		Alumno unAlumno = new Alumno(nombre,apellido,libreta,arreglo);
		System.out.println(unAlumno.toString());
		entradaStr.close();
		entradaInt.close();
	}
}
