package br.pucminas.rnunez.primeiroapp.exemplo3;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import br.pucminas.rnunez.primeiroapp.R;

public class RecursosActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recursos);

        TextView txtTexto = (TextView) findViewById(R.id.txtTexto);
        txtTexto.setTextColor(ContextCompat.getColor(this,R.color.green));
        txtTexto.setText("Imagem:");
    }
}
