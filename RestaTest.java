import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RestaTest {
	
	Resta objeto = new Resta();

	@Test
	void testComprobacionRestaReales() {
		double a = 2.5;
		double b = 6.5;
		double esperado = -4;
		double obtenido = objeto.restaReales(a, b);
		assertEquals(esperado, obtenido, "Se espera obtener como resultado el valor -4");
	}
	
	@Test
	void testRealesCuandoElPrimerValorEsCero() {
		double a = 0;
		double b = 7.5;
		double esperado = -7.5;
		double obtenido = objeto.restaReales(a, b);
		assertEquals(esperado, obtenido, "Se espera obtener como resultado el valor -7.5");
	}
	
	@Test
	void testRealesCuandoElSegundoValorEsCero() {
		double a = 9.4;
		double b = 0;
		double esperado = 9.4;
		double obtenido = objeto.restaReales(a, b);
		assertEquals(esperado, obtenido, "Se espera obtener como resultado el valor 9.4");
	}
	
	@Test
	void testRealesCuandoUnoDeLosDosValoresEsNegativo() {
		double a = -10;
		double b = 3.65;
		double esperado = -888;
		double obtenido = objeto.restaReales(a, b);
		assertEquals(esperado, obtenido, "Se espera obtener como resultado el error -888");
	}
	
	///////////////////////////////////////////////////////////////////////////////////////
	
	@Test
	void testComprobacionRestaEnteros() {
		double d = 7;
		double e = 3;
		double esperado = 4;
		double obtenido = objeto.restaReales(d, e);
		assertEquals(esperado, obtenido, "Se espera obtener como resultado el valor 4");
	}
	
	@Test
	void testEnterosCuandoElPrimerValorEsCero() {
		double d = 0;
		double e = 3;
		double esperado = -3;
		double obtenido = objeto.restaReales(d, e);
		assertEquals(esperado, obtenido, "Se espera obtener como resultado el valor -3");
	}
	
	@Test
	void testEnterosCuandoElSegundoValorEsCero() {
		double d = 3;
		double e = 0;
		double esperado = 3;
		double obtenido = objeto.restaReales(d, e);
		assertEquals(esperado, obtenido, "Se espera obtener como resultado el valor 3");
	}
	
	@Test
	void testEnterosCuandoUnoDeLosValoresEsNegativo() {
		double d = -20;
		double e = 3;
		double esperado = -888;
		double obtenido = objeto.restaReales(d, e);
		assertEquals(esperado, obtenido, "Se espera obtener como resultado el error -888");
	}
	
	///////////////////////////////////////////////////////////////////////////////////////
	
	@Test
	void testComprobacionRestaTres() {
		double a = 10;
		double b = 3;
		double c = 1;
		double esperado = 6;
		double obtenido = objeto.restaTres(a, b, c);
		assertEquals(esperado, obtenido, "Se espera como resultado el valor 6");
	}
	
	@Test
	void testTresComprobacionCuandoElPrimerValorEsCero() {
		double a = 0;
		double b = 3;
		double c = 1;
		double esperado = -4;
		double obtenido = objeto.restaTres(a, b, c);
		assertEquals(esperado, obtenido, "Se espera como resultado el valor -4");
	}
	
	@Test
	void testTresComprobacionCuandoElSegundoValorEsCero() {
		double a = 10;
		double b = 0;
		double c = 1;
		double esperado = 9;
		double obtenido = objeto.restaTres(a, b, c);
		assertEquals(esperado, obtenido, "Se espera como resultado el valor 9");
	}
	
	@Test
	void testTresComprobacionCuandoElTercerValorEsCero() {
		double a = 10;
		double b = 4;
		double c = 0;
		double esperado = 6;
		double obtenido = objeto.restaTres(a, b, c);
		assertEquals(esperado, obtenido, "Se espera como resultado el valor 6");
	}
	
	@Test
	void testTresComprobacionCuandoUnoDeLosValoresEsNegativo() {
		double a = -100;
		double b = 3;
		double c = 1;
		double esperado = -888;
		double obtenido = objeto.restaTres(a, b, c);
		assertEquals(esperado, obtenido, "Se espera como resultado el error -888");
	}
	
	///////////////////////////////////////////////////////////////////////////////////////
	
	@Test
	void testComprobacionRestaAcumulado() {
		objeto.restaAcumulado(3);
		objeto.restaAcumulado(4);
		objeto.restaAcumulado(6);
		double esperado = -13;
		double obtenido = objeto.getAcumulado();
		assertEquals(esperado, obtenido, "Se espera como resultado el valor -13");
	}
	
	@Test
	void testAcumuladoCuandoElDatoIntroducidoEsCero() {
		objeto.restaAcumulado(0);
		objeto.restaAcumulado(0);
		objeto.restaAcumulado(0);
		double esperado = 0;
		double obtenido = objeto.getAcumulado();
		assertEquals(esperado, obtenido, "Se espera como resultado el valor 0");
	}
	
	@Test
	void testAcumuladoCuandoElDAtoIntroducidoEsNegativo() {
		objeto.restaAcumulado(-3);
		objeto.restaAcumulado(-4);
		objeto.restaAcumulado(-6);
		double esperado = 13;
		double obtenido = objeto.getAcumulado();
		assertEquals(esperado, obtenido, "Se espera como resultado el valor 13");
	}

}