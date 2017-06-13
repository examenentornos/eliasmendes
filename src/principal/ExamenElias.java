package principal;

import java.util.Scanner;

/**
 * 
 * @author Elias Mendes dos Santos
 *
 */
public class ExamenElias {

	private final static int COMPLEMENTO1 = 1000; // 5 o más años de antigüedad
													// y
	// cobran plus
	private final static int COMPLEMENTO2 = 500; // 5 o más años de antigüedad y
													// no
	// cobran plus
	private final static int COMPLEMENTO3 = 300; // 5 o menos años de antigüedad
													// y
	// cobran plus
	private final static int COMPLEMENTO4 = 100; // 5 o menos años de antigüedad
													// y no
	// cobran plus

	public static void main(String[] args) {
		// System.out.println(calcularCodigo("111;eeeeeeeeeeeeeeeeeeee;15;false"));
	}

	public static int calcularCodigo(String cadena) {
		int resultadoComplemento = 0;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(cadena); // crear un objeto
											// Scanner
		int codigo;
		String[] nombre;
		String nombreA;
		int antiguedad;
		String plus;

		sc.useDelimiter(";");
		System.out.println("Delimitador -->  " + sc.delimiter() + "\n");
		while (sc.hasNext() == true) {

			// codigo:
			codigo = sc.nextInt(); // leer codigo
			if (codigo <= 0 || codigo >= 1000) {
				System.out.println("codigo: Incorrecto " + codigo);
				throw new RuntimeException();
			} else {

				System.out.println("codigo:  " + codigo);
			}

			// nombre
			nombreA = sc.next(); // leer un nombre
			nombre = new String[nombreA.length()];
			for (int i = 0; i < nombre.length; i++) {
				nombre[i] = nombreA;
			}
			System.out.println("nombre: " + nombre[0].toString());
			if (nombreA.length() > 20) {

				throw new RuntimeException();
			}

			// Antiguedad
			antiguedad = sc.nextInt(); // leer antiguedad
			if (antiguedad < 0 || antiguedad >= 100)
				throw new RuntimeException();
			else {
				System.out.println("Antiguedad ->"+ antiguedad);
				;
			}

			// Plus y Casos de complemento:

			plus = sc.next();
			System.out.println("plus: " + plus + "\n");
			if (plus.equalsIgnoreCase("SI") || (plus.equalsIgnoreCase("NO"))) {

				if (antiguedad >= 5 && plus.equalsIgnoreCase("SI"))
					resultadoComplemento = COMPLEMENTO1;
				else if (antiguedad >= 5 && plus.equalsIgnoreCase("NO"))
					resultadoComplemento = COMPLEMENTO2;
				else if (antiguedad < 5 && plus.equalsIgnoreCase("SI"))
					resultadoComplemento = COMPLEMENTO3;
				else
					resultadoComplemento = COMPLEMENTO4;

			} else

				throw new RuntimeException();

		}
		System.out.println("FIN CADENA.");
		sc.close();

		return resultadoComplemento;
	}
}


