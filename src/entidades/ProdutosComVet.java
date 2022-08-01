package entidades;

public class ProdutosComVet {

	private int codigoProduto;
	private String nomeProduto;
	private int quantidadeProduto;
	private double precoProduto;

	public ProdutosComVet() {
	}

	public ProdutosComVet(int codigoProduto, String nome, int quantidade, double preco) {
		this.codigoProduto = codigoProduto;
		nomeProduto = nome;
		quantidadeProduto = quantidade;
		precoProduto = preco;
	}

	public int getCodigoProduto() {
		return codigoProduto;
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
		return "CODIGO DO PRODUTO: " + codigoProduto + " ----- " 
				+ "PRODUTO: " + nome + " ----- " + "QUANTIDADE: " + quantidadeProduto + " ----- "
				+ String.format("PREÇO POR UNIDADE: R$%.2f%n", precoProduto) + " ----- "
				+ String.format("PREÇO DA QUANTIDADE TOTAL: R$%.2f", precoEmEstoqueProduto());
	}
}
