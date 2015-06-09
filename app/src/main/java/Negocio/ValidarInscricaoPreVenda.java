package Negocio;

import dominio.InscricaoPreVenda;

/**
 * Created by Will Xavier on 08/06/2015.
 */
public class ValidarInscricaoPreVenda implements ValidarFormularioInterface {

    private InscricaoPreVenda inscricao;

    public ValidarInscricaoPreVenda(InscricaoPreVenda inscricao) {
        this.inscricao = inscricao;
    }


    @Override
    public boolean validaInscricao() {
        return false;
    }

    @Override
    public boolean dadosValidos() {
        return false;
    }
}
