import java.math.BigDecimal;

public final class Presidente extends Funcionario implements Autenticavel {
    private BigDecimal valorCotaAcoes;

    public Presidente(BigDecimal codigo, String nome, BigDecimal salario, BigDecimal valorCotaAcoes) {
        super(codigo, nome, salario);
        this.valorCotaAcoes = valorCotaAcoes;
    }

    public BigDecimal getValorCotaAcoes() {
        return valorCotaAcoes;
    }

    public void setValorCotaAcoes(BigDecimal valorCotaAcoes) {
        this.valorCotaAcoes = valorCotaAcoes;
    }

    @Override
    public BigDecimal calcularSalario() {
        return getSalario().add(valorCotaAcoes);
    }

    @Override
    public void autenticar() {
        System.out.println("Presidente logado");
    }
}
