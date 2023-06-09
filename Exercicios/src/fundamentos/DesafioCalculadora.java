package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o primeiro valor");
		double valor1 = entrada.nextDouble();
		
		System.out.println("Digite o segundo valor");
		double valor2 = entrada.nextDouble();
		
		System.out.println("Digite a operação: + - * / %");
		String operacao = entrada.next(); 
		
		double resultado = operacao.equals("*") ? valor1 * valor2 : 
			operacao.equals("+") ? valor1 + valor2 : 
			operacao.equals("-") ? valor1 - valor2 : 
			operacao.equals("/") ? valor1 / valor2 :
			operacao.equals("%") ? valor1 % valor2 : 0;  
		
		System.out.println(resultado);
		entrada.close();
	}
}
