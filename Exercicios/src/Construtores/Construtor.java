package Construtores;

import Construtores.Aluno.MATRICULA;
import Construtores.Aluno.STATUS;

public class Construtor {

	public static void main(String[] args) {
		
		Aluno alu = new Aluno(8 , 5 , 5);
		
		
		double mediaAlunoFinal = alu.calcularMedia();
		
		if(mediaAlunoFinal >= 6) { 
			alu.situacaoAluno = STATUS.APROVADO; 
		} else {
			alu.situacaoAluno = STATUS.REPROVADO;
		}
	
		
		System.out.println("O aluno tem a média de " + mediaAlunoFinal + " e ele está " + alu.situacaoAluno);
	
		alu.situacaoMatricula = MATRICULA.MATRICULADO;
		System.out.println("O aluno está " + alu.situacaoMatricula);
	}
}
