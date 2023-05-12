package br.senac.sp.Situação;

import br.senac.sp.model.Estado;

public class Cancelar extends Situacao  {

    @Override
    public Estado verificarEstado() {
       return Estado.CREDITO_SUFICIENTE;
       }
    }

