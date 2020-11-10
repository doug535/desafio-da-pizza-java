package aula09;

/**
 * classe para calcular se vale ou não apena comprar a pizza 
 * 
 * @author Douglas
 *
 */

public class calculo {

	/**
	 * variaveis precisas
	 */
	
	private double tamanhoP;
	private double preco;
	private String nomeP;
	private double PI = 3.1416;
	
	public calculo(double tamanhoP, double preco, String nomeP) {
		 
		this.tamanhoP = tamanhoP;
		
		this.preco = preco;
		
		this.nomeP = nomeP;
	
	}
	
	
	public double getNome() {
	
		return tamanhoP;
	
	}
	
	public void setNome(String nome) {
	
		this.tamanhoP = tamanhoP;
	
	}
	
	public double getPreco() {
	
		return preco;
	
	}
	
	public void setPreco(double preco) {
	
		this.preco = preco;
	
	}
	
	public String getNomeP() {
	
		return nomeP;
	
	}
	
	public void setNomeP(String nomeP) {
	
		this.nomeP = nomeP;
	
	}
	
	
}
