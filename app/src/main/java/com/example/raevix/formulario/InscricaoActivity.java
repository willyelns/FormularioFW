package com.example.raevix.formulario;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

import dominio.DadosBasicos;


public class InscricaoActivity extends Activity {

    DadosBasicos dados;
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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inscricao);

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
            Toast.makeText(getApplicationContext(),"Salva",Toast.LENGTH_SHORT).show();
        }
        if(id == R.id.action_cancelar){
            finish();
        }

        return super.onOptionsItemSelected(item);
    }
}
