public class Main {
    public static void main(String[] args) {
        var eletronicos = new Eletronicos("celular", 2900.10, "Apple", "Iphone 8");
        System.out.println(eletronicos.dadosDoProduto());

        var livros = new Livros("Divergente", 65.90, "Veronica Roth");
        System.out.println(livros.dadosDoProduto());

    }
}
