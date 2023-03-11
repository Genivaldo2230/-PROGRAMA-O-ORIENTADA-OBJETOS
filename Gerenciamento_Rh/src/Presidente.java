// Classe Presidente que herda de Funcionario

import java.math.BigDecimal;

public class Presidente extends Funcionario implements Autenticavel{

// Atributos especificos do presidente

    private double valorCotaAcoes;

// Construtor

    public Presidente(int codigo, String nome, double salarioBase, double valorCotaAcoes) {

        super(codigo, nome, salarioBase); // Chamando o construtor da classe pai

        this.valorCotaAcoes = valorCotaAcoes;

    }

// Getters e setters

    public double getValorCotaAcoes() {

        return valorCotaAcoes;

    }

    public void setValorCotaAcoes(double valorCotaAcoes) {

        this.valorCotaAcoes = valorCotaAcoes;

    }

// Metodo para calcular o salario final do presidente com adicao do valor da cota de acoes



    public double calcularSalario() {

        double getSalario = 0;
        final var getSalario1 = getSalario;
        return getSalario;
    }

    @Override
    public void autenticar() {
        System.out.println("Presidente Logado");

    }
}