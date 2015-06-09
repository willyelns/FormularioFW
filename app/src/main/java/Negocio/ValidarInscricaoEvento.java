package Negocio;

import dominio.InscricaoEvento;

/**
 * Created by Will Xavier on 08/06/2015.
 */
public class ValidarInscricaoEvento implements ValidarFormularioInterface {

    private InscricaoEvento inscricao;

    public ValidarInscricaoEvento(InscricaoEvento inscricao) {
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
