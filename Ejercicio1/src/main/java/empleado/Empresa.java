package empleado;

import java.io.IOException;
import java.util.ArrayList;

public class Empresa {
	private ArrayList<Empleado> ListaEmpleados = new ArrayList<Empleado>();
	//Esta clase esta hecha a modo de ejemplo de un Director para el Builder
	public void contratarEmpleado() throws IOException{
		int antiguedad,horas,salarioFamiliar,descuentoObraSocial;
		
		System.out.println("Ingrese el tipo de empleado (Permanente o Temporal): ");
		String tipo = System.console().readLine();
		if(tipo == "Permanente"){
			PermanenteBuilder builder = new PermanenteBuilder();
			antiguedad = System.in.read();
			builder.inicializarAntiguedad(antiguedad);
			horas = System.in.read();
			builder.inicializarCantHoras(horas);
			descuentoObraSocial=System.in.read();
			builder.inicializarDescuentoObraSocial(descuentoObraSocial);
			salarioFamiliar = System.in.read();
			builder.inicializarSalarioFamiliar(salarioFamiliar);
			
			Permanente empleado = builder.obtenerEmpleado();
			ListaEmpleados.add(empleado);
		}else{
			TemporalBuilder builder = new TemporalBuilder();
			horas = System.in.read();
			builder.inicializarCantHoras(horas);
			salarioFamiliar = System.in.read();
			builder.inicializarSalarioFamiliar(salarioFamiliar);
			
			Temporal empleado = builder.obtenerEmpleado();
			ListaEmpleados.add(empleado);
		}
	}
}
