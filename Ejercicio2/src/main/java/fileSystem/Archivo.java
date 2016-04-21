package fileSystem;

public class Archivo extends SistemaArchivos {
	int tamanio;
	String texto;
	
	public Archivo(){
		tamanio=0;
	}

	@Override
	public int tamanio() {
		return tamanio;
	}
	
	public void escribir(){
		texto = System.console().readLine();
		tamanio = tamanio + texto.length();
	}
	
	public void leer(){
		System.out.println(texto);
	}

}
