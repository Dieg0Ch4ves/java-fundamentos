package controle;

import javax.swing.JOptionPane;

public class IfElse {

	public static void main(String[] args) {
		
		String valor = JOptionPane.showInputDialog(
				"Informe número: ");
		int numero = Integer.parseInt(valor);
		
		if(numero % 2 == 0) {
			System.out.println("Numero par");
		}
		
		if(numero % 2 == 1) {
			System.out.println("Número impar");
		}
		
		if(numero % 2 == 0) {
			System.out.println("Numero Par");
		}else {
			System.out.println("Numero impar");
		}
	}
}
