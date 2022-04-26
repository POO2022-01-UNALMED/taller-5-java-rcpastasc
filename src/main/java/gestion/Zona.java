package gestion;

import java.util.ArrayList;

import gestion.Zoologico;
import zooAnimales.*;

public class Zona {
	private String nombre;
	//private Zoologico zoo[];
	private ArrayList<Zoologico> zoo = new ArrayList<Zoologico>();
	//private Animal animales[];
	private ArrayList<Animal> animales = new ArrayList<Animal>();
	
	//constructor
	public Zona(String nombre,Zoologico zoo) {
		this.nombre = nombre;
		//this.zoo[0] = zoo;
		this.zoo.add(zoo);
	}
	
	
	public Zona(){
		
	}
	
	public ArrayList<Animal> getAnimales() {
		return animales;
	}
	
	
	public int cantidadAnimales(){
		
		return animales.size();	
		
	}
	
	
	public void agregarAnimales(Animal a) {
		animales.add(a);
	}
	


	

	public String getNombre() {
		return this.nombre;
	}
	
	public Zoologico getZoo() {
		return this.zoo.get(0);
		
	}

}