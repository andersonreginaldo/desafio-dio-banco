package banco;

import banco.entities.Cliente;
import banco.entities.Conta;
import banco.entities.ContaCorrente;
import banco.entities.ContaPoupanca;

public class Main {

	public static void main(String[] args) {

		Cliente anderson = new Cliente("Anderson Reginaldo");
		
		Conta cc = new ContaCorrente(anderson);
		Conta poupanca = new ContaPoupanca(anderson);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
		cc.depositar(100);
		cc.transferir(50, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

	}

}
