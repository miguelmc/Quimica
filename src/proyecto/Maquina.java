package proyecto;

import java.util.Calendar;
import java.util.HashSet;

import javax.swing.JButton;


//<MODEL>
public class Maquina {
	private String nombre;
	private int numBatch;
	private int cantidad;
	private String producto;
	private boolean enUso;
	private Calendar inicio;
	private javax.swing.JButton button;
	
	public Maquina(String nombre) {
		this.nombre = nombre;
		this.enUso = false;
		button = new JButton();
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
	}

	public void setEnUso(boolean enUso) {
		this.enUso = enUso;
	}
	
	public void setInicio() {
		inicio = Calendar.getInstance();
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