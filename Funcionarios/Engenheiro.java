import java.math.BigDecimal;

public class Engenheiro extends Funcionario {
    private String departamento;
    private String crea;

    public Engenheiro(BigDecimal codigo, String nome, BigDecimal salario, String departamento, String crea) {
        super(codigo, nome, salario);
        this.departamento = departamento;
        this.crea = crea;
    }

    public Engenheiro() {
    }

    @Override
    public BigDecimal calcularSalario() {
        return getSalario().add(getSalario().multiply(BigDecimal.valueOf(0.5)));
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getCrea() {
        return crea;
    }

}
