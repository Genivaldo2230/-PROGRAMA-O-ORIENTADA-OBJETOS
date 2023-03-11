<<<<<<< HEAD
public class Gerente {
=======
public class Gerente extends Funcionario{
    private String area;
    private double bonus;

    public Gerente() {

    }

    //Construtor
    public void gerente() {

    }

    public Gerente(int codigo, String nome, double salarioBase, String area, double bonus) {
        super();
        this.area = area;
        this.bonus = bonus;
    }

    // GETTERS E SETTERS
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    // Nesse metodo pra calcular o bonus do gerente usando @Overrider pra rescrever o salario  acrecenta bonus

    @Override
    public double calcularSalario() {
        return calcularSalario() + getBonus();
    }
>>>>>>> 38bbdcb (criaçã do codigo gerenciamento RH)
}
