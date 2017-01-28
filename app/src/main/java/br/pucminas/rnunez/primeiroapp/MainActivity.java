package br.pucminas.rnunez.primeiroapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.List;

import br.pucminas.rnunez.primeiroapp.exemplo0.PrimeiraActivity;
import br.pucminas.rnunez.primeiroapp.exemplo1.CalculadoraActivity;
import br.pucminas.rnunez.primeiroapp.exemplo2.LayoutInflaterActivity;
import br.pucminas.rnunez.primeiroapp.exemplo3.RecursosActivity;
import br.pucminas.rnunez.primeiroapp.exemplo4.ComponentesActivity;
import br.pucminas.rnunez.primeiroapp.exemplo5.SpinnerListActivity;

public class MainActivity extends AppCompatActivity {

    String[] examplesList;
    ListView lstExamples;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        examplesList = getResources().getStringArray(R.array.str_array_examples);
        lstExamples = (ListView) findViewById(R.id.lstExamples);

        ArrayAdapter<String> examplesAdapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, examplesList);

        lstExamples.setAdapter(examplesAdapter);
        lstExamples.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        chamaExemplo0();
                        break;
                    case 1:
                        chamaExemplo1();
                        break;
                    case 2:
                        chamaExemplo2();
                        break;
                    case 3:
                        chamaExemplo3();
                        break;
                    case 4:
                        chamaExemplo4();
                        break;
                    case 5:
                        chamaExemplo5();
                        break;
                }
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

    private void chamaExemplo4() {
        Intent intent = new Intent(this, ComponentesActivity.class);
        startActivity(intent);
    }

    private void chamaExemplo5() {
        Intent intent = new Intent(this, SpinnerListActivity.class);
        startActivity(intent);
    }

}
