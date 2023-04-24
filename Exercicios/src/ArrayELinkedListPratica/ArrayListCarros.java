package ArrayELinkedListPratica;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ArrayListCarros {
	
	public static void main(String[] args) {
		
		//Criando um ArrayList de Carros
		ArrayList<String> carros = new ArrayList<>();
		
		//Adicionando Carros Ao ArrayList
		carros.add("FLUENCE");
		carros.add("KOMBI");
		carros.add("JAGUAR");
		carros.add("BMW");
		carros.add("MERCEDES");
		carros.add("FUSCA");
		carros.add("VECTRA");
		carros.add("SANDERO");
		
		//Mostrar o Array
		System.out.println(carros);
		
		//Substituindo MERCEDES por MITSUBISHI
		carros.set(4, "MITSUBISHI");
		
		//Array depois do SET
		System.out.println(carros);
		
		//Remover o VECTRA
		carros.remove("VECTRA");
		// OU carros.remove(6);
		
		//Array depois do REMOVE
		System.out.println(carros);
		
		//Adicionando carro novo conforme o usuario digitar(JOPtionPane)
		carros.add(JOptionPane.showInputDialog("Informe a marca de um carro"));
		
		//Array depois do usúario digitar
		System.out.println(carros);
		
		//Esvaziando o Array
		carros.clear();
		
		//Array depois de CLEAR
		System.out.println(carros);
		
		//Verificar Se o array está vazio
		if(carros.isEmpty()) {
			System.out.println("O vetor está vazio");
		}
		
		if(carros.contains("BMW M3")) {
			for (int i = 0; i < carros.size(); i++) {
				if("BMW M3".equals(carros.get(i))) {
					carros.set(i, "BUGATTI");
					break;
				}
			}
		} else {
			System.out.println("Não encontrei o argumento pesquisado");
		}
		
		//Array depois de CONTER BMW
		System.out.println(carros);
	}
}
