package dominio;

/**
 * Created by Will Xavier on 08/06/2015.
 */
public class FormularioAluno implements Formulario {
    private Aluno perguntas;


    @Override
    public Formulario gerarFormulario() {
        return this;
    }
}
