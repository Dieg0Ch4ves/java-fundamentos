package controle;

public class For2 {

	public static void main(String[] args) {
		
		//For com uma condicional
		for (int i = 1; i <= 10 ; i++) {
			System.out.println(i + "° vez");
			if(i == 5) {
				System.out.println("Parei na " + i + "° vez" );
				break;
			}
		}
	}
}