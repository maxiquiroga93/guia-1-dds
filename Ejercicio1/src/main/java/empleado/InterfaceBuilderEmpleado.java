package empleado;

public abstract interface InterfaceBuilderEmpleado {
	
	public abstract InterfaceBuilderEmpleado inicializarCantHoras(int horas);
	public abstract InterfaceBuilderEmpleado inicializarSalarioFamiliar(int salarioFamiliar);
	public abstract Empleado obtenerEmpleado();

}
