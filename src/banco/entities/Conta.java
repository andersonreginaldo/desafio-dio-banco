package banco.entities;

import banco.interfaces.ContaInterface;

public class Conta implements ContaInterface{
	
	private static final int AGENCIA_PADRAO = 0001;
	private static int SEQUENCIAL = 1;
	
	public Conta(Cliente cliente) {
		this.agencia = AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}
	
	protected Integer agencia;
	protected Integer numero;
	protected Double saldo = 0.0;
	protected Cliente cliente;
	
	public Integer getAgencia() {
		return agencia;
	}
	public Integer getNumero() {
		return numero;
	}
	public Double getSaldo() {
		return saldo;
	}
	@Override
	public void sacar(double valor) {
		saldo -= valor;
		
	}
	@Override
	public void depositar(double valor) {
		saldo += valor;
		
	}
	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
		
	}
	
	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
		System.out.println("\n");
	}
	@Override
	public void imprimirExtrato() {

		
	}
}
