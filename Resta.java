	/**
	 * ENTORNOS DE DESARROLLO
	 * Actividad 1. Tarea en equipo (4 personas). Generación de documentación
	 * Clase 2 - Resta 
	 * @author Cristian Fernández
	 * @version 1.0
	 * @since 05/02/2021
	 */

public class Resta {

	/**
	 * Declaro los valores resultado como valor de la solución y acumulado para acumular el valor en el método restaAcumulado.
	 */
	private double resultado;
	private int acumulado;
	
	/**
	 * Declaro el constructor sin nada, vacío.
	 */
	public Resta() {
		super();
	}
	
	/**
	 * Método getter para obtener el acumulado en el método restaAcumulado
	 * @return acumulado
	 */
	public int getAcumulado() {
		return acumulado;
	}

	/**
	 *  Método para restar números reales.
	 *  
	 *  Recibe 2 parámetros de entrada y 1 de salida que será el resultado.
	 *  
	 *  Casos especiales:
	 *  Si el primer valor es un 0, el resultado será igual al segundo valor, pero en negativo.
	 *  Si el segundo valor es un 0, el resultado será igual al primer valor.
	 *  Si uno de los datos introducido es negativo, daría error y el resultado sería -888.
	 *  
	 *  @param a número real y primer parámetro de la resta.
	 *  @param b número real y segundo parámetro de la resta.
	 *  
	 *  @return resultado
	 */
	public double restaReales(double a, double b) {
		if (a >= 0 && b >= 0)
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
	 *  Si el primer valor es un 0, el resultado será igual al segundo valor, pero en negativo.
	 *  Si el segundo valor es un 0, el resultado será igual al primer valor.
	 *  Si uno de los datos introducido es negativo, daría error y el resultado sería -888.
	 *  
	 *  @param d número entero y primer parámetro de la resta.
	 *  @param e número entero y segundo parámetro de la resta.
	 *  
	 *  @return resultado
	 */
	public double restaEnteros(int d, int e) {
		if (d >= 0 && e >= 0)
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
	 *  Si el primer valor es un 0, el resultado será igual a la resta de los otros dos valores.
	 *  Si el segundo valor es un 0, el resultado será igual a la resta de los otros dos valores.
	 *  Si el tercer valor es un 0, el resultado será igual a la resta de los otros dos valores.
	 *  Si uno de los datos introducido es negativo, daría error y el resultado sería -888.
	 *  
	 *  @param a número real y primer parámetro de la resta.
	 *  @param b número real y segundo parámetro de la resta.
	 *  @param c número real y tercer parámetro de la resta.
	 *  
	 *  @return resultado
	 */
	public double restaTres(double a, double b, double c) {
		if (a >= 0 && b >= 0 && c >= 0)
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