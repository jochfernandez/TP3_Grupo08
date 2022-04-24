package ar.edu.unju.fi.ejercicio02;

import java.util.Scanner;

public class Multiplicacion {

	public static void main(String[] args) {
		int maxmultiplicare[] = new int [11];
		boolean bandera=false; int i=0; String confirmacion; int n=0; boolean amultiplicar=false;
		for(i=0; i<11; i++) {
			maxmultiplicare[i]=i;
		}
		Scanner scanner = new Scanner(System.in);
		while(bandera==false) {
			try {
				System.out.println("Ingrese un numero: ");
				n=scanner.nextInt();
				amultiplicar=false;
			}catch(Exception e) {
				System.out.println("¡No debe ingresar un dato que no sea un numero!");
				scanner.nextLine();
				amultiplicar=true;
			}
				if(amultiplicar==false) {
					for(i=0;i<11;i++) {
						System.out.println(n+" x "+maxmultiplicare[i]+"= "+(n*maxmultiplicare[i]));
				}
			}
			System.out.println("¿Desea seguir multiplicando?: (Si no es asi ingrese n, de lo contrario coloque otra letra y continue multiplicando)");
			confirmacion=scanner.next();
			if(confirmacion.equals("n") ) {
				bandera=true;
			}
		}

	}

}
