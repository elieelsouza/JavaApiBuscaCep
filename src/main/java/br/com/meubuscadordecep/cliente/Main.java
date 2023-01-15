package br.com.meubuscadordecep.cliente;

import br.com.meubuscadordecep.dominio.Endereco;
import br.com.meubuscadordecep.viacep.ServicoDeCep;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		System.out.println("Informe o CEP: ");
		String cep = new Scanner(System.in).nextLine();
		Endereco endereco = ServicoDeCep.buscaEnderecoPelo(cep);
		
		System.out.println("Logradouro: " + endereco.getLogradouro());
		System.out.println("Bairro: " + endereco.getBairro());
		System.out.println("Cidade: " + endereco.getLocalidade());
		System.out.println("População média: " + endereco.getQtdPopulacao());
	}

}
