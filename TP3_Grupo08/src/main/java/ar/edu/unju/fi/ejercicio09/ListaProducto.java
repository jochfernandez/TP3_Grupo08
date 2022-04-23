package ar.edu.unju.fi.ejercicio09;

import java.util.ArrayList;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio09.Producto;

public class ListaProducto {
	public static void main(String[] args) {
		ArrayList<Producto> losProductos = new ArrayList<Producto>();
		Producto unProducto = new Producto();
		int opcion;
		do {
			opcion=mostrarMenu();
			switch(opcion)
			{
			case 1:unProducto=cargarProducto();
					if(verificar(losProductos,unProducto.getCodigo()) == true) {
						System.out.println("No se permiten Productos repetidos");
					}else {
						losProductos.add(unProducto);
					}
				break;
			case 2:mostrarProductos(losProductos);
				break;
			case 3:incrementoPrecio(losProductos);
				break;
			case 4:sumaDePrecios(losProductos);
				break;
			case 5:System.out.println("FIN DEL PROGRAMA");
				break;
			default:System.out.println("Opcion no existente");
				break;
			}
		}while(opcion!=5);
	}
	public static int mostrarMenu() {
		Scanner entrada=new Scanner(System.in);
		System.out.println("1- Nuevo producto");
		System.out.println("2- Mostrar todos los productos");
		System.out.println("3- Incrementar precio a todos los productos");
		System.out.println("4- Monto total de todos los productos");
		System.out.println("5- Salir");
		System.out.println("Ingrese un opcion: ");
		int opcion=entrada.nextInt();
		return opcion;
	}
	public static Producto cargarProducto() {
		Scanner entrada2=new Scanner(System.in);
		System.out.println("Ingrese Descripcion: ");
		String descripcion=entrada2.nextLine();
		System.out.println("Ingrese Marca: ");
		String marca=entrada2.nextLine();
		System.out.println("Ingrese cod. de producto: ");
		int cod=entrada2.nextInt();
		System.out.println("Ingrese Precio: ");
		double precio=entrada2.nextDouble();
		Producto unProducto=new Producto(cod, descripcion, precio, marca);
		return unProducto;
	}
	public static void mostrarProductos(ArrayList<Producto> losProducto) {
		if(losProducto.size()!=-1) {
			for(Producto ea: losProducto) {
				System.out.println(ea.toString());
			}
		}else {
			System.out.println("Lista vacia");
		}
	}
	public static void incrementoPrecio(ArrayList<Producto> losProducto) {
			if(losProducto.size()!=-1) {
				for(Producto ea: losProducto){
					ea.setPrecio( ea.getPrecio() + 100.25);
				}
			}else {
				System.out.println("No hay productos");
			}
	}
	public static void sumaDePrecios(ArrayList<Producto> losProductos) {
		double suma=0;
		if(losProductos.size()!=-1) {
			for(Producto ae: losProductos) {
				suma = suma + ae.getPrecio();
			}
			System.out.println("Suma total de los precios de los producto es: " +suma);
		}else {
			System.out.println("No hay productos");
		}
	}
	//Metodo para que verifique que no se agreguen productos repetidos
	public static boolean verificar(ArrayList<Producto> losProductos , int codigo) {
		boolean bandera=false;
		for(int i=0 ; i < losProductos.size();i++) {
			if(losProductos.get(i).getCodigo()==codigo) {
				bandera=true;
			}
		}
		return bandera;
	}
}
