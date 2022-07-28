package entidades;

public class Produtos {

	private String nomeProduto;
	private int quantidadeProduto;
	private double precoProduto;

	public Produtos() {
	}

	public Produtos(String nome, int quantidade, double preco) {
		nomeProduto = nome;
		quantidadeProduto = quantidade;
		precoProduto = preco;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public int getQuantidadeProduto() {
		return quantidadeProduto;
	}

	public void setQuantidadeProduto(int quantidadeProduto) {
		this.quantidadeProduto = quantidadeProduto;
	}

	public double getPrecoProduto() {
		return precoProduto;
	}

	public void setPrecoProduto(double precoProduto) {
		this.precoProduto = precoProduto;
	}

	public void inserirProdutos(int quantidade) {
		quantidadeProduto += quantidade;
	}

	public void removerProduto(int quantidade) {
		quantidadeProduto -= quantidade;
	}

	public double precoEmEstoqueProduto() {
		return quantidadeProduto * precoProduto;
	}

	public String exibirInformacao() {
		String nome = nomeProduto.toUpperCase();
		return "PRODUTO: " + nome + " ----- " + "QUANTIDADE: " + quantidadeProduto + " ----- "
				+ String.format("PREÇO POR UNIDADE: R$%.2f%n", precoProduto) + " ----- "
				+ String.format("PREÇO DA QUANTIDADE TOTAL: R$%.2f", precoEmEstoqueProduto());
	}
}
