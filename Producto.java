/**
 * 
 * Clase producto calculadora actividad grupal 2
 * Encontramos diferentes métodos donde podremos realizar las operaciones solicitadas. 
 * Casos especiales: En el caso de que los numeros para realizar la potencia sean demasiado grandes
 * como para ser procesador saldrá por consola un aviso de error. 
 * 
 * @see Producto
 * @version 1.0
 */
public class Producto {
	

	
	/**
	 * 
	 * Método en el que dando dos parametros (double) nos devuelve su producto. 
	 * @param a Primer parametro para realizar la operación (debe ser un double)
	 * @param b Segundo parametro para realizar la operación (debe ser un double)
	 * Casos especiales:
	 * -En el caso de que uno de los valores sean cero siempre dará como resultado cero
	 * -En el caso de introducir un numero negativo dará como resultado -888.
	 * 
	 */
	
	public  void pro1 (double a , double b) {
		if (a <0 || b <0)  
			System.out.println("Error, -888");
		
		else 
			System.out.println(a*b);
		
		}
	
	

	/**
	 * Método en el que dando dos parametros (int) nos devuelve su producto. 
	 * @param a Primer parametro para realizar la operación (debe ser un int)
	 * @param b Segundo parametro para realizar la operación (debe ser un int)
	 * @return  Producto de a y b
	 * Casos especiales:
	 * -En el caso de que uno de los valores sean cero siempre dará como resultado cero
	 * -En el caso de introducir un numero negativo dará como resultado -888.
	 */
	
	
	public void pro2 (int a, int b) {
		if (a <0 || b <0)  
			System.out.println("Error, -888");
		
		else 
			System.out.println(a*b);
		
	}
	
	/**
	 * Método en el que dando tres parametros (double) nos devuelve su producto. 
	 * @param a Primer parametro para realizar la operación (debe ser un double)
	 * @param b Segundo parametro para realizar la operación (debe ser un double)
	 * @param c Tercer parametro para realizar la operación (debe ser un double)
	 * @return  producto de a,b y c. 
	 * Casos especiales:
	 * -En el caso de que uno de los valores sean cero siempre dará como resultado cero
	 * -En el caso de introducir un numero negativo dará como resultado -888.
	 */

	public void pro3( double a, double b, double c) {
		if (a <0 || b <0 || c<0)  
			System.out.println("Error, -888");
		
		else 
			System.out.println(a*b*c);
	}
	
	
	/**
	 * Método que nos devuelve un potencia dandole su base y cociente (ambos double)
	 * @param base Pase Primer parametro para realizar la operación ( Debe ser la base y debe ser un double)
	 * @param cociente  Cociente Segundo parametro para realizar la operación ( debe ser el cociente y debe ser un double)
	 * @return Potencia resultante. 
	 * Casos especiales:
	 * -Cualquier número diferente de cero elevado a la potencia cero es igual a uno. 
	 * -Cero elevado a cualquier exponente positivo es igual a cero
	 * -Cuando uno de los numeros es demasiado grande como para poder respresentarlo aparece "Infinity".
	 */
	public void prod4 (double base, double cociente) {
		System.out.println(Math.pow ( base, cociente));
	}
}

	
