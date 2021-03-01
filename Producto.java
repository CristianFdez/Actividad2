/**
 * 
 * Clase producto calculadora actividad grupal 2
 * Encontramos diferentes m�todos donde podremos realizar las operaciones solicitadas. 
 * Casos especiales: En el caso de que los numeros para realizar la potencia sean demasiado grandes
 * como para ser procesador saldr� por consola un aviso de error. 
 * 
 * @see Producto
 * @version 1.0
 */
public class Producto {

	
	
	/**
	 * 
	 * M�todo en el que dando dos parametros (double) nos devuelve su producto. 
	 * @param a Primer parametro para realizar la operaci�n (debe ser un double)
	 * @param b Segundo parametro para realizar la operaci�n (debe ser un double)
	 * @return Resultado
	 * Casos especiales:
	 * -En el caso de que uno de los valores sean cero siempre dar� como resultado cero
	 * -En el caso de introducir un numero negativo dar� como resultado -888.
	 * 
	 */
	
	public  double productoReales (double a , double b) {
		if (a <0 || b <0) {  
			System.out.println("Error, -888");
			return -888;
		}else {
			System.out.println(a*b);
			return a*b;
		}
	}
	

	/**
	 * M�todo en el que dando dos parametros (int) nos devuelve su producto. 
	 * @param a Primer parametro para realizar la operaci�n (debe ser un int)
	 * @param b Segundo parametro para realizar la operaci�n (debe ser un int)
	 * @return Resultado
	 * Casos especiales:
	 * -En el caso de que uno de los valores sean cero siempre dar� como resultado cero
	 * -En el caso de introducir un numero negativo dar� como resultado -888.
	 */
	
	
	public double productoEnteros (int a, int b) {
		if (a <0 || b <0) {  
			System.out.println("Error, -888");
			return -888;
			
		}else { 
			System.out.println(a*b);
			return a*b;
		}
	}
	
	/**
	 * M�todo en el que dando tres parametros (double) nos devuelve su producto. 
	 * @param a Primer parametro para realizar la operaci�n (debe ser un double)
	 * @param b Segundo parametro para realizar la operaci�n (debe ser un double)
	 * @param c Tercer parametro para realizar la operaci�n (debe ser un double)
	 * @return Resultado
	 * Casos especiales:
	 * -En el caso de que uno de los valores sean cero siempre dar� como resultado cero
	 * -En el caso de introducir un numero negativo dar� como resultado -888.
	 */

	public double productoTresReales( double a, double b, double c) {
		if (a <0 || b <0 || c<0) {  
			System.out.println("Error, -888");
			return -888;
			
		}else { 
			System.out.println(a*b*c);
			return (a*b*c);	
		}
	}
	
	/**
	 * M�todo que nos devuelve un potencia dandole su base y cociente (ambos double)
	 * @param base Pase Primer parametro para realizar la operaci�n ( Debe ser la base y debe ser un double)
	 * @param cociente  Cociente Segundo parametro para realizar la operaci�n ( debe ser el cociente y debe ser un double)
	 * @return Resultado
	 * Casos especiales:
	 * -Cualquier n�mero diferente de cero elevado a la potencia cero es igual a uno. 
	 * -Cero elevado a cualquier exponente positivo es igual a cero
	 * -Cuando uno de los numeros es demasiado grande como para poder respresentarlo aparece "Infinity".
	 * 
	 */
	public double potencia (double base, double cociente) {
		 return Math.pow ( base, cociente);
		
	}
}

	
