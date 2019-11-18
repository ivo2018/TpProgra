package TpProgra;

import java.util.ArrayList;
import java.util.List;

public class Vertice {
	private String nombre;
    private boolean visitado;
    private List<Vertice> vecinoLista;
    
    public Vertice(String nombre) {
    this.nombre = nombre;
    this.vecinoLista = new ArrayList<>();
    }
    public void agregaVecino(Vertice vertice) {
    	this.vecinoLista.add(vertice);
    	
    }
    		
    
    
    public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public boolean isVisitado() {
		return visitado;
	}



	public void setVisitado(boolean visitado) {
		this.visitado = visitado;
	}



	public List<Vertice> getVecinoLista() {
		return vecinoLista;
	}



	public void setVecinoLista(List<Vertice> vecinoLista) {
		this.vecinoLista = vecinoLista;
	}



	public String toString() {
    	return this.nombre;
    }
    
} 
