package fileSystem;

import java.util.ArrayList;
import java.util.Iterator;

public class Carpeta extends SistemaArchivos {
	public ArrayList<SistemaArchivos> contenidoTotal;
	
	public Carpeta(){
		contenidoTotal = new ArrayList<SistemaArchivos>();
	}
	
	@Override
	public int tamanio() {
		int tamanio=0;
		
		Iterator<SistemaArchivos> i = contenidoTotal.iterator();
		
		while(i.hasNext()){
			SistemaArchivos contenido = i.next();
			tamanio = tamanio + contenido.tamanio();
		}
		
		return tamanio;
	}
	
	public void agregarContenido(SistemaArchivos contenido){
		contenidoTotal.add(contenido);
	}

}
