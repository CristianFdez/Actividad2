/**
 * ENTORNOS DE DESARROLLO
 * Actividad 1. Tarea en equipo (4 personas). Generación de documentación
 * Clase 5 - Operación 
 * 
 * @author Sorin Petrut Niculae
 * @version 1.0
 *
 */

public class Operacion {

	/**
	 * Atributos de instancia
	 */
	private int primo;
	private int iEsimo;
	private double porcentaje1;
	private double porcentaje2;
	private int factorial;
	
	
	
	/**
	 * Constructor con todos los atributos
	 * @param primo
	 * Numero del que vamos a obtener el numero primo
	 * @param iEsimo
	 * Numero del que vamos a obtener el i-esimo numero primo entero
	 * @param porcentaje1
	 * Primer numero del que vamos a obtener el porcentaje
	 * @param porcentaje2
	 * Segundo numero del que vamos a obtener el porcentaje
	 * @param factorial
	 * Numero del que vamos a obtener el factorial
	 */
	public Operacion(int primo, int iEsimo, double porcentaje1, double porcentaje2, int factorial) {
		super();
		this.primo = primo;
		this.iEsimo = iEsimo;
		this.porcentaje1 = porcentaje1;
		this.porcentaje2 = porcentaje2;
		this.factorial = factorial;
	}
	
	
	/**
	 * Setters & Getters
	 * Metodos para dar y obtener el valor de los atributos
	 */
	
	/**
	 * Metodo para obtener el valor del atributo del que vamos a obtener el numero primo.
	 * @return primo - Valor del numero del cual vamos a obtener el numero primo.
	 */
	public int getPrimo() {
		return primo;
	}
	
	/**
	 * Metodo para dar valor al atributo del que vamos a obtener el numero primo.
	 * @param primo
	 * Numero del que vamos a obtener el numero primo.
	 */
	public void setPrimo(int primo) {
		this.primo = primo;
	}

	/**
	 * Metodo para obtener el valor del atributo del que vamos a obtener el i-esimo numero primo entero.
	 * @return iEsimo - Valor del numero del cual vamos a obtener el iEsimo numero primo entero.
	 */
	public int getiEsimo() {
		return iEsimo;
	}

	/**
	 * Metodo para dar valor al atributo del que vamos a obtener el i-esimo numero primo entero.
	 * @param iEsimo
	 * Numero del que vamos a obtener el i-esimo numero primo entero,
	 */
	public void setiEsimo(int iEsimo) {
		this.iEsimo = iEsimo;
	}

	/**
	 * Metodo para obtener el valor del primer atributo de los cuales vamos a obtener el porcentaje.
	 * @return porcentaje1 - Valor del primer numero de los cuales vamos a obtener el porcentaje.
	 */
	public double getPorcentaje1() {
		return porcentaje1;
	}

	/**
	 * Metodo para dar valor al primer atributo de los cuales vamos a obtener el porcentaje.
	 * @param porcentaje
	 * Primer numer de los cuales vamos a obtener el porcentaje.
	 */
	public void setPorcentaje1(int porcentaje) {
		this.porcentaje1 = porcentaje;
	}
	
	/**
	 * Metodo para obtener el valor del segundo atributo de los cuales vamos a obtener el porcentaje.
	 * @return porcentaje2 - Valor del segundo numero de los cuales vamos a obtener el porcentaje
	 */
	public double getPorcentaje2() {
		return porcentaje2;
	}

	/**
	 * Metodo para dar valor al segundo atributo de los cuales vamos a obtener el porcentaje.
	 * @param porcentaje
	 * Segundo numero de los cuales vamos a obtener el porcentaje.
	 */
	public void setPorcentaje2(int porcentaje) {
		this.porcentaje2 = porcentaje;
	}

	/**
	 * Metodo para obtener el valor del atributo del que vamos a obtener el factorial.
	 * @return factorial - Valor del numero del cual vamos a obtener el factorial.
	 */
	public int getFactorial() {
		return factorial;
	}

	/**
	 * Metodo para dar valor al atributo del que vamos a obtener el factorial.
	 * @param factorial
	 * Numero del cual vamos a obtener el factorial.
	 */
	public void setFactorial(int factorial) {
		this.factorial = factorial;
	}
	
	
	
}