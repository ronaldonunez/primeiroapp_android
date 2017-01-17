package br.pucminas.rnunez.primeiroapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import br.pucminas.rnunez.primeiroapp.exemplo0.PrimeiraActivity;
import br.pucminas.rnunez.primeiroapp.exemplo1.CalculadoraActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnExemplo0 = (Button) findViewById(R.id.btnExemplo0);
        btnExemplo0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                chamaExemplo0();
            }
        });

        Button btnExemplo1 = (Button) findViewById(R.id.btnExemplo1);
        btnExemplo1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                chamaExemplo1();
            }
        });

    }

    private void chamaExemplo0() {
        Intent intent = new Intent(this, PrimeiraActivity.class);
        startActivity(intent);
    }

    private void chamaExemplo1() {
        Intent intent = new Intent(this, CalculadoraActivity.class);
        startActivity(intent);
    }
}
