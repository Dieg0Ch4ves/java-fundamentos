package Annotations;

public class AnnotationInformacao {

	void visualizar() {
		System.out.println("Metodo de visuialização");
	}
	
	@Deprecated
	void exibir() {
		System.out.println("Mostrando que o metodo de exibir é deprecated");
	}
}
