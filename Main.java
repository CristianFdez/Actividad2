public class Main {

	public static void main(String[] args) {
		
		//Creamos los objetos
		Operacion operacion = new Operacion(63, 23, 85.36, 51.35, 22);
		
		Producto pro1 = new Producto();
		
		Cociente coc = new Cociente(6, 2);
		
		Resta resta = new Resta();
		
		//Ejecutamos los metodos de prueba
		System.out.println(operacion.obtenerPrimo());
		
		System.out.println(pro1.pro2(12, 25));
		
		System.out.println(coc.divisionEnteros());

		resta.restaAcumulado(5);
		resta.restaAcumulado(2);
		resta.restaAcumulado(4);
		System.out.println(resta.getAcumulado());
	

	}

}