package ar.edu.unju.fi.ejercicio01;

public class Division {
	int res;
	public void div(int a, int b){
		boolean bandera=true;
		if(b==0) {
				bandera=false;
		}
		else {
				res=a/b;
				System.out.println("Rta "+res);		
		}
		if (bandera==false) {
			System.out.println("No puede realizar la division por cero");
		}
	}
}
