package empleado;

public class Temporal extends Empleado {
	
	public Temporal(){
		cantidadHoras=0;
		salarioFamiliar=0;
	}

	@Override
	protected int monetizarHoras() {
		return cantidadHoras*20;
	}

	@Override
	protected int calcularBono() {
		return 0;
	}

	@Override
	protected int obtenerObraSocial() {
		return 0;
	}

	@Override
	public void pasarMes() {
		cantidadHoras = 0;
	}

	@Override
	protected int obtenerSalarioFamiliar() {
		return salarioFamiliar;
	}

}
