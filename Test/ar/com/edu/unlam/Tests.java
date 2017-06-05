package ar.com.edu.unlam;

import static org.junit.Assert.*;


import java.text.SimpleDateFormat;

import org.junit.Test;

public class Tests {
	
	@Test
	public void testImpuestoaEmpleado1() {
	
	ServicioImpuesto impSvc = new ServicioImpuesto();
	Gerente miGerente= new Gerente("juan", 12000.0, new SimpleDateFormat("10/05/1991"),"seis","ventas" );
	Double impuesto = impSvc.obtenerImpuesto(miGerente);
	
	
	miGerente.brindarDetalle();
	assertEquals(1000.0, impuesto, 0.1);
	System.out.println("impuesto:"+impuesto);
	}
	
	
	@Test
	public void testImpuestoaEmpleado2() {
	
	ServicioImpuesto impSvc = new ServicioImpuesto();
	Jefe miJefe= new Jefe("pepe", 25000.0, new SimpleDateFormat("12/05/1990"),"uno",2000.0);
	Double impuesto = impSvc.obtenerImpuesto(miJefe);
	
	miJefe.brindarDetalle();
	assertEquals(1500.0, impuesto, 0.1);
	System.out.println("impuesto:"+impuesto);
	
	}
	
	@Test
	public void testImpuestoaEmpleado3() {
	
	ServicioImpuesto impSvc = new ServicioImpuesto();
	Ingeniero miIngeniero= new Ingeniero("carlos", 18000.0, new SimpleDateFormat("1/05/1991"));
	Double impuesto = impSvc.obtenerImpuesto(miIngeniero);
	
	miIngeniero.brindarDetalle();
	assertEquals(1000.0, impuesto, 0.1);
	System.out.println("impuesto:"+impuesto);
	
	}
	
	@Test
	public void testImpuestoaEmpleado4() {
	
	ServicioImpuesto impSvc = new ServicioImpuesto();
	Secretaria miSecretaria= new Secretaria("ana", 8000.0, new SimpleDateFormat("1/06/1992"));
	Double impuesto = impSvc.obtenerImpuesto(miSecretaria);
	
	miSecretaria.brindarDetalle();
	assertEquals(500.0, impuesto, 0.1);
	System.out.println("impuesto:"+impuesto);
	}
}

