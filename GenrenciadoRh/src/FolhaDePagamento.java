import java.math.BigDecimal;
import java.security.PublicKey;

public class FolhaDePagamento {
    public double getTotalDaFolhaDePagamento() {
        return totalDaFolhaDePagamento;
    }

    private double totalDaFolhaDePagamento = 0;

    public void registrar(Funcionario funcionario){
        totalDaFolhaDePagamento = totalDaFolhaDePagamento+funcionario.calcularSalario();

    }

    public void login(Autenticavel autenticavel){
        autenticavel.autenticar();
    }
}
