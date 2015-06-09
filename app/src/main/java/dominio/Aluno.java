package dominio;

/**
 * Created by Will Xavier on 03/06/2015.
 */
public class Aluno extends DadosBasicos{

    private String nacionalidade;
    private String reservista;
    private String sexo;
    private String diploma;
    private String curriculoLattes;
    private String declaracaoConcurso;
    private String certificados;

    public Aluno(String nome, String sobrenome, String email, String rg, String telefone, Endereco endereco, String nacionalidade, String reservista, String sexo,String diploma, String curriculoLattes, String declaracaoConcurso, String certificados) {
        super(nome, sobrenome, email, rg, telefone, endereco);
        this.nacionalidade = nacionalidade;
        this.reservista = reservista;
        this.sexo = sexo;
        this.diploma = diploma;
        this.curriculoLattes = curriculoLattes;
        this.declaracaoConcurso = declaracaoConcurso;
        this.certificados = certificados;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getReservista() {
        return reservista;
    }

    public void setReservista(String reservista) {
        this.reservista = reservista;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDiploma() {
        return diploma;
    }

    public void setDiploma(String diploma) {
        this.diploma = diploma;
    }

    public String getCurriculoLattes() {
        return curriculoLattes;
    }

    public void setCurriculoLattes(String curriculoLattes) {
        this.curriculoLattes = curriculoLattes;
    }

    public String getDeclaracaoConcurso() {
        return declaracaoConcurso;
    }

    public void setDeclaracaoConcurso(String declaracaoConcurso) {
        this.declaracaoConcurso = declaracaoConcurso;
    }

    public String getCertificados() {
        return certificados;
    }

    public void setCertificados(String certificados) {
        this.certificados = certificados;
    }
}
