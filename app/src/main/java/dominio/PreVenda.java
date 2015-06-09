package dominio;

/**
 * Created by Will Xavier on 03/06/2015.
 */
public class PreVenda extends Usuario {

    private String numeroCartaoCredito;
    private String senha;
    private String numeroCompra;

    public PreVenda(String nome, String sobrenome, String email, String rg, String telefone, Endereco endereco, String numeroCartaoCredito, String senha, String numeroCompra) {
        super(nome, sobrenome, email, rg, telefone, endereco);
        this.numeroCartaoCredito = numeroCartaoCredito;
        this.senha = senha;
        this.numeroCompra = numeroCompra;
    }

    public String getNumeroCartaoCredito() {
        return numeroCartaoCredito;
    }

    public void setNumeroCartaoCredito(String numeroCartaoCredito) {
        this.numeroCartaoCredito = numeroCartaoCredito;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNumeroCompra() {
        return numeroCompra;
    }

    public void setNumeroCompra(String numeroCompra) {
        this.numeroCompra = numeroCompra;
    }
}
