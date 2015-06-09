package Negocio;

import dominio.InscricaoEvento;

/**
 * Created by Will Xavier on 08/06/2015.
 */
public class ComprovanteInscricaoEvento implements ComprovanteFormularioInterface {

    private InscricaoEvento inscricao;

    public ComprovanteInscricaoEvento(InscricaoEvento inscricao) {
        this.inscricao = inscricao;
    }

    @Override
    public String gerarComprovante() {
        return "A inscricao: " + inscricao.getId() + " foi salva com sucesso";
    }
}
