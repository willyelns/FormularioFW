package com.example.raevix.formulario;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;


public class BlankFormActivity extends Activity {
    private LinearLayout layout;
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
        EditText texto = new EditText(this);
        texto.setHint("Novo Campo");
        texto.setId(campoId++);
        texto.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        layout.addView(texto);
    }
    /*public void validarNovoCampo(){

        for(int campo = campoId;campo > 0; campo--){
            EditText textoTemporario = (EditText) findViewById(campo);
            if(textoTemporario.getText().toString() == null){
                textoTemporario.setError("O campo: " + textoTemporario.getHint().toString() + "est\u00e1 vazio.");
            }
        }
    }*/

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
           // validarNovoCampo();
        }

        return super.onOptionsItemSelected(item);
    }
}
