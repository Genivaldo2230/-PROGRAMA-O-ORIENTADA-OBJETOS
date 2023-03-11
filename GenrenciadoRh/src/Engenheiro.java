// Classe Engenheiro que herda de Funcionario
public class Engenheiro extends Funcionario {

    // Atributos especificos do engenheiro
    private Departamento departamento;
    private String crea;



    // Construtor
    public Engenheiro(int codigo, String nome, double salarioBase) {
        super(codigo, nome, salarioBase); // Chamando o construtor da classe pai
        this.departamento = departamento;
        this.crea = crea;
    }

    // Getters e setters
    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public String getCrea() {
        return crea;
    }

    public void setCrea(String crea) {
        this.crea = crea;
    }

    // Metodo para calcular o salario final do engenheiro com adicional de 50%
    @Override
    public double calcularSalario() {
        return getSalarioBase() * 1.5;
    }
}
