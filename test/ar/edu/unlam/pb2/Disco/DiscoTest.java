package ar.edu.unlam.pb2.Disco;

import static org.junit.Assert.*;

import org.junit.Test;

public class DiscoTest {

	Disco unDisco = new Disco(30.0,50.);
	
	@Test
	public void testGetRadioInterior() {
		Double actual = unDisco.getRadioInterior();
		Double esperado = 30.0;
		assertEquals(esperado, actual,0.0001);//el_tercer_termino_corresponde_a_la_tolerancia//
	}
	
	@Test
	public void testGetRadioExterior(){
		Double actual = unDisco.getRadioExterior();
		Double esperado = 50.0;
		assertEquals(esperado, actual,0.0001);
	}
	
	@Test
	public void testGetPerimetroInterior() {
		Double actual = unDisco.getPerimetroInterior();
		Double esperado = 30.0*2*3.141592;
		assertEquals(esperado, actual,0.0001);//el_tercer_termino_corresponde_a_la_tolerancia//
	}
	
	@Test
	public void testGetPerimetroExterior(){
		Double actual = unDisco.getPerimetroExterior();
		Double esperado = 50.0*2*3.141592;
		assertEquals(esperado,actual,0.0001);
	}
	@Test
	public void testSuperficieYSetters(){
		unDisco.setRadioInterior(20.0);
		unDisco.setRadioExterior(40.0);
		Double valorRadioInterior = unDisco.getRadioInterior();
		Double valorRadioExterior = unDisco.getRadioExterior();
		Double radioTotalCalculado = valorRadioInterior + valorRadioExterior;
		Double actual = 3.141592 * radioTotalCalculado * radioTotalCalculado;
		Double esperado = unDisco.getSuperficie();
		assertEquals(esperado, actual, 0.0001);
	}
	
}
