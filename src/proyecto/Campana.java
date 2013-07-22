package proyecto;

import java.util.ArrayList;

import org.joda.time.Instant;

public class Campana {
	
	private int cantidad;
	private String producto;
	private Proceso proceso;
	private int total;
	private int gasto;
	private Instant instant;
	private ArrayList<Integer> cantEnPasos;
	
	public Campana(){
		cantidad = 0;
		producto = "";
		proceso = null;
	}
	
	public Campana(int cantidad, String producto) {
		this.cantidad = cantidad;
		this.producto = producto;
		total = 0;
		gasto = 0;
		proceso = null;
		instant = new Instant();
		cantEnPasos = new ArrayList<Integer>();
		for(int i=0; i<5; i++)
			cantEnPasos.add(0);
	}
	
	public Campana(Campana c) {
		//TODO: probably wrong
		cantidad = c.getCantidad();
		producto = c.getProducto();
		proceso = c.getProceso();
		total = c.getTotal();
		gasto = c.getGasto();
		instant = c.getInstant();
		cantEnPasos = new ArrayList<Integer>(c.getCantEnPasos());
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getGasto() {
		return gasto;
	}

	public void setGasto(int gasto) {
		this.gasto = gasto;
	}

	public Instant getInstant() {
		return instant;
	}

	public void setInstant(Instant instant) {
		this.instant = instant;
	}

	public ArrayList<Integer> getCantEnPasos() {
		return cantEnPasos;
	}

	public void setCantEnPasos(ArrayList<Integer> cantEnPasos) {
		this.cantEnPasos = cantEnPasos;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getProducto() {
		return producto;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}

	public Proceso getProceso() {
		return proceso;
	}

	public void setProceso(Proceso proceso) {
		this.proceso = proceso;
	}
	
	
}
