package br.adriano.test;

import br.adriano.service.LeituraCSV;
/**
 * Teste de uso da classe LeituraCSV
 * em complemento com a classe Pessoa(POJO)
 * 
 * @author adriano
 *
 */
public class Teste {

	public static void main(String[] args) {
		
		LeituraCSV leitor = new LeituraCSV();
		leitor.lerDados();
		leitor.guardarDados();
		leitor.print();
		
		System.out.println(leitor.getPessoas());

	}

}
