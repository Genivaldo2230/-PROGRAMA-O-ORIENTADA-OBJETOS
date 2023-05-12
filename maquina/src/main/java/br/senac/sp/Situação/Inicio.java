package br.senac.sp.Situação;

import br.senac.sp.model.Estado;

public class Inicio extends Situacao {

    @Override
    public Estado verificarEstado() {
        return Estado.INICIO;
    }
    
}
