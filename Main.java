public class Main {

	public static void main(String[] args) {
		
		//Creamos los objetos
		Operacion operacion = new Operacion(63, 23, 85.36, 51.35, 22);
		
		Producto pro1 = new Producto();
		//Ejecutamos los metodos de prueba
		System.out.println(operacion.obtenerPrimo());
		System.out.println(pro1.pro2(12, 25));
		
	

	}

}