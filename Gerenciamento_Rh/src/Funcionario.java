public class Funcionario {
    //Atributos para criação das classetodo funcionario tem
    private int codigo;
    private String nome;
    private double salarioBase;

    //Construtor


    public Funcionario(int codigo, String nome, double salarioBase) {
        this.codigo = codigo;
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public Funcionario() {
        this.codigo = codigo;
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {

        this.codigo = codigo;
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double calcularSalario() //Metodo Abstrato pra calcular o salrio final de cada funcionario
    {
        return 0;
    }
}
