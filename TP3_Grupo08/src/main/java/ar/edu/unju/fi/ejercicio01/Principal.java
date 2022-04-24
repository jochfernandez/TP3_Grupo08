package ar.edu.unju.fi.ejercicio01;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Division unaDivision = new Division();
		int array1[] = new int [5];
		int array2[] = new int [5];
		int n=0, i=-1,index1=0,index2=0,index3=0;
		boolean bandera=false, completado=false;
		Scanner scanner = new Scanner(System.in);
		while(completado==false) {
			try {
				System.out.println("Ingrese un numero: ");
				n=scanner.nextInt();
				bandera=true;
			}catch(Exception e){
				System.out.println("Debe ingresar un número entero");
				scanner.nextLine();
				bandera=false;
			}
			if(bandera==true) {
				i++;
				if(i<5) {
					array1[i]=n;
				}
				else {
					array2[i-5]=n;
				}
			}
			if (i==9)
				completado=true;
			else
				completado=false;
		}
		scanner.close();
		for(index1=0;index1<5;index1++) {
			System.out.println("Arreglo 1 "+array1[index1]);
		}
		for(index2=0;index2<5;index2++) {
			System.out.println("Arreglo 2 "+array2[index2]);
		}
		for(index3=0;index3<5;index3++) {
			System.out.println("Division "+array1[index3] + "/" + array2[index3]);
			unaDivision.div(array1[index3], array2[index3]);
		}
	}

}
