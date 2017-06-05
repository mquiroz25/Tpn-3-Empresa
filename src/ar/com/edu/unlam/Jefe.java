package ar.com.edu.unlam;

import java.text.SimpleDateFormat;

public class Jefe extends Empleado {
	
	//atributos
	
		private String cochera;
		private Double salarioExtra;
		
		//constructor
		
		public Jefe(String nombre,Double salario, SimpleDateFormat fechaDeNacimiento, String cochera, Double salarioExtra )

		{
			//super (nombre);
			super( nombre, salario, fechaDeNacimiento);
			this.cochera=cochera;
			this.salarioExtra=salarioExtra;
//			super.setFechaDeNacimiento(FechaDeNacimiento);
//			this.salario=salario;
//			
			}
		
		
		//getter and setters
		
		public String getCochera() {
			return cochera;
		}
		public void setCochera(String cochera) {
			this.cochera = cochera;
		}
		public Double getSalarioExtra() {
			return salarioExtra;
		}
		public void setSalarioExtra(Double salarioExtra) {
			this.salarioExtra = salarioExtra;
		}


		@Override
		public void brindarDetalle() {
			
			System.out.println("nombre:"+getNombre());	
			System.out.println("salario:"+getSalario());
			System.out.println("fecha de nacimiento:"+getfechaDeNacimiento());
			System.out.println("cochera:"+getCochera());
			System.out.println("salario extra:"+getSalarioExtra());
		}
		
		

}
