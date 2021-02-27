import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CocienteTest {
	Cociente c1= new Cociente ();
	@Test 
	void ComprobaciónFuncionamientoCorrectoDeLaDivisiónEnNumerosReales() {
		c1.setReal1(15.2);
		c1.setReal2(2.0);
		double esperado = 7.6;
		double obtenido= c1.divisionReales();
		assertEquals(esperado, obtenido,"La división de 15,2/2.0");
		
	}
	@Test 
	void TestDeComprobaciónDeUnNúmeroDivididoPorCeroEnNumerosReales() {
		c1.setReal1(15.2);
		c1.setReal2(0.00);
		double esperado = Double.POSITIVE_INFINITY;
		double obtenido= c1.divisionReales();
		assertEquals(esperado, obtenido,"La división de un numero dividido por cero da infinito");
		
	}
	@Test 
	void TestDeComprobaciónDeCeroDivididoPorUnNúmeroEnNumerosReales() {
		c1.setReal1(0.0);
		c1.setReal2(15.2);
		double esperado = 0.0;
		double obtenido= c1.divisionReales();
		assertEquals(esperado, obtenido,"La división de cero dividido por un número es cero.");
		
	}
	@Test 
	void TestDeComprobaciónAlgunoDeLosValoresEsNegativoEnNumerosReales() {
		c1.setReal1(-5.0);
		c1.setReal2(15.2);
		double esperado = -888;
		double obtenido= c1.divisionReales();
		assertEquals(esperado, obtenido,"La división de un numero negativo dará -888");
		
	}
	
	@Test 
	void ComprobaciónFuncionamientoCorrectoDeLaDivisiónEnNumerosEnteros() {
		c1.setNum1(14);
		c1.setNum2(2);
		int esperado = 7;
		double obtenido= c1.divisionEnteros();
		assertEquals(esperado, obtenido,"La división de 14/2 debe dar 7");
		
	}
	
	
	@Test 
	void TestDeComprobaciónDeUnNúmeroDivididoPorCeroEnNumerosEnteros() {
		c1.setNum1(15);
		c1.setNum2(0);
		int esperado = -888;
		double obtenido= c1.divisionEnteros();
		assertEquals(esperado, obtenido,"La división de un numero dividido por cero da infinito");
		
	}
	@Test 
	void TestDeComprobaciónDeCeroDivididoPorUnNúmeroEnNúmerosEnteros() {
		c1.setNum1(0);
		c1.setNum2(15);
		int esperado = 0;
		double obtenido= c1.divisionEnteros();
		assertEquals(esperado, obtenido,"La división de un número cero por un numero da cero");
		
	}
	
	@Test 
	void TestDeComprobaciónSiAlgunoDeLosNúmerosEsNegativoEnNúmerosEnteros() {
		c1.setNum1(14);
		c1.setNum2(-2);
		int esperado = -888;
		double obtenido= c1.divisionEnteros();
		assertEquals(esperado, obtenido,"Una división con números negativos da -888");
		
	}
	
	@Test 
	void ComprobaciónFuncionamientoCorrectoInverso() {
		c1.setReal1(5);
		double esperado = 0.2;
		double obtenido= c1.inverso();
		assertEquals(esperado, obtenido,"La división 1/5 = 0.2");
		
	}
	
	@Test 
	void ComprobaciónDelInversoDeCeroEnInverso() {
		c1.setReal1(0);
		double esperado = -888;
		double obtenido= c1.inverso();
		assertEquals(esperado, obtenido,"El inverso de cero da -888");
		
	}
	@Test 
	void ComprobaciónSiElReal1EsNegativoDaCeroEnInverso() {
		c1.setReal1(-2);
		double esperado = -888;
		double obtenido= c1.inverso();
		assertEquals(esperado, obtenido,"El inverso de un número negativo da -888");
		
	}
	
	
	@Test 
	void ComprobaciónFuncionamientoCorrectoRaíz() {
		c1.setNum1(25);
		double esperado = 5;
		double obtenido= c1.raiz();
		assertEquals(esperado, obtenido,"La raíz cuadrada de 25 es 5");
		
	}
	

	@Test 
	void ComprobaciónRaízCuadradaDeCeroRaíz() {
		c1.setNum1(0);
		double esperado = 0;
		double obtenido= c1.raiz();
		assertEquals(esperado, obtenido,"La raíz cero es cero");
		
	}
	

	@Test 
	void ComprobaciónRaízCuadradaDeUnNúmeroNegativoNoExisteRaíz() {
		c1.setNum1(-10);
		double esperado = -888;
		double obtenido= c1.raiz();
		assertEquals(esperado, obtenido,"La raíz cuadrada de -10 da -888");
		
	}
	
	
	
	
	
	
	
	
}
