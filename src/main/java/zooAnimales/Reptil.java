package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Reptil extends Animal  {
	private static ArrayList<Reptil> listado = new ArrayList<Reptil>();
	//private Reptil listado[];
	public static int iguanas;
	public static int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	
	
	public Reptil(String nombre,int edad,String habitat,String genero, String colorEscamas, int largoCola) {
		//super(nombre,edad,habitat,genero);
		super.nombre =nombre;
		super.edad =edad;
		super.habitat =habitat;
		super.genero =genero;
		this.listado = listado;
		this.iguanas = iguanas;
		this.serpientes = serpientes;
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
		super.totalAnimales++;
		listado.add(this);
		
		//int longitud_Array = listado.length;
		//listado[longitud_Array] = new Reptil(nombre,edad,habitat,genero,colorEscamas,largoCola); 
		
	}

	public Reptil(){
		listado.add(this);
		
	}
	
	
	
	
	public static ArrayList<Reptil> getReptiles() {
		return listado;
	}
	
	
	public String movimiento(){
		return "reptar";
		
		
	}

	public String getColorEscamas() {
		return this.colorEscamas;
	}

	public int getLargoCola() {
		return this.largoCola;
	}


	public static Animal crearIguana(String nombre, int edad, String genero){
		iguanas++;
		return new Reptil(nombre,edad,"humedal",genero,"verde",3);
		
		
	}
	
	public static Animal crearSerpiente(String nombre, int edad, String genero){
		serpientes++;
		return new Reptil(nombre,edad,"jungla",genero,"blanco",1);
		
		
	}
	

	

}