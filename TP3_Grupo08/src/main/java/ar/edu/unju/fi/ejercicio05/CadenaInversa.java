package ar.edu.unju.fi.ejercicio05;

import java.util.Scanner;

public class CadenaInversa {
    public static void main(String[] args) {
        String mensaje;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un mensaje");
        mensaje=scanner.nextLine();
        char[] lista = new char[mensaje.length()];
        int k=0;
        for (int i=mensaje.length()-1;i>=0;i--){
            lista[k]=mensaje.charAt(i);
            k++;
        }
        for (int j=0;j< lista.length;j++){
            System.out.println(lista[j]);
        }
    }
}
