package Negocio;

import dominio.InscricaoPreVenda;

/**
 * Created by Will Xavier on 08/06/2015.
 */
public class ComprovanteInscricaoPreVenda implements ComprovanteFormularioInterface{

    private InscricaoPreVenda inscricao;

    public ComprovanteInscricaoPreVenda(InscricaoPreVenda inscricao) {
        this.inscricao = inscricao;
    }

    @Override
    public String gerarComprovante() {
        return "A inscri\u00e7\u00e3o: " + inscricao.getId() + " para a Pr\u00e9-Venda foi salva com sucesso!";
    }
}
