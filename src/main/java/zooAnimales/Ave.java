package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Ave extends Animal {
	//private	Ave[] listado;
	private static ArrayList<Ave> listado = new ArrayList<Ave>();
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;
	
	public Ave(String nombre,int edad,String habitat,String genero,String colorPlumas) {
		//super(nombre,edad,habitat,genero);
		super.nombre =nombre;
		super.edad =edad;
		super.habitat =habitat;
		super.genero =genero;
		this.colorPlumas = colorPlumas;
		super.totalAnimales++;
		listado.add(this);
	
		//int longitud_Array = listado.length;
		
		//listado[longitud_Array] = new Ave(nombre,edad,habitat,genero,colorPlumas); 
	
	}
	
	public Ave(){
		listado.add(this);
		
	}
	
	
	
	public String movimiento(){
		return "volar";
		
		
	}
	
	public static ArrayList<Ave> getAves() {
		return listado;
	}

	public String getColorPlumas() {
		return this.colorPlumas;
	}

	public static Animal crearHalcon(String nombre, int edad, String genero){
		halcones++;
		return new Ave(nombre, edad,"montanas", genero,"cafe glorioso");
		
		
	}

	
	public static Animal crearAguila(String nombre, int edad, String genero){
		aguilas++;
		return new Ave(nombre,edad,"montanas", genero,"blanco y amarillo");
		
		
	}
}