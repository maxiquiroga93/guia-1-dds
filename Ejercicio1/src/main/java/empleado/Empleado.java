package empleado;

public abstract class Empleado {
	protected int cantidadHoras;
	protected int salarioFamiliar;

	
	//Uso un Template method para el calculo de sueldo, defino operaciones abstractas
	//que las subclases tienen que implementar y el template method calcularSueldo()
	//que calcula el sueldo de manera "generica" para todos los empleados.
	
	public int calcularSueldo(){
		int sueldo = monetizarHoras() + calcularBono() + obtenerSalarioFamiliar() - obtenerObraSocial();
		return sueldo;
	}
	
	protected abstract int monetizarHoras();
	
	protected abstract int calcularBono();
	
	protected abstract int obtenerSalarioFamiliar();
	
	protected abstract int obtenerObraSocial();
	
	public void sumarHoras(int horas){
		cantidadHoras = cantidadHoras + horas;
	}
	
	public abstract void pasarMes();
	//metodo para reiniciar las horas de trabajo y actualizar la antiguedad
	//en el caso de los empleados de planta permanente
	
	

}
