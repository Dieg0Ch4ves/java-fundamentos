package GenericsCourse;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		Aeronaves air = new Aeronaves();
		
		System.out.print("Informe quantas Aeronaves estão no patio: ");
		int nrAeronaves = entrada.nextInt();
		
		for (int i = 0; i < nrAeronaves; i++) {
			System.out.print("Digite o numero do voo: ");
			int nrVoos = entrada.nextInt();
			air.addVoo(nrVoos);
		}
		
		System.out.println("O primeiro voo será: " + air.primeiroVoo());
		System.out.println(air.listaAeronaves);
		entrada.close();
	}
}
