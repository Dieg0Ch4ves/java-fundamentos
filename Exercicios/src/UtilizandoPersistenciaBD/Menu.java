package UtilizandoPersistenciaBD;

import java.util.List;

public class Menu {

	public static void main(String[] args) throws Exception {
		PessoaDao pd = new PessoaDao();
		try {
			
			List<Pessoa> listaDePessoas = pd.ListarPessoas();
			for (Pessoa p : listaDePessoas) {
				System.out.println("Código..: " + p.getIdPessoa());
				System.out.println("Nome..: " + p.getNomePessoa());
				System.out.println("email..: " + p.getEmail());
				System.out.println("----------------------");
			}
			/*
			//Incluir Pessoa
			Pessoa p1 = new Pessoa(3,"maria","maria@gmail.com");
			Pessoa p2 = new Pessoa(4,"ana","ana@gmail.com");
			pd.incluirPessoa(p1);
			pd.incluirPessoa(p2);
			*/
			/*
			//Alterar Pessoa
			Pessoa pes = pd.consultarPessoaIndividual(1);
			if(pes != null) {
				pes.setEmail("jose2@gmail.com");
				
				pd.alterarPessoa(pes);
				
				//Listando todas pessoas
				List<Pessoa> listaPessoa = pd.ListarPessoas();
				for(Pessoa p : listaPessoa) {
					System.out.println(p);
				}
			}
			*/
			/*
			//Excluir Pessoa
			Pessoa pes = pd.consultarPessoaIndividual(0);
			pd.excluirPessoa(pes);
			
			//Listando todas pessoas
			List<Pessoa> listaPessoa = pd.ListarPessoas();
			for(Pessoa p : listaPessoa) {
				System.out.println(p);
			}
			*/
		}catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		/*
		Pessoa pes1 = pd.consultarPessoaIndividual(1);
		System.out.println("Código...: " + pes1.getIdPessoa());
		System.out.println("Nome...: " + pes1.getNomePessoa());
		System.out.println("email...: " + pes1.getEmail());
		*/
	}
}