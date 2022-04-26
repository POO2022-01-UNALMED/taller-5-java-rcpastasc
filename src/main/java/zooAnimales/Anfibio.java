package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Anfibio extends Animal {
	//private Anfibio[] listado;
	private static ArrayList<Anfibio> listado = new ArrayList<Anfibio>();
	public static int ranas;
	public  static int salamandras;
	public String colorPiel;
	private boolean venenoso;
	
	
	public Anfibio(String nombre,int edad,String habitat,String genero,String colorPiel,boolean venenoso) {
		//super(nombre,edad,habitat,genero);
		super.nombre =nombre;
		super.edad =edad;
		super.habitat =habitat;
		super.genero =genero;
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
		super.totalAnimales++;
		
		listado.add(this);
	}
	
	
	public Anfibio(){
		listado.add(this);
		
		
	}
	
	
	
	public String movimiento(){
		return "saltar";
		
		
	}
	
	public static ArrayList<Anfibio> getAnfibios() {
		return listado;
	}


	public String getColorPiel() {
		return this.colorPiel;
	}


	public boolean isVenenoso() {
		return this.venenoso;
	}
	

	public static Animal crearRana(String nombre, int edad, String genero){
		ranas++;
		return new Anfibio(nombre,edad,"selva",genero,"rojo",true);
		
		
	}

	
	public static Animal crearSalamandra(String nombre, int edad, String genero){
		salamandras++;
		return new Anfibio(nombre,edad,"selva",genero,"negro",false);
		
		
	}


}

	
