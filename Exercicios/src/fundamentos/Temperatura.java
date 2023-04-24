//Exercicio

package fundamentos;

public class Temperatura {
	
	public static void main(String[] args) {
		
		double F =  86.0 ;
		
		final double ajuste = F - 32.0;
		final double ResultadoDoCalculo = (ajuste) * 5.0/9.0; 
		
		System.out.println("A conversão de Graus Fahrenheits : "
		+ "de " + F + "F "+ " Para" + ResultadoDoCalculo + "C") ;
	}
}
