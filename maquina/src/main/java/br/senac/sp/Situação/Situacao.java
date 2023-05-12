package br.senac.sp.Situação;

import br.senac.sp.model.Estado;
import br.senac.sp.model.Maquina;

public abstract class Situacao {

        public abstract Estado verificarEstado();
    
        public void creditoInsuficiente(Maquina pedido) {
            throw new RuntimeException("Não pode mudar para creditoInsuficiente");
        }
    
        public void creditoSuficiente(Maquina pedido) {
            throw new RuntimeException("Não pode mudar para situação creditoSuficiente");
        }
    
        public void Pagar(Maquina pedido) {
            throw new RuntimeException("Não pode mudar para situação pago");
    
        }
}
