package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Cliente;
import br.senai.sp.jandira.model.Conta;

public class App2 {

	public static void main(String[] args) {
		
		// Cria��o do Cliente
		Cliente pedro =new Cliente();
		pedro.setNome("Pedro �lvares Cabral");
		pedro.setTelefone("(11)9923-5807");
		pedro.setCpf("16111651561");
		pedro.setCep("0498484984");
		
		//Criar da conta do pedro
		Conta contaPedro = new Conta();
		contaPedro.setTitular(pedro);
		contaPedro.depositar(100);
		contaPedro.setNumero("2222-2");
		
		System.out.println(contaPedro.getTitular().getTelefone());
		contaPedro.getTitular().setNome("Pedro �lvares Cabral");
		System.out.println(contaPedro.getTitular().getNome());
	}
}
