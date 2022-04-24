package ar.edu.unju.fi.ejercicio06;

import java.util.Scanner;

public class NumerosInversos {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        Scanner scanner = new Scanner(System.in);
        int k=0;
        for (int i=0;i< numeros.length;i++){
            System.out.println("Ingrese 10 numeros");
            numeros[i]=scanner.nextInt();

        }
        for (int j= numeros.length-1;j>=0;j--){
            System.out.println(numeros[j]);
        }

    }
}
