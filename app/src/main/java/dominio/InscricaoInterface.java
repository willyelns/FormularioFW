package dominio;

/**
 * Created by Will Xavier on 08/06/2015.
 */
public interface InscricaoInterface {
    public boolean salvarInscricao();
    public boolean deletarInscricao();
    public boolean editarInscricao();
    public boolean validarInscricao();
    public String gerarComprovante();
}
