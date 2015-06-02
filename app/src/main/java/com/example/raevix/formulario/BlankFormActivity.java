package com.example.raevix.formulario;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.text.InputType;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.Toast;


public class BlankFormActivity extends Activity {
    private LinearLayout layout;
    private AlertDialog dialog;
    private int campoId = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blank_form);
        layout = (LinearLayout) findViewById(R.id.InnerLayout);
    }

    public void novoCampo(View v){
        EditText texto = new EditText(this);
        texto.setHint("Novo Campo");
        texto.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        layout.addView(texto);

    }
    public void criarNovoCampo(){
        exibirDialog();
    }
    public void criarCampoNormal(String hint){
        EditText texto = new EditText(this);
        texto.setHint(hint);
        texto.setId(campoId++);
        texto.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        layout.addView(texto);
    }
    //Metodo para Criar campos com apenas números.
    public void criarCampoNumero(String hint){
        EditText numero = new EditText(this);
        numero.setInputType(InputType.TYPE_CLASS_NUMBER);
        numero.setId(campoId++);
        numero.setHint(hint);
        numero.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        layout.addView(numero);
    }

    public void exibirDialog(){
        LayoutInflater inflater = getLayoutInflater();
        View view = inflater.inflate(R.layout.custom_dialog,null);
        final Button confirmar = (Button) view.findViewById(R.id.btnConfirma);
        final Button cancelar = (Button) view.findViewById(R.id.btnCancel);
        final RadioButton tipoNumero = (RadioButton) view.findViewById(R.id.RadioNum);
        final RadioButton tipoNormal = (RadioButton) view.findViewById(R.id.RadioNumLetr);
        final EditText nomeCampo = (EditText) view.findViewById(R.id.EditNomeCampo);

        cancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dialog.dismiss();
            }
        });

        confirmar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(tipoNumero.getText().toString() == null || tipoNormal.getText().toString() == null){
                    Toast.makeText(getApplicationContext(),"O Tipo n\u00e3o foi escolhido",Toast.LENGTH_LONG).show();
                }
                if(tipoNumero.getText().toString() != null){
                    criarCampoNumero(nomeCampo.getText().toString());
                    dialog.dismiss();
                }
                if(tipoNormal.getText().toString() != null){
                    criarCampoNormal(nomeCampo.getText().toString());
                    dialog.dismiss();
                }
            }
        });
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Criando Novo Campo");
        builder.setView(view);
        dialog = builder.create();
        dialog.show();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_blank_form, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_cancelar) {
            finish();
        }
        if(id == R.id.action_addCampo){
            criarNovoCampo();
        }
        if(id == R.id.action_salvar){
            criarCampoNumero("Numero");
           // validarNovoCampo();
        }

        return super.onOptionsItemSelected(item);
    }
}
