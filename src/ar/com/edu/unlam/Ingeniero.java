package ar.com.edu.unlam;

import java.text.SimpleDateFormat;

public class Ingeniero extends Empleado {

	public Ingeniero(String nombre,Double salario,SimpleDateFormat fechaDeNacimiento) {
		super(nombre,salario,fechaDeNacimiento);
	
	}

	@Override
	public void brindarDetalle() {
		
		System.out.println("nombre:"+getNombre());	
		System.out.println("salario:"+getSalario());
		System.out.println("fecha de nacimiento:"+getfechaDeNacimiento());

		
	}

}
