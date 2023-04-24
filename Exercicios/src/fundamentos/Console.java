package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		System.out.print("Bom");
		System.out.print("Dia");

		System.out.println("Bom");
		System.out.println("Dia");

		System.out.printf("MegaSena: %d %d %d %d %d %d %n", 1, 2, 3, 4, 5, 6);
		System.out.printf("Salario: %.1f.%n", 1234.5678);
		System.out.printf("Nome: %s%n", "João");

		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite seu nome: ");
		String nome = entrada.nextLine();

		System.out.print("Digite seu Sobrenome: ");
		String sobrenome = entrada.nextLine();

		System.out.print("Digite sua idade: ");
		int idade = entrada.nextInt();

//Outra forma de fazer System.out.println("Nome: " + nome + " " + sobrenome
//				+ "\n Idade: " + idade + " Anos");

		System.out.printf("%s %s tem %d anos.%n", nome, sobrenome, idade);

		entrada.close();
	}

}
