/**
 * @author alexandra
 * @version 1.0
 * @since 06/02/2021
 *
 */

public class Cociente {

	private double real1, real2, solucion; // Numeros reales. La solucion siempre será un double
	private int num1, num2; // Numeros enteros

	/**
	 * Constructor vacio
	 */
	public Cociente() {
		super();
	}

	/**
	 * Constructor para operaciones con numeros reales
	 * 
	 * @param real1 es un numero real
	 * @param real2 es un numero real
	 */

	public Cociente(double real1, double real2) {
		super();
		this.real1 = real1;
		this.real2 = real2;
	}

	/**
	 * Constructor para operaciones con numeros enteros
	 * 
	 * @param num1 es un numero entero
	 * @param num2 es un numero entero
	 */

	public Cociente(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}

	/**
	 * Constructor para la raiz cuadrada (solo necesita 1 parametro de entrada)
	 * 
	 * @param num1 es un numero entero
	 */
	public Cociente(int num1) {
		super();
		this.num1 = num1;
	}

	/**
	 * Constructor para el inverso (solo necesita 1 parametro de entrada)
	 * 
	 * @param real1 es un numero real
	 */

	public Cociente(double real1) {
		super();
		this.real1 = real1;
	}

// Getter and setter
	public double getReal1() {
		return real1;
	}

	public void setReal1(double real1) {
		this.real1 = real1;
	}

	public double getReal2() {
		return real2;
	}

	public void setReal2(double real2) {
		this.real2 = real2;
	}

	public double getSolucion() {
		return solucion;
	}

	public void setSolucion(double solucion) {
		this.solucion = solucion;
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	// Métodos
	/**
	 * División de dos números reales Recibe 2 parámetros de entrada y 1 de salida
	 * que será la solución Si el divisor es 0 devolver -888, el resultado sería
	 * infinito
	 * 
	 * @return solucion
	 */
	public double divisionReales() {
		if (real2 != 0) {
			solucion = real1 / real2;
			return solucion;
		} else
			return -888;
	}

	/**
	 * División de dos números enteros Recibe 2 parámetros de entrada y 1 de salida
	 * que será la solución Si el divisor es 0 devolver -888, el resultado sería
	 * infinito
	 * 
	 * @return solucion es un double para recoger resultados que no dan un número
	 *         exacto
	 */
	public double divisionEnteros() {
		if (num2 != 0) {
			solucion = num1 / num2;
			return solucion;
		} else
			return -888;

	}
	
	/**
	 * Inverso de un número real 
	 * Recibe 1 parámetro de entrada y 1 de salida que será la solución
	 * El inverso de 0 no existe, asi que si el numero dado es 0 dará -888888 para marcar error
	 * @return solucion es un double para recoger resultados que no dan un número exacto
	 */
	public double inverso() {
		if (real1 != 0) {
			solucion = 1/real1;
			return solucion;
		} else 
			return -888888;
		
	}
}