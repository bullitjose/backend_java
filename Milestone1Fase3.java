
public class Milestone1Fase3 {

	public static void main(String[] args) {
		// ***************** Fase3 *******************

		/*
		 * Partint de l’any 1948 heu de fer un bucle for i mostrar els anys de traspàs
		 * fins arriba al vostre any de naixement. − ATENCIO! Haureu de canviar el tipus
		 * de variable de l’any 1948 per poder modificar-la. − Creeu una variable bool
		 * que sera certa si l’any de naixement és de traspàs o falsa si no ho és. − En
		 * cas de que la variable bool sigui certa, heu de mostrar per consola una frase
		 * on ho digui, en cas de ser falsa mostrareu la frase pertinent. Creeu dues
		 * variables string per guardar les frases.
		 */

		/*
		 * Crea tres variables int e inicialitzales amb les dades pertinents (dia, mes,
		 * any).
		 */

		// int dia = 24;
		// int mes = 3;
		int any = 2008;

		/*
		 * Crear i inicialitzar constant ANY_TRASPAS
		 * 
		 */
		int any_traspas = 1948;

		/*
		 * Crea una varible boolean, traspasSi
		 */
		boolean traspasSi;

		/*
		 * Crear i inicialitzar variable guarda nombre anys traspas n_Anys
		 * 
		 */
		int n_Anys = 0;

		/*
		 * Crea cadenes strings
		 */
		String cadenaSiTraspas = " és any de traspas";
		String cadenaNoTraspas = " no és any de traspas";
		/*
		 * Bucle per analitzar els anys des del ANY_TRASPAS fins any ambdós inclosos que
		 * són de traspas
		 */
		for (int i = any_traspas; i <= any; i++) {
			// Iniciar variable traspasSi, que sigui multiple de 4
			traspasSi = i % 4 == 0;

			/*
			 * Comprovar si és de traspàs cada any múltiple de quatre, excepte els múltiples
			 * de cent, que no ho són, i excepte els múltiples de 400, que sí que ho són
			 */
			if (traspasSi && (i % 100 != 0)) {

				if (i == any_traspas) {
					System.out.println(i + " ,el meu any de naixement, " + cadenaSiTraspas);
				}
				n_Anys++;

				System.out.println(i + cadenaSiTraspas + ", és el nª " + n_Anys);

			} else if (i % 400 == 0) {
				if (i == any_traspas) {
					System.out.println(i + cadenaSiTraspas);
				}
				n_Anys++;
				System.out.println(i + cadenaSiTraspas + ", és el nª " + n_Anys);
			} else {
				System.out.println(i + cadenaNoTraspas);
			}

		}

		System.out.println("Des del " + any_traspas + " hi ha " + n_Anys + " anys de traspas");
	}
}
