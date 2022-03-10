package exercicios;

public class testaCliente {

	public static void main(String[] args) {
		
		ex1cliente cliente1 = new ex1cliente();
		ex1cliente cliente2 = new ex1cliente();
		
		cliente1.setNome("Lucas");
		cliente1.setIdade(22);
		cliente1.setProduto ("Boné");
		
		cliente2.setNome ("tereza");
		cliente2.setIdade (32);
		cliente2.setProduto("Batom");
		
		cliente1.pegaProduto(cliente1.getNome(), cliente1.getIdade());
		cliente1.pagarproduto(cliente1.getNome(), cliente1.getProduto());
		
		cliente2.pegaProduto(cliente2.getNome(), cliente2.getIdade());
		cliente2.pagarproduto(cliente2.getNome(), cliente2.getProduto());
	}

}
