package exercicios;

public class ex1cliente {
	private String nome; 
	private String produto;
	private int idade;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	void pegaProduto(String nome,int idade){
		System.out.println(nome+" de "+idade+" anos esta pegando um produto...");
	}
	
	void pagarproduto(String nome,String produto){
		System.out.println(nome+" pegou um/uma "+produto+" e efetuou o pagamento");
	}
	
	
}
