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

	public Maquina(String nombre) {
		this.nombre = nombre;
		this.enUso = false;
	}

	
	//SETTERS
	public void setNumBatch(int numBatch) {
		this.numBatch = numBatch;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public void setInicio(Calendar inicio) {
		this.inicio = inicio;
	}

	
	//GETTERS
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

}