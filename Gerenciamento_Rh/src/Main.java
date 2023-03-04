/*
O cálculo do salário é diferente para cada funcionário:
- Todo funcionário tem um salário base
- O engenheiro tem um adicional de 50% sobre o salário base
- O Gerente deve ter adicionado ao salário base o valor do bônus
- O presidente deve ter adicionado ao salário base o valor da sua cota de ações
 */
public class Main {
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