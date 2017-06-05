package ar.com.edu.unlam;

public  class ServicioImpuesto {
	
	
//metodo
	
	public Double obtenerImpuesto(Empleado empleado)
	{
	
	Double impuesto = 0.0;
	
	if(empleado.getSalario()>5000.0 && empleado.getSalario()<10000.0 )
	{
		impuesto=500.0;
		}
	
	if(empleado.getSalario()>10000.0 && empleado.getSalario()<20000.0 )
	{
		impuesto=1000.0;
		}
	
	if(empleado.getSalario()>20000.0 && empleado.getSalario()<30000.0 )
	{
		impuesto=1500.0;
		}

		return impuesto;
	}
}
