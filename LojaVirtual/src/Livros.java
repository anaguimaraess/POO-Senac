public class Livros extends Produtos {
    private String autor;

    public Livros(String nome, double preco, String autor) {
        super(nome, preco);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String dadosDoProduto() {
        String dadosLivros = "\nAutor: " + autor + "\n";
        return super.dadosDoProduto() + dadosLivros;
    }
}
