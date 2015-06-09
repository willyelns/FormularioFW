package dominio;

import Negocio.ComprovanteInscricaoEvento;
import Negocio.ValidarInscricaoEvento;

/**
 * Created by Will Xavier on 08/06/2015.
 */
public class InscricaoEvento implements InscricaoInterface {

    private Evento resposta;
    private int id;

    public InscricaoEvento(Evento resposta, int id) {
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
        boolean retorno;
        ValidarInscricaoEvento validator = new ValidarInscricaoEvento(this);
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
        ComprovanteInscricaoEvento comprovante = new ComprovanteInscricaoEvento(this);
        return comprovante.gerarComprovante();
    }

    public Evento getResposta() {
        return resposta;
    }

    public void setResposta(Evento resposta) {
        this.resposta = resposta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
