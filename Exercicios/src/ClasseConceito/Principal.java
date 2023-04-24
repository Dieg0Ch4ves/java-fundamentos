package ClasseConceito;

public class Principal {

	public static void main(String[] args) {
		
		Pessoa pes = new Pessoa();
		
		pes.nomePessoa = "João";
		pes.idadePessoa = 15 ;
		
		pes.mostrarDados(pes.nomePessoa, pes.idadePessoa);
	}

}
