package ar.edu.unju.fi.ejercicio07;

import java.util.ArrayList;
import java.util.Scanner;

public class Frutas {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Scanner entrada2 = new Scanner(System.in);
		ArrayList<String> arrayFrutas= new ArrayList<String>();
		String nomFrutas;
		Character respuesta;
		do {
			System.out.println("Ingrese una fruta: ");
			nomFrutas=entrada.nextLine();
			arrayFrutas.add(nomFrutas);
			System.out.println("Desea seguir ingresando Frutas S/N: ");
			respuesta=entrada2.next().charAt(0);
		}while(respuesta.equals('s') | respuesta.equals('S'));
		
		System.out.println("Muestra el contenido de la lista que esten en posiciones pares");
		for(int i=0; i<arrayFrutas.size();i++)
		{
			if(i%2==0 && i!=0) {
				System.out.println(arrayFrutas.get(i));
			}
		}
		//Eliminacion de una fruta
		int indice;
		do {
			System.out.println("Ingrese un numero que este dentro del rango 0-"+ (arrayFrutas.size()-1) );
			indice=entrada.nextInt();
		}while(indice<0 || indice>(arrayFrutas.size()-1));
		arrayFrutas.remove(indice);
		
		//Muestro el contenido del ArrayList
		for(String palabras: arrayFrutas) { 
			System.out.println(palabras);
		}
		entrada.close();
		entrada2.close();
	}
}
