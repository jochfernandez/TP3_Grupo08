package ar.edu.unju.fi.ejercicio08;

import java.util.ArrayList;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio03.Alumno;

public class ListaAlumno {
	public static void main(String[] args) {
		int opcion;
		ArrayList<Alumno> losAlumnos=new ArrayList<Alumno>();
		
		Alumno unAlumno=new Alumno();//Instancio el objeto alumno
		
		do {
			opcion=mostrarMenu();
			switch(opcion) {
			case 1: unAlumno=cargarNuevoAlumno();
					if(verificar(losAlumnos,unAlumno.getLU())==true){
						System.out.println("No se permiten Alumnos repetidos");
					}else {
						losAlumnos.add(unAlumno);//Carga alumnos en el ArrayList
					}
						break;
			case 2:eliminarAlumno(losAlumnos);
				break;
			case 3:modificarNotaAlumno(losAlumnos);
				break;
			case 4:mostrarAlumnos(losAlumnos);
				break;
			case 5:mostrarAlumnosPromedio6(losAlumnos);
				break;
			case 6:System.out.println("Fin del Programa");
				break;
			default:System.out.println("Opcion no existente");
				break;
			}
		}while(opcion!=6);
	}
	public static int mostrarMenu() {
		Scanner entrada=new Scanner(System.in);
		System.out.println("1- Nuevo alumno");
		System.out.println("2- Eliminar alumno");
		System.out.println("3- Modificar notas del alumno");
		System.out.println("4- Mostrar todos los alumnos");
		System.out.println("5- Mostrar los alumnos que superen el promedio de 6");
		System.out.println("6- Salir");
		int opcion=entrada.nextInt();
		return opcion;
	}
	//Realiza la carga de alumno nuevos
	public static Alumno cargarNuevoAlumno() {
		Scanner entrada=new Scanner(System.in);
		System.out.println("Ingrese el nombre: ");
		String nombre=entrada.nextLine();
		System.out.println("Ingrese el Apellido: ");
		String apellido=entrada.nextLine();
		System.out.println("Ingrese la Libreta Universitaria: ");
		String lu=entrada.nextLine(); 
		System.out.println("Ingrese las notas: ");
		double nota[]=new double[5]; 
		for(int i=0;i<5;i++) {
			nota[i]=entrada.nextDouble();
		}
		Alumno unAlumno=new Alumno(nombre, apellido, lu, nota);
		return unAlumno;
	}
	public static void eliminarAlumno(ArrayList<Alumno> losAlumnos) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("--------Eliminación---------");
		int indice=buscar(losAlumnos);
		if(indice!=-1) {
			System.out.println("LU: "+losAlumnos.get(indice).getLU()+" existe");
			System.out.println(losAlumnos.get(indice));
			losAlumnos.remove(indice);
		}else{
			System.out.println("LU ingresado no existe");
		}
	}
	public static void modificarNotaAlumno(ArrayList<Alumno> losAlumnos) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("-------Modificación de nota-----");
		int indice=buscar(losAlumnos);
		if(indice!=-1) {
			double nota[]=new double[5];
			System.out.println("Modifique la nota del alumno: ");
			//System.out.println(losAlumnos.get(indice));
			for(int i=0;i<5;i++) {
				nota[i]=entrada.nextDouble();
			}
			losAlumnos.get(indice).setNotas(nota);
		}else{
			System.out.println("LU ingresado no existe");
		}
		
	}
	public static void mostrarAlumnos(ArrayList<Alumno> losAlumnos) {
		if(losAlumnos.size()!=0) {
			for(Alumno ver: losAlumnos) {
				System.out.println(ver);
			}
		}else {
			System.out.println("Lista vacia");
		}
	}
	public static void mostrarAlumnosPromedio6(ArrayList<Alumno> losAlumnos) {
		//Muestra los alumnos cuyo promedio supera el 6
		for(Alumno unAlumno: losAlumnos) {
			if(unAlumno.calcularPromedio(unAlumno.getNotas()) >6) {
				System.out.println(unAlumno.toString());
			}
		}
		
		
	}
	public static int buscar(ArrayList<Alumno> losAlumnos) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese LU para buscar: ");
		String lu = entrada.nextLine();
		int indice=-1;
		//Encuentra la posicion del alumno en el arraylist
		for(int i=0;i<losAlumnos.size();i++) {
			if(losAlumnos.get(i).getLU().equals(lu)	)
			{
				indice=i;
			}
		}
		return indice;
	}
	//Metodo para que no se repitan las misma personas
	public static boolean verificar(ArrayList<Alumno> losAlumnos, String LU) {
		boolean bandera=false;
		for(int i=0;i<losAlumnos.size();i++) {
			if(losAlumnos.get(i).getLU().equals(LU)	)
			{
				bandera=true;
			}
		}
		return bandera;
	}
}
