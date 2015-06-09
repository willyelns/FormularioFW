package Negocio;

import dominio.InscricaoAluno;

/**
 * Created by Will Xavier on 08/06/2015.
 */
public class ComprovanteInscricaoAluno implements ComprovanteFormularioInterface {

    private InscricaoAluno inscricao;

    public ComprovanteInscricaoAluno(InscricaoAluno inscricao) {
        this.inscricao = inscricao;
    }

    @Override
    public String gerarComprovante() {
        return "Aluno: "+inscricao.getResposta().getNome() +" " + inscricao.getResposta().getSobrenome() + " Comprovante de n\u00famero: " + inscricao.getId();
    }
}
