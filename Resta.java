	/**
	 * ENTORNOS DE DESARROLLO
	 * Actividad 1. Tarea en equipo (4 personas). Generación de documentación
	 * Clase 2 - Resta 
	 * @author Cristian Fernández
	 * @version 1.0
	 * @since 18/02/2021
	 */

public class Resta {

	/**
	 * Declaro varios valores para hacer las operaciones de resta,
	 * 3 valores reales y 2 enteros, y resultado como valor de la solución.
	 */
	private double a, b, c, resultado;
	private int  d, e, acumulado;
	
	/**
	 * Declaro el constructor sin nada, vacío.
	 */
	public Resta() {
		super();
	}

	/**
	 * Declaro el constructor con todos los valores.
	 * @param a es un número real.
	 * @param b es un número real.
	 * @param c es un número real.
	 * @param d es un número entero.
	 * @param e es un número entero.
	 */
	public Resta(double a, double b, double c, int d, int e) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
	}
	
	public int getAcumulado() {
		return acumulado;
	}
	
}