package ar.com.edu.unlam;
import java.text.SimpleDateFormat;
public abstract class Empleado {
	
	
	//atributos
	
	private String nombre;
	private Double salario;
	private SimpleDateFormat fechaDeNacimiento;
	
	
	//constructor
	
	
public Empleado(String nombre,Double salario,SimpleDateFormat fechaDeNacimiento)
{
	  this.nombre=nombre;
	  this.salario=salario;
	  this.fechaDeNacimiento=fechaDeNacimiento;


}

//metodos abstractos
public abstract void brindarDetalle();


	//getter and setters
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	public SimpleDateFormat getfechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	public void setfechaDeNacimiento(SimpleDateFormat fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	

	

}
