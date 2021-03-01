import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * @author Cristian
 */
class ProductoTest {
	Producto pro = new Producto();
	
	@Test
	void testComprobacionDeProductoDeNumerosReales() {
		double a = 2.5;
		double b = 2.5;
		double esperado = 6.25;
		double obtenido = pro.productoReales(a, b);
		assertEquals(esperado, obtenido, "El resultado de multiplicar 2.5 por 2.5 es 6.25");
	}
	
	@Test
	void testCuandoIntroducesUnCeroElResultadoEsCeroEnNumerosReales() {
		double a = 2.5;
		double b = 0;
		double esperado = 0;
		double obtenido = pro.productoReales(a, b);
		assertEquals(esperado, obtenido, "Un número multiplicado por 0 es 0");
	}
	
	@Test
	void testCuandoIntroducesUnNúmeroNegativoEnNumerosReales() {
		double a = 2.5;
		double b = -1.5;
		double esperado = -888;
		double obtenido = pro.productoReales(a, b);
		assertEquals(esperado, obtenido, "Si introduces un número negativo, daría error");
	}
	
	@Test
	void testComprobacionDeProductoDeNumerosEnteros() {
		int a = 2;
		int b = 2;
		double esperado = 4;
		double obtenido = pro.productoEnteros(a, b);
		assertEquals(esperado, obtenido, "El resultado de multiplicar 2 por 2 es 4");
	}
	
	@Test
	void testCuandoIntroducesUnCeroElResultadoEsCeroEnNumerosEnteros() {
		int a = 2;
		int b = 0;
		int esperado = 0;
		double obtenido = pro.productoEnteros(a, b);
		assertEquals(esperado, obtenido, "Un número multiplicado por 0 es 0");
	}
	
	@Test
	void testCuandoIntroducesUnNúmeroNegativoEnNumerosEnteros() {
		int a = 2;
		int b = -1;
		int esperado = -888;
		double obtenido = pro.productoEnteros(a, b);
		assertEquals(esperado, obtenido, "Si introduces un número negativo, daría error");
	}
	
	@Test
	void testComprobacionDeProductoDeTresNumerosReales() {
		double a = 2.5;
		double b = 2.5;
		double c = 2.6;
		double esperado = 16.25;
		double obtenido = pro.productoTresReales(a, b, c);
		assertEquals(esperado, obtenido, "El resultado de multiplicar 2.5 po 2.5 por 2.6 es 16.25");
	}
	
	@Test
	void testCuandoIntroducesUnCeroElResultadoEsCeroEnMultiplicacionTriple() {
		double a = 2.5;
		double b = 0;
		double c = 3;
		double esperado = 0;
		double obtenido = pro.productoTresReales(a, b, c);
		assertEquals(esperado, obtenido, "Un número multiplicado por 0 es 0");
	}
	
	@Test
	void testCuandoIntroducesUnNúmeroNegativoEnMultiplicacionTriple() {
		double a = 2.5;
		double b = -1.5;
		double c = 3.5;
		double esperado = -888;
		double obtenido = pro.productoTresReales(a, b, c);
		assertEquals(esperado, obtenido, "Si introduces un número negativo, daría error");
	}
	
	
	@Test
	void testComprobacionDePotenciaDeNumeros() {
		int a = 3;
		int b = 5;
		double esperado = 243;
		double obtenido = pro.potencia(a, b);
		assertEquals(esperado, obtenido, "El resultado de 3 elevado a 5 es 243");
	}
	
	@Test
	void testCuandoIntroducesUnCeroComoPrimerValorEnPotenciaElResultadoEsUno() {
		double a = 0;
		double b = 2;
		double esperado = 0;
		double obtenido = pro.potencia(a, b);
		assertEquals(esperado, obtenido, "Un valor 0 elevado a cualquier número el resultado es 0");
	}
	
	@Test
	void testCuandoIntroducesUnCeroComoSegundoValorEnPotenciaElResultadoEsUno() {
		double a = 2.5;
		double b = 0;
		double esperado = 1;
		double obtenido = pro.potencia(a, b);
		assertEquals(esperado, obtenido, "Un número elevado a 0 el resultado es 1");
	}
	
	@Test
	void testCuandoIntroducesUnNúmeroNegativoComoPrimerValorEnUnaPotenci() {
		double a = -2.5;
		double b = 2;
		double esperado = 6.25;
		double obtenido = pro.potencia(a, b);
		assertEquals(esperado, obtenido, "Si introduces un número negativo, el resultado es positivo");
	}
	
	@Test
	void testCuandoIntroducesUnNúmeroNegativoComoSegundoValorEnUnaPotencia() {
		double a = 2.5;
		double b = -2;
		double esperado = 0.16;
		double obtenido = pro.potencia(a, b);
		assertEquals(esperado, obtenido, "Si introduces un número negativo, el resultado es positivo");
	}
	
	@Test
	void testCuandoIntroducesNumerosDemasiadoGrandes() {
		double a = 1000;
		double b = 500;
		double esperado = Double.POSITIVE_INFINITY;
		double obtenido = pro.potencia(a, b);
		assertEquals(esperado, obtenido, "Si se usan números demasiado grandes el resultado es INFINITO");
	}
	
}

