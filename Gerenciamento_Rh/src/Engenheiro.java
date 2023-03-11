<<<<<<< HEAD
public class Engenheiro {
=======
public class Engenheiro extends Funcionario {
    private String departamento;
    private String crea;

    public Engenheiro() {
        super();
    }

    //constritor
    public void Engenheiro() {

    }

    public Engenheiro(int codigo, String nome, double salarioBase, String departamento, String crea) {
        super();
        this.departamento = departamento;
        this.crea = crea;
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

    public void setCrea(String crea) {
        this.crea = crea;
    }

    // Nesse metodo estou calculando o salario do Engenheiro com acreciom de 50% usando  pra reescrever o @Override
    @Override
    public double calcularSalario() {
        return getSalarioBase() * 1.5;
    }
>>>>>>> 38bbdcb (criaçã do codigo gerenciamento RH)
}
