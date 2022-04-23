package ar.edu.unju.fi.ejercicio09;

public class Producto {
	private int codigo;
	private String descripcion;
	private double precio;
	private String marca;
	
	public Producto() {
		// TODO Auto-generated constructor stub
	}

	public Producto(int codigo, String descripcion, double precio, String marca) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.precio = precio;
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", descripcion=" + descripcion + ", precio=" + precio + ", marca=" + marca
				+ "]";
	}

	public double getPrecio() {
		return precio;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
}
