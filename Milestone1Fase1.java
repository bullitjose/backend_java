import javax.swing.JOptionPane;

public class Milestone1Fase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ***************** Fase1 *******************
		/*
		 * Crea tres variables string e inicialitzales amb les dades pertinents (nom,
		 * cognom1, cognom2).
		 */
		String nom = "Steve";
		String cognom1 = "Mac";
		String cognom2 = "Queen";

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
		JOptionPane.showMessageDialog(null, cognom1 + " " + cognom2 + " " + nom);
		/*
		 * Mostra per consola les variables string concatenades
		 * 
		 */

		// System.out.println(cognom1+" "+cognom2+" "+nom);

		/*
		 * Mostra per pantalla les variables int concatenant-les amb “/” entre cada una
		 * d’elles.
		 */
		JOptionPane.showMessageDialog(null, dia + " / " + mes + " / " + any);
		/*
		 * Mostra per consola les variables string concatenades
		 * 
		 */
		// System.out.println( dia+" / "+mes+" / "+any);

	}
}
