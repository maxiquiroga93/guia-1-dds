package empleado;

public abstract class Empleado {
	protected int cantidadHoras;
	
	protected int salarioFamiliar;
	
	//Uso un Template method para la creacion de las subclases empleados
	//donde voy a redefinir los métodos dependiendo de los requisitos pedidos.
	//Tambien modifico el patrón y agrego 2 atributos comunes a las 2 clases
	//de empleados.
	
	public int calcularSueldo(){
		int sueldo = monetizarHoras() + calcularBono() + obtenerSalarioFamiliar() - obtenerObraSocial();
		return sueldo;
	}
	
	protected abstract int monetizarHoras();
	
	protected abstract int calcularBono();
	
	protected int obtenerSalarioFamiliar(){
		return salarioFamiliar;
	}
	
	protected abstract int obtenerObraSocial();
	
	public void sumarHoras(int horas){
		cantidadHoras = cantidadHoras + horas;
	}
	
	public abstract void pasarMes();
	
	

}
