import javax.swing.JOptionPane;

public class Milestone2 {

	public static void main(String[] args) {

		/*
		 * Declara una variable double. Assigna-li un valor amb 4 decimals. − Declara
		 * variables de tipus: int, float i string. − Fes un "cast" de la variable
		 * double a cada una de les variables que has creat anteriorment per
		 * inicialitzar-les i pinta-les per pantalla.
		 */
		/*
		 * Declarar una variable double, var, i assignar-li valor amb 4 decimals
		 * 
		 * 
		 */
		double varDouble = 45.2345;
		/*
		 * − Declarar variables de tipus: int, float i string.
		 */
		int varInt;
		float varFloat;
		String varString;
		/*
		 * Fer un "cast" de la variable double varDouble a cada una de les variables
		 */

		/*
		 * Crea tres variables int e inicialitzales amb les dades pertinents (dia, mes,
		 * any).
		 */

		varInt = (int) varDouble;
		System.out.println("Fem cast de double a int, el valor es " + varInt);
		varFloat = (float) varDouble;
		System.out.println("Fem cast de double a float, el valor es " + varFloat);

		// De double a string amb el metode valueOf()
		varString = String.valueOf(varDouble);
		System.out.println("Fem cast de double a String, el valor es " + varString);

	}
}
