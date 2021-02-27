import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CocienteTest {
	Cociente c1= new Cociente ();
	@Test 
	void Comprobaci�nFuncionamientoCorrectoDeLaDivisi�nEnNumerosReales() {
		c1.setReal1(15.2);
		c1.setReal2(2.0);
		double esperado = 7.6;
		double obtenido= c1.divisionReales();
		assertEquals(esperado, obtenido,"La divisi�n de 15,2/2.0");
		
	}
	@Test 
	void TestDeComprobaci�nDeUnN�meroDivididoPorCeroEnNumerosReales() {
		c1.setReal1(15.2);
		c1.setReal2(0.00);
		double esperado = Double.POSITIVE_INFINITY;
		double obtenido= c1.divisionReales();
		assertEquals(esperado, obtenido,"La divisi�n de un numero dividido por cero da infinito");
		
	}
	@Test 
	void TestDeComprobaci�nDeCeroDivididoPorUnN�meroEnNumerosReales() {
		c1.setReal1(0.0);
		c1.setReal2(15.2);
		double esperado = 0.0;
		double obtenido= c1.divisionReales();
		assertEquals(esperado, obtenido,"La divisi�n de cero dividido por un n�mero es cero.");
		
	}
	@Test 
	void TestDeComprobaci�nAlgunoDeLosValoresEsNegativoEnNumerosReales() {
		c1.setReal1(-5.0);
		c1.setReal2(15.2);
		double esperado = -888;
		double obtenido= c1.divisionReales();
		assertEquals(esperado, obtenido,"La divisi�n de un numero negativo dar� -888");
		
	}
	
	@Test 
	void Comprobaci�nFuncionamientoCorrectoDeLaDivisi�nEnNumerosEnteros() {
		c1.setNum1(14);
		c1.setNum2(2);
		int esperado = 7;
		double obtenido= c1.divisionEnteros();
		assertEquals(esperado, obtenido,"La divisi�n de 14/2 debe dar 7");
		
	}
	
	
	@Test 
	void TestDeComprobaci�nDeUnN�meroDivididoPorCeroEnNumerosEnteros() {
		c1.setNum1(15);
		c1.setNum2(0);
		int esperado = -888;
		double obtenido= c1.divisionEnteros();
		assertEquals(esperado, obtenido,"La divisi�n de un numero dividido por cero da infinito");
		
	}
	@Test 
	void TestDeComprobaci�nDeCeroDivididoPorUnN�meroEnN�merosEnteros() {
		c1.setNum1(0);
		c1.setNum2(15);
		int esperado = 0;
		double obtenido= c1.divisionEnteros();
		assertEquals(esperado, obtenido,"La divisi�n de un n�mero cero por un numero da cero");
		
	}
	
	@Test 
	void TestDeComprobaci�nSiAlgunoDeLosN�merosEsNegativoEnN�merosEnteros() {
		c1.setNum1(14);
		c1.setNum2(-2);
		int esperado = -888;
		double obtenido= c1.divisionEnteros();
		assertEquals(esperado, obtenido,"Una divisi�n con n�meros negativos da -888");
		
	}
	
	@Test 
	void Comprobaci�nFuncionamientoCorrectoInverso() {
		c1.setReal1(5);
		double esperado = 0.2;
		double obtenido= c1.inverso();
		assertEquals(esperado, obtenido,"La divisi�n 1/5 = 0.2");
		
	}
	
	@Test 
	void Comprobaci�nDelInversoDeCeroEnInverso() {
		c1.setReal1(0);
		double esperado = -888;
		double obtenido= c1.inverso();
		assertEquals(esperado, obtenido,"El inverso de cero da -888");
		
	}
	@Test 
	void Comprobaci�nSiElReal1EsNegativoDaCeroEnInverso() {
		c1.setReal1(-2);
		double esperado = -888;
		double obtenido= c1.inverso();
		assertEquals(esperado, obtenido,"El inverso de un n�mero negativo da -888");
		
	}
	
	
	@Test 
	void Comprobaci�nFuncionamientoCorrectoRa�z() {
		c1.setNum1(25);
		double esperado = 5;
		double obtenido= c1.raiz();
		assertEquals(esperado, obtenido,"La ra�z cuadrada de 25 es 5");
		
	}
	

	@Test 
	void Comprobaci�nRa�zCuadradaDeCeroRa�z() {
		c1.setNum1(0);
		double esperado = 0;
		double obtenido= c1.raiz();
		assertEquals(esperado, obtenido,"La ra�z cero es cero");
		
	}
	

	@Test 
	void Comprobaci�nRa�zCuadradaDeUnN�meroNegativoNoExisteRa�z() {
		c1.setNum1(-10);
		double esperado = -888;
		double obtenido= c1.raiz();
		assertEquals(esperado, obtenido,"La ra�z cuadrada de -10 da -888");
		
	}
	
	
	
	
	
	
	
	
}
