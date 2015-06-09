package com.example.raevix.formulario;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

import dominio.Aluno;
import dominio.DadosBasicos;
import dominio.Endereco;
import dominio.InscricaoAluno;


public class InscricaoAlunoActivity extends Activity {

    InscricaoAluno inscricao;
    EditText nome;
    EditText sobrenome;
    EditText email;
    EditText rg;
    EditText cpf;
    EditText telefone;
    EditText rua;
    EditText numero;
    EditText bairro;
    EditText cidade;
    EditText estado;
    EditText complemento;
    EditText nacionalidade;
    EditText sexo;
    EditText diploma;
    EditText reservista;
    EditText curriculoLattes;
    EditText declaracao;
    EditText certificados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inscricao_aluno);

        nome = (EditText) findViewById(R.id.editNome);
        sobrenome = (EditText) findViewById(R.id.editSobrenome);
        email = (EditText) findViewById(R.id.editEmail);
        rg = (EditText) findViewById(R.id.editRg);
        cpf = (EditText) findViewById(R.id.editCpf);
        telefone = (EditText) findViewById(R.id.editTelefone);
        rua = (EditText) findViewById(R.id.EditRua);
        numero = (EditText) findViewById(R.id.EditNumero);
        bairro = (EditText) findViewById(R.id.EditBairro);
        cidade = (EditText) findViewById(R.id.EditEstado);
        estado = (EditText) findViewById(R.id.EditEstado);
        complemento = (EditText) findViewById(R.id.EditComplemento);
        nacionalidade = (EditText) findViewById(R.id.EditNacionalidade);
        sexo = (EditText) findViewById(R.id.EditSexo);
        diploma = (EditText) findViewById(R.id.EditDiploma);
        reservista = (EditText) findViewById(R.id.EditReservista);
        curriculoLattes = (EditText) findViewById(R.id.EditCurriculo);
        declaracao = (EditText) findViewById(R.id.EditDeclaracao);
        certificados = (EditText) findViewById(R.id.EditCertificado);
    }
    public void criaInscricao(){
        String nomeString = nome.getText().toString();
        String sobrenomeString = sobrenome.getText().toString();
        String emailString = email.getText().toString();
        String rgString = rg.getText().toString();
        Endereco endereco = new Endereco(rua.getText().toString(),numero.getText().toString(),complemento.getText().toString(),bairro.getText().toString(),
        cidade.getText().toString(),estado.getText().toString());
        Aluno aluno = new Aluno(nomeString,sobrenomeString,emailString,rgString,telefone.getText().toString(),endereco,nacionalidade.getText().toString()
        ,reservista.getText().toString(),sexo.getText().toString(),diploma.getText().toString(),curriculoLattes.getText().toString(),declaracao.getText().toString()
        ,certificados.getText().toString());
        inscricao = new InscricaoAluno(aluno, 00010);
    }
    public void validarDados(){
        if(nome.getText().toString() == null){
            nome.setError("Preencha este Campo");
        }if(sobrenome.getText().toString() == null) {
            sobrenome.setError("Preencha este Campo");
        }if(email.getText().toString() == null) {
            email.setError("Preencha este Campo");
        }if(rg.getText().toString() == null) {
            rg.setError("Preencha este Campo");
        }if(cpf.getText().toString() == null) {
            cpf.setError("Preencha este Campo");
        }if(telefone.getText().toString() == null) {
            telefone.setError("Preencha este Campo");
        }if(rua.getText().toString() == null) {
            rua.setError("Preencha este Campo");
        }if(bairro.getText().toString() == null) {
            bairro.setError("Preencha este Campo");
        }if(complemento.getText().toString() == null) {
            complemento.setError("Preencha este Campo");
        }if(numero.getText().toString() == null) {
            numero.setError("Preencha este Campo");
        }if(cidade.getText().toString() == null) {
            cidade.setError("Preencha este Campo");
        }if(estado.getText().toString() == null) {
            estado.setError("Preencha este Campo");
        }if(nacionalidade.getText().toString() == null) {
            nacionalidade.setError("Preencha este Campo");
        }if(diploma.getText().toString() == null) {
            diploma.setError("Preencha este Campo");
        }if(sexo.getText().toString() == null) {
            sexo.setError("Preencha este Campo");
        }if(reservista.getText().toString() == null) {
            reservista.setError("Preencha este Campo");
        }if(curriculoLattes.getText().toString() == null) {
            curriculoLattes.setError("Preencha este Campo");
        }if(declaracao.getText().toString() == null) {
            declaracao.setError("Preencha este Campo");
        }if(certificados.getText().toString() == null) {
            certificados.setError("Preencha este Campo");
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_inscricao, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_salvar) {
            //salva e volta ao menu.
            validarDados();
            Toast.makeText(getApplicationContext(), "Salva", Toast.LENGTH_SHORT).show();
        }
        if(id == R.id.action_cancelar){
            finish();
        }

        return super.onOptionsItemSelected(item);
    }
}