import java.math.BigDecimal;

/*
O cálculo do salário é diferente para cada funcionário:
- Todo funcionário tem um salário base
- O engenheiro tem um adicional de 50% sobre o salário base
- O Gerente deve ter adicionado ao salário base o valor do bônus
- O presidente deve ter adicionado ao salário base o valor da sua cota de ações
 */
public class Main {
    public static void main(String[] args) {
        Funcionario joao = new Presidente(12,"João",5,10000);
        joao.calcularSalario();
        if(joao instanceof Presidente){
            System.out.println("João é Presidente");
        }
        Funcionario pedro = new Engenheiro(22,"Pedro",8000);

        var lucas =new Engenheiro(012,"Guilhemer",1500);
        System.out.println(lucas.calcularSalario());

        var gabriel =new Gerente(11,"Pedro",10000,"Comercial",5600);
        System.out.println(pedro.calcularSalario());

        var paulo = new Presidente(01,"Genivaldo",14500,6500);
        System.out.println(paulo.calcularSalario());

        var folhaDePagamneto = new FolhaDePagamento();
        folhaDePagamneto.registrar(paulo);
        folhaDePagamneto.login(paulo);
        folhaDePagamneto.login(gabriel);
        folhaDePagamneto.login(new Auditor());
        System.out.println(folhaDePagamneto.getTotalDaFolhaDePagamento());

    }
}