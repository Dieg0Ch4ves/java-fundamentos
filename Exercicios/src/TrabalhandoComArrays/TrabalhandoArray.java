package TrabalhandoComArrays;

import javax.swing.JOptionPane;

public class TrabalhandoArray {
	
	public static void main(String[] args) {
		//Declarando o array de países
		String [] paises = new String[4];
		
		//Declarando o array de números 
		int [] numeros = new int[10];
		/*
		//Declarando valores ao array de paises
		for (int i = 0; i < 4; i++) {
			paises[i] = JOptionPane.showInputDialog("Informe um país:") ;
		}
		
		//Listando o array de paises
		for (String paisesLista : paises) {
			System.out.println(paisesLista);			
		}
		*/
		//Declarando valores de array de numeros
		for (int i = 0; i < 10; i++) {
			numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero"));
		}
		
		//Listando o array de numeros ANTES do calculo
		for (Integer listaNumeros : numeros) {
			System.out.println(listaNumeros);
		}
		
		int novoValor = 11;
		numeros[8] = novoValor + 4;
		
		//Listando o array de numeros DEPOIS do calculo
		for (Integer listaNumeros : numeros) {
			System.out.println(listaNumeros);
		}
	}
}
