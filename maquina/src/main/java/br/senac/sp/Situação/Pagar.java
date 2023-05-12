package br.senac.sp.Situação;

import br.senac.sp.model.Estado;

public class Pagar extends Situacao {

    @Override
    public Estado verificarEstado() {
        return Estado("Pago");
        
    }

    private Estado Estado(String string) {
        return null;
    }
    
}

    
