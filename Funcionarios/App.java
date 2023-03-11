import java.math.BigDecimal;

public class App {
    public static void main(String[] args) {
        var v1 = new Presidente(new BigDecimal(321),
                "juninho",
                new BigDecimal(50000),
                new BigDecimal(430));
        System.out.println(v1.calcularSalario());

        var v2 = new Engenheiro(new BigDecimal(321),
                "maria",
                new BigDecimal(3220),
                "engenharia",
                "creazinha1290");
        System.out.println(v2.calcularSalario());

        var v3 = new Gerente(new BigDecimal(321),
                "cleia",
                new BigDecimal(6000),
                "areatop",
                new BigDecimal(214));
        System.out.println(v3.calcularSalario());

        FolhaPagamento folhaPagamento = new FolhaPagamento();
        folhaPagamento.registrar(v1);
        folhaPagamento.registrar(v2);
        folhaPagamento.registrar(v3);
        folhaPagamento.login(v1);
        folhaPagamento.login(new Auditor());
        folhaPagamento.login(v3);



        System.out.println(folhaPagamento.getTotalFolhaDePagamento());
    }

}
