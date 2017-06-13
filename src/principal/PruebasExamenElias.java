package principal;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 * @author Elias Mendes dos Santos
 *
 */
public class PruebasExamenElias {

	// ExamenElias ae = new ExamenElias();

	/**
	 * Casos de prueba válidos
	 * 
	 */
	@Test
	public void testpValido1() {
		assertEquals(300, ExamenElias.calcularCodigo("100;Diego Alvarez;01;SI"));
	}

	@Test
	public void testpValido2() {
		assertEquals(500, ExamenElias.calcularCodigo("101;Alba Gomez;07;NO"));
	}

	/**
	 * Casos de Prueba no válidos
	 */
	@Test(expected = Exception.class)
	public void test1() {
		ExamenElias.calcularCodigo("000;Jesus Garcia;10;SI");
	}

	@Test(expected = Exception.class)
	public void test2() {
		ExamenElias.calcularCodigo("1001;Carmen Ruiz;9;NO");
	}

	@Test(expected = Exception.class)
	public void test3() {
		ExamenElias.calcularCodigo("abc;Sandra Lopez;2;SI");
	}

	@Test(expected = Exception.class)
	public void test4() {
		ExamenElias.calcularCodigo("123;Vanesa Perez;2;SI");
	}

	@Test(expected = Exception.class)
	public void test5() {
		ExamenElias.calcularCodigo("123;Juan Gonzalez Fernandez;3;SI");
	}

	@Test(expected = Exception.class)
	public void test6() {
		ExamenElias.calcularCodigo("123;Carmen Ruiz;-1;SI");
	}

	@Test(expected = Exception.class)
	public void test7() {
		ExamenElias.calcularCodigo("123;Carmen Ruiz;ab;NO");
	}

	@Test(expected = Exception.class)
	public void test8() {
		ExamenElias.calcularCodigo("123;Carmen Ruiz;8;*");
	}

}
