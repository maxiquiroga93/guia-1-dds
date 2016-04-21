package empleado;

public class TemporalBuilder implements InterfaceBuilderEmpleado {
	private Temporal empleado;
	
	public TemporalBuilder(){
		empleado = new Temporal();
	}	

	@Override
	public TemporalBuilder inicializarCantHoras(int horas) {
		empleado.cantidadHoras=horas;
		return this;
	}

	@Override
	public TemporalBuilder inicializarSalarioFamiliar(int salarioFamiliar) {
		empleado.salarioFamiliar=salarioFamiliar;
		return this;
	}
	
	public Temporal obtenerEmpleado(){
		return this.empleado;
	}

}
