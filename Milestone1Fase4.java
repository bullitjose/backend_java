
public class Milestone1Fase4 {

	public static void main(String[] args) {
		// ***************** Fase4 *******************

		/*
		 * − Creeu una variable on juntareu el nom i els cognoms (tot en una variable) i
		 * un altre on juntareu la data de naixement separada per “/” (tot en una
		 * variable). Mostreu per consola les variables del nom complet, la data de
		 * naixement i si l’any de naixement es de traspàs o no.
		 * 
		 */
		/*
		 * Crea tres variables string e inicialitzales amb les dades pertinents (nom,
		 * cognom1, cognom2).
		 */
		String nom = "Steve";
		String cognom1 = "Mac";
		String cognom2 = "Queen";
		/*
		 * Creeu una variable on juntareu el nom i els cognoms (tot en una
		 * variable),nomComplet
		 */
		String nomComplet = nom +" "+ cognom1+" " + cognom2;
		/*
		 * Crea tres variables int e inicialitzales amb les dades pertinents (dia, mes,
		 * any).
		 */

		int dia = 24;
		int mes = 3;
		int any = 2008;
		/*
		 * Crear variable string on juntareu la data de naixement separada per “/”
		 */
		String dataCompleta = dia + "/" + mes + "/" + any;

		System.out.println("El meu nom és " + nomComplet);
		System.out.println("Vaig néixer el " + dataCompleta);
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
		String cadenaSiTraspas = " és de traspàs";
		String cadenaNoTraspas = " no és de traspàs";
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
					System.out.println("El meu any de naixement" + cadenaSiTraspas);
				}
				n_Anys++;

				// System.out.println(i + cadenaSiTraspas + ", és el nª " + n_Anys);

			} else if (i % 400 == 0) {
				if (i == any_traspas) {
					System.out.println(i + cadenaSiTraspas);
				}
				n_Anys++;
				// System.out.println(i + cadenaSiTraspas + ", és el nª " + n_Anys);
			} else {
				if (i == any_traspas) {
					System.out.println("El meu any de naixement" + cadenaNoTraspas);
				}

			}

		}

	}
}
