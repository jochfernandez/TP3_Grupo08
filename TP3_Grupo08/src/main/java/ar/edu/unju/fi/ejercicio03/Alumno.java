package ar.edu.unju.fi.ejercicio03;

public class Alumno {
		private String nombre;
		private String apellido;
		private String LU;
		private double notas[] = new double [5];
		
		public Alumno(String nombre, String apellido, String LU, double[] notas) {
			super();
			this.nombre = nombre;
			this.apellido = apellido;
			this.LU = LU;
			this.notas = notas;
		}

		public double calcularPromedio(double [] arreglo) {
			double suma=0;
			int i;
			for(i = 0; i < arreglo.length; i++) {
				suma=suma+arreglo[i];
			}return suma/i;
		}
		
		public double calcularNotaMaxima(double [] arreglo) {
			double max=0;
			for(int i=0; i<arreglo.length;i++) {
				if (arreglo[i] > max) {
					max = arreglo[i];
				}
			}return max;
		}
		
		public Alumno() {
			// TODO Auto-generated constructor stub
		}
		
		public double[] getNotas() {
			return notas;
		}

		public void setNotas(double[] notas) {
			this.notas = notas;
		}

		public String getLU() {
			return LU;
		}

		public void setLU(String lU) {
			LU = lU;
		}

		@Override
		public String toString() {
			return "\nNombre: " + nombre +", Apellido: " + apellido +", LU: " + LU +
			", Promedio de notas: "+calcularPromedio(notas)+", Nota maxima: "+calcularNotaMaxima(notas);
		}
}
