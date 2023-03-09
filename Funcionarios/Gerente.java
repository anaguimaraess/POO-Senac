import java.math.BigDecimal;

public class Gerente extends Funcionario {
    private String area;
    private BigDecimal bonus;

    public Gerente(BigDecimal codigo, String nome, BigDecimal salario, String area, BigDecimal bonus) {
        super(codigo, nome, salario);
        this.area = area;
        this.bonus = bonus;
    }

    public Gerente() {
    }

    @Override
    public BigDecimal calcularSalario() {
        return getSalario().add(bonus);
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public BigDecimal getBonus() {
        return bonus;
    }

    public void setBonus(BigDecimal bonus) {
        this.bonus = bonus;
    }
}
