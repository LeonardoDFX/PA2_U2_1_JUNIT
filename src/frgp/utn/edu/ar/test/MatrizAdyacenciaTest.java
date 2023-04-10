package frgp.utn.edu.ar.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import frgp.utn.edu.ar.main.MatrizAdyacencia;

class MatrizAdyacenciaTest {
	
	/// Punto A: agregarElementoTest
	@Test
    public void agregarElementoTest() {
        MatrizAdyacencia matriz = new MatrizAdyacencia(3); 
        matriz.agregarElemento(1, 2); 
        assertTrue(matriz.existeElemento(1, 2)); 
    }
	
	/// Punto B: agregarElementoSimetriaTest
	
	/// Punto C: eliminarElementoTest
	
	/// Punto D: eliminarElementoSimetricoTest
	
	/// Punto E: contarRelacionesTest
	
	/// Punto F: existenTodosLosElementoTest
	
	/// Punto G: agregarElementoFilaNegativaTest
	
	/// Punto H: agregarElementoColumnaNegativaTest
	
	/// Punto I: agregarElementoFueraRangoTest
	
}
