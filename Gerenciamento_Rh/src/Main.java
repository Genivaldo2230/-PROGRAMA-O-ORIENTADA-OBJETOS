/*
O cálculo do salário é diferente para cada funcionário:
- Todo funcionário tem um salário base
- O engenheiro tem um adicional de 50% sobre o salário base
- O Gerente deve ter adicionado ao salário base o valor do bônus
- O presidente deve ter adicionado ao salário base o valor da sua cota de ações
 */
public class Main {
<<<<<<< HEAD
    public static void main(String[] args) {

    }
    private String funcionario; //- Funcionário: possui código e nome (abstrato)
    private int codigo;


    public Main(String funcionario, int codigo) {
        this.funcionario = funcionario;
        this.codigo = codigo;
    }

    public String getFuncionario() {
        return funcionario;
    }

    public int getCodigo() {
        return codigo;
    }




    public int getCota() {
        return cota;
    }





    private int cota;


}
=======

    public static void main(String[] args) {

        Funcionario funcionario;
        funcionario = new Funcionario();
        System.out.println(" funcionario ");


        var engenheiro = new Engenheiro();
        System.out.println(" Engenheiro ");

        var presidente = new Presidente();
        System.out.println(" Presidente ");

        var gerente = new Gerente();
        System.out.println(" Gerente ");
    }


}
>>>>>>> 38bbdcb (criaçã do codigo gerenciamento RH)
