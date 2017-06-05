package ar.com.edu.unlam;


import java.text.SimpleDateFormat;

public class Gerente extends Empleado{
	
	
//atributos
	
	private String cochera;
	private String departamento;
	
	//constructor
	
	public Gerente(String nombre, Double salario, SimpleDateFormat fechaDeNacimiento, String cochera, String departamento )

	{
		//super (nombre);
		super(nombre, salario, fechaDeNacimiento);
		this.cochera=cochera;
		this.departamento=departamento;
//		super.setFechaDeNacimiento(FechaDeNacimiento);
//		this.salario=salario;
//		
		}
	

	//getter and setters
	
	
	public String getCochera() {
		return cochera;
	}
	public void setCochera(String cochera) {
		this.cochera = cochera;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}


	@Override
	public void brindarDetalle() {
		
System.out.println("nombre:"+getNombre());	
System.out.println("salario:"+getSalario());
System.out.println("fecha de nacimiento:"+getfechaDeNacimiento());
System.out.println("cochera:"+getCochera());
System.out.println("deparatamento:"+getDepartamento());
	
	}

}
