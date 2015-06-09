package dominio;

import Negocio.ValidarInscricaoPreVenda;

/**
 * Created by Will Xavier on 08/06/2015.
 */
public class InscricaoPreVenda implements InscricaoInterface {

    private PreVenda resposta;
    private int id;

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
        boolean retorno;
        ValidarInscricaoPreVenda validator = new ValidarInscricaoPreVenda(this);
        if(validator.dadosValidos()){
            if(validator.validaInscricao()){
                retorno = true;
            }else{
                retorno = false;
            }
        }else{
            retorno = false;
        }
        return retorno;
    }

    @Override
    public String gerarComprovante() {
        return null;
    }

    public PreVenda getResposta() {
        return resposta;
    }

    public void setResposta(PreVenda resposta) {
        this.resposta = resposta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
