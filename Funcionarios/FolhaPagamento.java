import java.math.BigDecimal;

public class FolhaPagamento {
    private BigDecimal totalFolhaDePagamento = BigDecimal.ZERO;

    public BigDecimal getTotalFolhaDePagamento() {
        return totalFolhaDePagamento;
    }

    public void registrar(Funcionario funcionario){
        totalFolhaDePagamento = totalFolhaDePagamento.add(funcionario.calcularSalario());
    }

    public void login(Autenticavel funcionarioAutenticavel){
        funcionarioAutenticavel.autenticar();
    }

}
