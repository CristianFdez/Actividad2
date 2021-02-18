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
	
	/**
	 *  Método para restar números reales.
	 *  
	 *  Recibe 2 parámetros de entrada y 1 de salida que será el resultado.
	 *  
	 *  Casos especiales:
	 *  Si uno de los datos es 0, el resultado sería igual al otro valor.
	 *  Si uno de los datos introducido es negativo, daría error y el resultado sería -888.
	 *  
	 *  @param a número real y primer parámetro de la resta.
	 *  @param b número real y segundo parámetro de la resta.
	 *  
	 *  @return resultado
	 */
	public double restaReales() {
		if (a > 0 && b > 0)
			resultado = a - b;
		else {
			System.out.println("Error, dato introducido negativo");
			return -888;
		}
		return resultado;
	}
	
	/**
	 *  Método para restar números enteros.
	 *  
	 *  Recibe 2 parámetros de entrada y 1 de salida que será el resultado.
	 *  
	 *  Casos especiales:
	 *  Si uno de los datos es 0, el resultado sería igual al otro valor.
	 *  Si uno de los datos introducido es negativo, daría error y el resultado sería -888.
	 *  
	 *  @param d número entero y primer parámetro de la resta.
	 *  @param e número entero y segundo parámetro de la resta.
	 *  
	 *  @return resultado
	 */
	public double restaEnteros() {
		if (d > 0 && e > 0)
			resultado = d - e;
		else {
			System.out.println("Error, dato introducido negativo");
			return -888;
		}
		return resultado;
	}
	
	/**
	 *  Método para restar tres números reales.
	 *  
	 *  Recibe 3 parámetros de entrada y 1 de salida que será el resultado.
	 *  
	 *  Casos especiales:
	 *  Si uno de los datos es 0, el resultado sería igual a la resta de los otros dos valores.
	 *  Si uno de los datos introducido es negativo, daría error y el resultado sería -888.
	 *  
	 *  @param a número real y primer parámetro de la resta.
	 *  @param b número real y segundo parámetro de la resta.
	 *  @param c número real y tercer parámetro de la resta.
	 *  
	 *  @return resultado
	 */
	public double restaTres() {
		if (a > 0 && b > 0 && c > 0)
			resultado = a - b - c;
		else {
			System.out.println("Error, dato introducido negativo");
			return -888;
		}
		return resultado;
	}
	
	/**
	 *  Método para restar número acumulado.
	 *  
	 *  Recibe 1 parámetro de entrada y acumula el valor despues de restar.
	 *  
	 *  Casos especiales:
	 *  Si el dato introducido es 0, el valor no cambiaría.
	 *  Si el dato introducido es negativo, se sumaría en vez de restarse.
	 *  
	 *  @param acumulado número entero, valor donde se va acumulando el resultado.
	 *  @param num1 número entero, valor que se pasa para que le vaya restando a acumulado.
	 */
	public void restaAcumulado(int num1) {
		acumulado = acumulado - num1;
	}
	
}