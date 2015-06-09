package dominio;

import Negocio.ComprovanteInscricaoAluno;
import Negocio.ValidarInscricaoAluno;

/**
 * Created by Will Xavier on 08/06/2015.
 */
public class InscricaoAluno implements InscricaoInterface {

    private Aluno resposta;
    private int id;

    public InscricaoAluno(Aluno resposta, int id) {
        this.resposta = resposta;
        this.id = id;
    }

    @Override
    public boolean salvarInscricao() {
        return false;
    }

    @Override
    public boolean deletarInscricao() {
        return false;
    }

    @Override
    public boolean editarInscricao() {
        return false;
    }

    @Override
    public boolean validarInscricao() {
        //Chamar o validar
        boolean retorno;
        ValidarInscricaoAluno validator = new ValidarInscricaoAluno(this);
        if(validator.dadosValidos()){
            if(validator.validaInscricao()){
                retorno = true;
            }
            else{
                retorno = false;
            }
        }else{
            retorno = false;
        }
        return retorno;
    }

    @Override
    public String gerarComprovante() {
        ComprovanteInscricaoAluno comprovante = new ComprovanteInscricaoAluno(this);
        return comprovante.gerarComprovante();
    }

    public Aluno getResposta() {
        return resposta;
    }

    public void setResposta(Aluno resposta) {
        this.resposta = resposta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
