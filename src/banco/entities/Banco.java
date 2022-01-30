package banco.entities;

import java.util.List;

public class Banco {

	private String nome;
	private Integer numeroAgencia;
	private List<Conta> contas;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getNumeroAgencia() {
		return numeroAgencia;
	}
	public void setNumeroAgencia(Integer numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}
	public List<Conta> getContas() {
		return contas;
	}
	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}
	
	
}
