package proyecto;

import java.awt.Color;
import java.util.HashMap;

public class Colores {
	
	private static HashMap<String, Color> colores;
	
	static{
		colores = new HashMap<String, Color>();
		colores.put("Paquete lubricante", Color.LIGHT_GRAY);
		colores.put("Estearato de calcio", Color.YELLOW);
		colores.put("Estearato de zinc", Color.RED);
		colores.put("Estearato de magnesio", Color.MAGENTA);
		colores.put("Estearato de sodio", Color.CYAN);
	
	}
	public static Color getColor(String color){
		return colores.get(color);
	}
}
