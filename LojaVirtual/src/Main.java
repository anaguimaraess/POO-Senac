import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        var eletronicos = new Eletronico("celular",  new BigDecimal(2090.65), "Apple", "Iphone 8");
        System.out.println(eletronicos.dadosDoProduto());

        var livros = new Livro("Divergente", new BigDecimal(20.65), "Veronica Roth");
        System.out.println(livros.dadosDoProduto());

    }
}
