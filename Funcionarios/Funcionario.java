import java.math.BigDecimal;

public abstract class Funcionario {
    private BigDecimal codigo;
    private String nome;
    private BigDecimal salario;

    public Funcionario() {
    }

    public void setCodigo(BigDecimal codigo) {
        this.codigo = codigo;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public Funcionario(BigDecimal codigo, String nome, BigDecimal salario) {
        this.codigo = codigo;
        this.nome = nome;
        this.salario = salario;
    }

    public BigDecimal getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract BigDecimal calcularSalario();

}
