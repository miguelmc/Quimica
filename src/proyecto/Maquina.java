package proyecto;

import java.util.ArrayList;
import java.util.Calendar;

import javax.swing.JButton;

import org.joda.time.Instant;


//<MODEL>
public class Maquina {
	private String nombre;
	private int numBatch;
	private int cantidad;
	private String producto;
	private String tipo;
	private boolean enUso;
	private Calendar inicio;
	private javax.swing.JButton button;
	//productos que pasan por esta maquina
	private ArrayList<String> productos;
	
	private Instant instant;
	
	public Maquina(String nombre, ArrayList<String> productos) {
		this.nombre = nombre;
		this.enUso = false;
		this.productos = productos;
		button = new JButton();
	}

	
	public void clear() {
		numBatch = 0;
		cantidad = 0;
		producto = "";
		tipo = "";
		enUso = false;
	}
	
	public void setAll(int numBatch, int cantidad, String producto, String tipo) {

		this.numBatch = numBatch;
		this.cantidad = cantidad;
		this.producto = producto;
		this.tipo = tipo;
		inicio = Calendar.getInstance();
		enUso = true;
		
		instant = new Instant();
	}
	
	//SETTERS
	public void setNumBatch(int numBatch) {
		this.numBatch = numBatch;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public void setProducto(String producto) {
		this.producto = producto;
		this.tipo = "";
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setProducto(String producto, String tipo) {
		this.producto = producto;
		this.tipo = tipo;
	}

	public void setEnUso(boolean enUso) {
		this.enUso = enUso;
	}
	
	public void setInicio() {
		inicio = Calendar.getInstance();
	}

	public Instant getInstant() {
		return instant;
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

	public String getProducto() {
		return producto;
	}
	
	public  ArrayList<String> getProductos() {
		return productos;
	}

	public boolean estaEnUso() {
		return enUso;
	}

	public Calendar getInicio() {
		return inicio;
	}


	public javax.swing.JButton getButton() {
		return button;
	}


	

}