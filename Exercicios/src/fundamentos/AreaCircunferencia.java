package fundamentos;

public class AreaCircunferencia {
	
	public static void main(String[] args) {
		double raio = 3.4;
		final double pi = 3.14159;
		
		
		double area = raio * pi * raio;
		System.out.println(area);
		
		raio = 10; 
		
		System.out.println("Area = " + area + "m2.");
		
	}
}
