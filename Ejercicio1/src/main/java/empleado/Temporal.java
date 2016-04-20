package empleado;

public class Temporal extends Empleado {

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

}
