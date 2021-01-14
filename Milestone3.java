import javax.swing.JOptionPane;

public class Milestone3 {

	public static void main(String[] args) {

		/*
		 * Declara un array de numeros int e inicialitzala amb valors del 1 al 10 − Rota
		 * l’array sense utilitzar un array auxiliar ni llibreries. Pots utilizar una
		 * variable auxiliar.
		 * 
		 */

		int aux = 0;

		int[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int aux2 = num.length - 1;
		for (int i = 0; i < num.length; i++) {
			System.out.println("array original  [" + i + "] =" + num[i]);

			aux = num[i];

			num[i] = num[aux2 - i];
			num[aux2 - i] = aux;

			System.out.println("array final  [" + i + "] =" + num[i]);
		}

	
	}
}
