import javax.swing.JOptionPane;

public class Milestone1Fase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ***************** Fase1 *******************
		/*
		 * Crea tres variables string e inicialitzales amb les dades pertinents (nom,
		 * cognom1, cognom2).
		 */
		//String nom = "Steve";
		//String cognom1 = "Mac";
		//String cognom2 = "Queen";

		/*
		 * Crea tres variables int e inicialitzales amb les dades pertinents (dia, mes,
		 * any).
		 */

		int dia = 24;
		int mes = 3;
		int any = 1975;

		/*
		 * Mostra per pantalla les variables string concatenant-les en aquest ordre
		 * (cognom1 + cognom2, + nom).
		 */
		//JOptionPane.showMessageDialog(null, cognom1 + " " + cognom2 + " " + nom);
		/*
		 * Mostra per consola les variables string concatenades
		 * 
		 */

		// System.out.println(cognom1+" "+cognom2+" "+nom);

		/*
		 * Mostra per pantalla les variables int concatenant-les amb “/” entre cada una
		 * d’elles.
		 */
		//JOptionPane.showMessageDialog(null, dia + " / " + mes + " / " + any);
		/*
		 * Mostra per consola les variables string concatenades
		 * 
		 */
		// System.out.println( dia+" / "+mes+" / "+any);

		// ***************** Fase2 *******************

		/*
		 * Són de traspàs els anys en què les dues darreres xifres de l'any són
		 * múltiples de 4, excepte si aquestes xifres són 00. Aleshores, cal tenir en
		 * compte les dues primeres xifres de l'any. Si són múltiples de 4, l'any també
		 * serà de traspàs. En resum: és de traspàs cada any múltiple de quatre, excepte
		 * els múltiples de cent, que no ho són, i excepte els múltiples de 400, que sí
		 * que ho són (font: https://ca.wikipedia.org/wiki/Any_de_trasp%C3%A0s)
		 * 
		 * Sabent que l’any 1948 es un any de traspàs: − Creeu una constant amb el valor
		 * de l’any (1948). − Creeu una variable que guardi cada quan hi ha un any de
		 * traspàs. − Calculeu quants anys de traspàs hi ha entre 1948 i el vostre any
		 * de naixement i emmagatzemeu el valor resultant en una variable. − Mostreu per
		 * pantalla el resultat del càlcul.
		 */

		/*
		 * Crear i inicialitzar constant ANY_TRASPAS
		 * 
		 */
		final int ANY_TRASPAS = 1948;
		//JOptionPane.showMessageDialog(null, "any traspas " + ANY_TRASPAS);
		/*
		 * Crear i inicialitzar variable guarda nombre anys traspas n_Anys
		 * 
		 */
		int n_Anys = 0;
		/*
		 * − Creeu una variable que guardi cada quan hi ha un any de traspàs,
		 * anysTraspas
		 */
		int anysTraspas = 4;
		/*
		 * Calculeu quants anys de traspàs hi ha entre 1948 i el vostre any de naixement
		 * i emmagatzemeu el valor resultant en una variable, n_Anys .
		 */
		n_Anys = (any - ANY_TRASPAS) / anysTraspas+1;
		System.out.println("Des del " + ANY_TRASPAS + " hi ha " + n_Anys + " anys de traspas");

		

	}
}
