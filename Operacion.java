/**
 * ENTORNOS DE DESARROLLO
 * Actividad 1. Tarea en equipo (4 personas). Generación de documentación
 * Clase 5 - Operación 
 * 
 * @author Sorin Petrut Niculae
 * @version 1.4
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
	
	/**
	 * Metodos responsabilidad de la clase
	 * para trabajar los atributos de instancia
	 * 1º metodo - Para consultar la operacion que se va a realizar
	 * 2º metodo - Para mostrar los resultados de la operacion
	 * 3º metodo - Para calcular el numero primo del numero indicado
	 * 4º metodo - Para obtener el iEsimo numero primo del numero indicado
	 * 5º metodo - Para calcular el porcentaje de los 2 numero indicados
	 * 6º metodo - Para calcular el factorial del numero indicado
	 */
	
	/**
	 * Metodo para consultar la operacion que se va a realizar
	 * @return consultaroperacion
	 */
	public String consultarOperacion() {
		return "\nLa operacion es la siguiente:" + "\n1.Averiguar si el numero indicado es primo: " + primo + "\n2.Obtener el i-esimo de: " + iEsimo + "\n3.Obtener el porcentaje de: " + porcentaje1 + " y " + porcentaje2 + "\n4.Obtener el factorial de: " + factorial;
	}
	
	/**
	 * Metodo para mostrat los resultados de la operacion
	 * @return resultadoOperacion
	 */
	public String resultadoOperacion() {
		return "\nLos resultados de la operacion son los siguientes:" + "\n1.El numero indicado es primo: " + obtenerPrimo() + "\n2.El i-esimo numero primo del numero indicado es: " + obtenerIesimo() + "\n3.El porcentaje de los 2 numeros indicados es: " + obtenerPorcentaje() + "\n4.El factorial del numero indicado es: " + obtenerFactorial();
	}

	/**
	 * Metodo para calcular el numero primo del numero indicado.
	 * Recibe un parametro de entrada y devuelve otro que sera la solucion.
	 * 
	 * Casos especiales:
	 * 1. Si el parametro de entrada es un numero negativo, entonces obtendremos un error ya que no existe numero primo de un numero negativo.
	 * 2. Si el parametro de entrada es 0, entonces obtendremos un error ya que no existe un numero primo de 0.
	 * 
	 * @return obtenerPrimo - Solucion de la operacion.
	 */
	public Boolean obtenerPrimo() {
		Boolean esPrimoActual = true;
		if (primo < 2)
		{
			esPrimoActual = false;
		}
		else
		{
			for (int x = 2; x * x <= primo; x++)
			{
				if (primo % x == 0)
				{
					esPrimoActual = false;
					break;
				}
			}
		}
		return esPrimoActual;
	}
	
	/**
	 * Metodo para calcular i-ensimo numero primo entero.
	 * Recibe un parametro de entrada y devuelve otro que sera la solucion.
	 * 
	 * Casos especiales:
	 * 1. Si el parametro de entrada es un numero negativo, entonces obtendremos un error ya que no existe numero primo de un numero negativo.
	 * 2. Si el parametro de entrada es 0, entonces obtendremos un error ya que no existe un numero primo de 0.
	 * 
	 * @return obtenerIesimo - Solucion de la operacion.
	 */
	public int obtenerIesimo() {
		int num = 2;
		while (this.iEsimo != 1)
		{
			while (this.iEsimo % num == 0)
			{
				System.out.println(num);
				this.iEsimo /= num;
			}
		}
		return num;
	}
	
	/**
	 * Metodo para calcular el porcentaje de un numero real.
	 * Recibe 2 parametrso de entrada y devuelve otro que sera la solucion.
	 * 
	 * Casos especiales:
	 * 1. Si uno de los 2 parametros de entrada es un numero negativo, entonces el resultado seria un numero negativo ya que +/- o -/+ es igual a un numero negativo.
	 * 2. Si los dos parametros de entrada son negativos, entonces el resultado seria un numero positivo ya que -/- es igual a un numero positivo.
	 * 3. Si el primero parametro de entrada es 0, entonces el resultado seria 0 ya que 0 dividido entre cualquier numero es igual a 0.
	 * 4. Si eñ segundo parametro de entrada es 0, entonces obtendremos un error ya que no se puede dividir ningun numero entre 0.
	 * 5. Si los das parametros de entrada son 0, entonces el resultado seria 0.
	 * 
	 * @return obtener porcentaje - Solucion de la operacion.
	 */
	public double obtenerPorcentaje() {
		return ((porcentaje1 * 100) / porcentaje2);
	}
	
	/**
	 * Metodo para obtener el factorial de un numero entero.
	 * Recibe un parametro de entrada y devuelve otro que sera la salida.
	 * 
	 * Casos especiales:
	 * 1. Si el parametros de entrada es un numero negativo, entonces obtendremos un error ya que es imposible calcular el factorial de un numero negativo.
	 * 2. Si el parametros de entrada es 0, entonces el resultado seria 1 ya que factorial de 0 es 1.
	 * 
	 * @return obtenerFactorial - Solucion de la operacion.
	 */
	public double obtenerFactorial() {
		double resultadoFactorial = 1;
		for (int i = 2; i <= this.factorial; i++)
		{
			resultadoFactorial *= i;
		}
		return resultadoFactorial;
	}
	
}