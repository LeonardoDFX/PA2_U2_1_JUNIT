package frgp.utn.edu.ar.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import frgp.utn.edu.ar.main.MatrizAdyacencia;

class MatrizAdyacenciaTest {
	
	private int Cantidad = 3;
	private MatrizAdyacencia matriz = new MatrizAdyacencia(Cantidad);
	
	/// Punto A: agregarElementoTest
	@Test
   	public void agregarElementoTest() {
        matriz.agregarElemento(1, 2); 
        assertTrue(matriz.existeElemento(1, 2)); 
    	}
	
	/// Punto B: agregarElementoSimetriaTest
	@Test
	public void agregarElementoSimetriaTest() {
	matriz.agregarElemento(1,0);
	assertTrue(matriz.existeElemento(0,1));
	}
	
	/// Punto C: eliminarElementoTest
	
	/// Punto D: eliminarElementoSimetricoTest
	
	/// Punto E: contarRelacionesTest
	
	/// Punto F: existenTodosLosElementoTest
	
	/// Punto G: agregarElementoFilaNegativaTest
	
	/// Punto H: agregarElementoColumnaNegativaTest
	
	/// Punto I: agregarElementoFueraRangoTest
	
}
