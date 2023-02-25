public class Eletronicos extends Produtos {
    private String marca;
    private String modelo;

    public Eletronicos(String nome, double preco, String marca, String modelo) {
        super(nome, preco);
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String dadosDoProduto() {
        String dadosEletronico = "\nMarca: " + marca + "\nModelo: " + modelo + "\n";
        return super.dadosDoProduto() + dadosEletronico;
    }
}
