package fundamentos.operadores;

public class DesafioLogicos {

	public static void main(String[] args) {
		
		boolean trabalho1 = true;
		boolean trabalho2 = true;
		
		boolean tv50 = trabalho1 && trabalho2;
		boolean tv32 = trabalho1 ^ trabalho2;
		boolean sorvete = tv32 || tv50;
		boolean maisSaudavel = !sorvete;
	
		System.out.println("Comprou Tv 32\"?" + tv32);
		System.out.println("Comprou Tv 50\"?" + tv50);
		System.out.println("Comprou sorvete\"?" + sorvete);
		System.out.println("Ficou mais saudavel\"?" + maisSaudavel);
	}
}
