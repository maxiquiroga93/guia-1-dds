package empleado;

public class PermanenteBuilder implements InterfaceBuilderEmpleado {
	private Permanente empleado;
	
	public PermanenteBuilder(){
		empleado = new Permanente();
	}

	@Override
	public  PermanenteBuilder inicializarCantHoras(int horas) {
		empleado.cantidadHoras=horas;
		return this;
	}

	@Override
	public PermanenteBuilder inicializarSalarioFamiliar(int salarioFamiliar) {
		empleado.salarioFamiliar=salarioFamiliar;
		return this;
	}
	
	public PermanenteBuilder inicializarAntiguedad(int antiguedad){
		empleado.antiguedad=antiguedad;
		return this;
	}
	
	public PermanenteBuilder inicializarDescuentoObraSocial(int descuento){
		empleado.descObraSocial = descuento;
		return this;
	}
	
	public Permanente obtenerEmpleado(){
		return this.empleado;
	}

}
