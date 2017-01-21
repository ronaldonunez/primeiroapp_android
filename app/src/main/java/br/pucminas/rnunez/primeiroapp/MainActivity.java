package br.pucminas.rnunez.primeiroapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import br.pucminas.rnunez.primeiroapp.exemplo0.PrimeiraActivity;
import br.pucminas.rnunez.primeiroapp.exemplo1.CalculadoraActivity;
import br.pucminas.rnunez.primeiroapp.exemplo2.LayoutInflaterActivity;
import br.pucminas.rnunez.primeiroapp.exemplo3.RecursosActivity;

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

        Button btnExemplo2 = (Button) findViewById(R.id.btnExemplo2);
        btnExemplo2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                chamaExemplo2();
            }
        });

        Button btnExemplo3 = (Button) findViewById(R.id.btnExemplo3);
        btnExemplo3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                chamaExemplo3();
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

    private void chamaExemplo2() {
        Intent intent = new Intent(this, LayoutInflaterActivity.class);
        startActivity(intent);
    }

    private void chamaExemplo3() {
        Intent intent = new Intent(this, RecursosActivity.class);
        startActivity(intent);
    }

}
