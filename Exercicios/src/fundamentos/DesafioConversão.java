package fundamentos;

import java.util.Scanner;

public class DesafioConversão {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite seu primeiro salario: ");
		String salario1 = entrada.next().replace(".", ",");
		
		System.out.print("Digite seu segundo salario: ");
		String salario2 = entrada.next().replace(".", ",");
		
		System.out.print("Digite seu terceiro salario: ");
		String salario3 = entrada.next().replace(".", ",");
		
		double valor1 = Double.parseDouble(salario1);
		double valor2 = Double.parseDouble(salario2);
		double valor3 = Double.parseDouble(salario3);
		
		double soma =  valor1 + valor2 + valor3;
		System.out.println("Média Salarial: " + soma / 3);
		
		entrada.close();	
	}
}
