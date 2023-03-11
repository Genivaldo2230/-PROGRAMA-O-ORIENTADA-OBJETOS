<<<<<<< HEAD
public class Presidente {
=======
public final class Presidente extends Funcionario {
    private  double  ValorCotaAcoes;

    //Construtor
    public Presidente(int codigo, String nome, double salarioBase, double valorCotaAcoes) {
        super();
        ValorCotaAcoes = valorCotaAcoes;
    }

    public Presidente() {

    }

    // GETTERS E SETTERS

    public double getValorCotaAcoes() {
        return ValorCotaAcoes;
    }

    public void setValorCotaAcoes(double valorCotaAcoes) {
        ValorCotaAcoes = valorCotaAcoes;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase();
    }
>>>>>>> 38bbdcb (criaçã do codigo gerenciamento RH)
}
