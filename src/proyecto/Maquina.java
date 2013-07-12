package proyecto;

import java.util.Calendar;
import java.util.HashSet;


//<MODEL>
public class Maquina {
	private String nombre;
	private int numBatch;
	private int cantidad;
	private Producto producto;
	private boolean enUso;
	private Calendar inicio;
	
	private HashSet<Maquina> siguientes;

	public Maquina(String nombre, int numBatch, int cantidad,
			Producto producto, boolean enUso, Calendar inicio,
			HashSet<Maquina> siguientes) {
		this.nombre = nombre;
		this.numBatch = numBatch;
		this.cantidad = cantidad;
		this.producto = producto;
		this.enUso = enUso;
		this.inicio = inicio;
		this.siguientes = siguientes;
	}

	public String getNombre() {
		return nombre;
	}

	public int getNumBatch() {
		return numBatch;
	}

	public int getCantidad() {
		return cantidad;
	}

	public Producto getProducto() {
		return producto;
	}

	public boolean estaEnUso() {
		return enUso;
	}

	public Calendar getInicio() {
		return inicio;
	}

	public HashSet<Maquina> getSiguientes() {
		return siguientes;
	}

}