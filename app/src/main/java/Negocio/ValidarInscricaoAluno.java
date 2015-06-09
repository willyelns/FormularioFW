package Negocio;

import dominio.Formulario;
import dominio.InscricaoAluno;
import dominio.InscricaoInterface;

/**
 * Created by Will Xavier on 08/06/2015.
 */
public class ValidarInscricaoAluno implements ValidarFormularioInterface {

    private InscricaoAluno inscricao;

    public ValidarInscricaoAluno(InscricaoAluno inscricao) {
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
