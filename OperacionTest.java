import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OperacionTest {

	Operacion op1 = new Operacion(0, 4, 5.2, 3.6, 4);

	// Los test del metodo obtenerPrimo(). Primero el happy test y luego los casos
	// especiales
	@Test
	void testElOnceEsUnNumeroPrimo() {
		op1.setPrimo(11);
		boolean esperado = true;
		boolean obtenido = op1.obtenerPrimo();
		assertEquals(esperado, obtenido, "El 11 es un numero primo.");
	}

	@Test
	void testCuandoIntroducesUnCeroElPrimoDevuelveFalse() {
		op1.setPrimo(0);
		boolean esperado = false;
		boolean obtenido = op1.obtenerPrimo();
		assertEquals(esperado, obtenido, "Cero no es un numero primo, asi que daria false.");
	}

	@Test
	void testCuandoIntroducesMenosTresElPrimoDevuelveFalse() {
		op1.setPrimo(-3);
		boolean esperado = false;
		boolean obtenido = op1.obtenerPrimo();
		assertEquals(esperado, obtenido, "El primo de -3 no existe, asi que daria false.");
	}

	// Los test del metodo obtenerPorcentaje(). Primero el happy test y luego los
	// casos especiales
	@Test
	void testElQuintoNumeroPrimoDebeDar7() {
		op1.setiEsimo(5);
		int esperado = 7;
		int obtenido = op1.obtenerIesimo();
		assertEquals(esperado, obtenido, "El numero primo en posición 5 debería dar 7");
	}

	@Test
	void testCalculamosElNumeroPrimoEnPosicionCero() {
		op1.setiEsimo(0);
		int esperado = -888;
		int obtenido = op1.obtenerIesimo();
		assertEquals(esperado, obtenido, "El numero primo en posición cero debería dar -888");
	}

	@Test
	void testCuandoIntroducesUnNumeroNegativoElIesimoDaError() {
		op1.setiEsimo(-10);
		int esperado = -888;
		int obtenido = op1.obtenerIesimo();
		assertEquals(esperado, obtenido, "El numero primo en posición cero debería dar -888");
	}

	// Los test del metodo obtenerPorcentaje(). Primero el happy test y luego los
	// casos especiales
	@Test
	void testCalculamosEl25PorCiento100() {
		op1.setPorcentaje1(100);
		op1.setPorcentaje2(25);
		int esperado = 25;
		double obtenido = op1.obtenerPorcentaje();
		assertEquals(esperado, obtenido, "El 25% de 100 debería dar 25");
	}

	@Test
	void testCalculamosEl25PorCientoDeMenos100() {
		op1.setPorcentaje1(-100);
		op1.setPorcentaje2(25);
		int esperado = -888;
		double obtenido = op1.obtenerPorcentaje();
		assertEquals(esperado, obtenido, "El 25% de -100 debería dar -888");
	}

	@Test
	void testCalculamosEl25PorCientoDeCero() {
		op1.setPorcentaje1(0);
		op1.setPorcentaje2(25);
		int esperado = -888;
		double obtenido = op1.obtenerPorcentaje();
		assertEquals(esperado, obtenido, "El 25% de 0 debería dar -888");
	}

	@Test
	void testCalculamosElCeroPorCientoDe25() {
		op1.setPorcentaje1(25);
		op1.setPorcentaje2(0);
		int esperado = 0;
		double obtenido = op1.obtenerPorcentaje();
		assertEquals(esperado, obtenido, "El 0% de 25 debería dar 0");
	}

	@Test
	void testCalculamosElCeroPorCientoDeCero() {
		op1.setPorcentaje1(0);
		op1.setPorcentaje2(0);
		int esperado = -888;
		double obtenido = op1.obtenerPorcentaje();
		assertEquals(esperado, obtenido, "El 0% de 0 debería dar -888");
	}

	// Los test del metodo obtenerFactorial(). Primero el happy test y luego los
	// casos especiales
	@Test
	void testElFactorialDe4DebeDar24() {
		op1.setFactorial(4);
		double esperado = 24;
		double obtenido = op1.obtenerFactorial();
		assertEquals(esperado, obtenido, "El factorial de 4 deberia dar 24.");
	}

	@Test
	void testElFactorialDeMenos4DebeDarMenos888() {
		op1.setFactorial(-4);
		double esperado = -888;
		double obtenido = op1.obtenerFactorial();
		assertEquals(esperado, obtenido, "El factorial de -4 deberia dar -888.");
	}

	void testElFactorialDeCeroDebeDarMenos888() {
		op1.setFactorial(0);
		double esperado = -888;
		double obtenido = op1.obtenerFactorial();
		assertEquals(esperado, obtenido, "El factorial de 0 debería dar -888.");
	}

}
