public class Camisa {
// Atributos da classe Camisa
	private String tamanho;
	private String modelo;
	private String Cor;
	private int shirtId;
    private String descricao;
    private double preco;
/*
*  Metodos da classe Camisa
*  Chamamos de métodos pois ele esta totalmente ligado a uma classe
*  Conceito de Encapsulamento
*  Atributos privados
*/
	public void setTamanho(String tamanho) {
        // Vai receber um tamanho que vai atribuir o tamanho da classe
		this.tamanho = tamanho;
	}
	public String getTamanho() {
		// Vai retornar o tamanho da classe
		return this.tamanho;
	}
	public void setModelo(String modelo) {
        this.modelo = modelo;
	}
	public String getModelo() {
		return this.modelo;
	}
	public void setCor(String Cor) {
        this.Cor = Cor;
	}
	public String getCor() {
		return this.Cor;
	}
	public void setId(int shirtId) {
        this.shirtId = shirtId;
	}
	public int getId() {
		return this.shirtId;
	}
    public void setDescricao(String descricao) {
        this.descricao = descricao;
	}
	public String getDescricao() {
		return this.descricao;
	}
    public void setPreco(double preco) {
        this.preco = preco;
	}
	public double getPreco() {
		return this.preco;
	}
}
