package empleado;

public class Permanente extends Empleado {
	private int antiguedad;
	private int descObraSocial;
	
	public Permanente(int nuevaAntiguedad, int descuentoOS){
		cantidadHoras = 0;
		antiguedad=nuevaAntiguedad;
		descObraSocial = descuentoOS;
		
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

}
