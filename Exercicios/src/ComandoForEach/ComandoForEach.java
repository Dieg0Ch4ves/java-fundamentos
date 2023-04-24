package ComandoForEach;

public class ComandoForEach {

	public static void main(String[] args) {
		
		int[] vetorNumeros = new int[] {1,2,3,4,5,6,7,8,9,10};
		
		//Lendo SEM o Foreach
		System.out.println("Lendo sem o ForEach");
		for (int i = 0; i < vetorNumeros.length; i++) {
			System.out.println("Nr: " + vetorNumeros[i]);
		}
		
		//Lendo COM o Foreach
		System.out.println("Lendo com o ForEach");
		for (int nrNumeros : vetorNumeros) {
			System.out.println("Nr: " + nrNumeros);
		}
	}
}
