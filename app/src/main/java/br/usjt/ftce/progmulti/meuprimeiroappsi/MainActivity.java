package br.usjt.ftce.progmulti.meuprimeiroappsi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //conecta layout
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view) {
        //conecta os campos
        EditText text = (EditText)findViewById(R.id.edit_message);
        //pegar o que esta escrito no campo
        String message = text.getText().toString();
       System.out.println(message);

    }
}
