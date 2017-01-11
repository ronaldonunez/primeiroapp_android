package br.pucminas.rnunez.primeiroapp.exemplo0;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import br.pucminas.rnunez.primeiroapp.R;

public class PrimeiraActivity extends DebugActivity {

    Button btnSegundaTela;
    EditText edtParamIda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primeira);

        btnSegundaTela = (Button) findViewById(R.id.btnSegundaTela);
        edtParamIda = (EditText) findViewById(R.id.edtParamIda);

        btnSegundaTela.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                chamarSegundaTela();
            }

        });

    }

    private void chamarSegundaTela() {
        Intent intent = new Intent(this, SegundaActivity.class);
        intent.putExtra("PARAM_IDA", edtParamIda.getText().toString());
        startActivity(intent);
    }
}
