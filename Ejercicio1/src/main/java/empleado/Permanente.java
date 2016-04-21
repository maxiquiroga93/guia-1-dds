package empleado;

public class Permanente extends Empleado {
	protected int antiguedad;
	protected int descObraSocial;
	
	public Permanente(){
		cantidadHoras=0;
		salarioFamiliar=0;
		antiguedad=0;
		descObraSocial=0;
	}
	
	//Aca quise hacer que los metodos sean privados, como muestra el ejemplo del apunte
	//pero me dice que no se muede modificar la visibilidad.
	@Override
	protected int monetizarHoras() {
		return cantidadHoras*30;
	}
	
	@Override
	protected int calcularBono() {
		return antiguedad*100; //Valor al azar, no especifica el enunciado
	}

	@Override
	protected int obtenerObraSocial() {
		return descObraSocial;
	}

	@Override
	public void pasarMes() {
		cantidadHoras = 0;
		antiguedad = antiguedad + 1/12;
	}
	@Override
	protected int obtenerSalarioFamiliar() {
		return salarioFamiliar;
	}

}
