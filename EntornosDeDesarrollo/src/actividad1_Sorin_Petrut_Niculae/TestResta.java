package actividad1_Sorin_Petrut_Niculae;

public class TestResta {

	public static void main(String[] args) {
		
		//Creamos objeto de tipo Resta
		Resta testNumber = new Resta(34.45, 78.49, 23.74, 90, 50);
		
		//Hacemos uso de los metodos creados en la clase Resta
		System.out.println(testNumber.restaReales);
		System.out.println(testNumber.restaEnteros);
		System.out.println(testNumber.restaTres);
		System.out.println(testNumber.restaAcumulado);

	}

}
