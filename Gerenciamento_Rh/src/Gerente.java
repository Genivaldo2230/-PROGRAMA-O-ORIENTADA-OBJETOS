import java.math.BigDecimal;

// Classe Gerente que herda de Funcionario
public class Gerente extends Funcionario implements Autenticavel{

    // Atributos especificos do gerente
    private String area;
    private double bonus;

    // Construtor
    public Gerente(int codigo, String nome, double salarioBase, String area,
                   double bonus) {
        super(codigo,nome, (salarioBase)); // Chamando o construtor da classe pai
        this.area=area;
        this.bonus=bonus;
    }

    // Getters e setters
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area=area;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus=bonus;
    }

    // Metodo para calcular o salario final do gerente com adicao do bonus
    @Override
    public double calcularSalario() {
        return getSalarioBase()+getBonus();
    }

    @Override
    public void autenticar() {
        System.out.println("Gerente Logado");

    }
}