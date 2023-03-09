import java.math.BigDecimal;

public final class Presidente extends Funcionario {
    private BigDecimal valorCotaAcoes;

    public Presidente(BigDecimal codigo, String nome, BigDecimal salario, BigDecimal valorCotaAcoes) {
        super(codigo, nome, salario);
        this.valorCotaAcoes = valorCotaAcoes;
    }

    public Presidente() {
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
}
