package br.senac.sp.Situação;

import br.senac.sp.model.Estado;

public class CreditoInsuficiente extends Situacao {

    @Override
    public Estado verificarEstado(){
        return Estado("CREDITO INSUFICIENTE");
    }

    private Estado Estado(String string) {
        return null;
    }
    
}
