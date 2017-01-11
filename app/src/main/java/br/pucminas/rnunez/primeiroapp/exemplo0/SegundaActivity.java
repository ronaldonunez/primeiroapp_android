package br.pucminas.rnunez.primeiroapp.exemplo0;

import android.os.Bundle;
import android.widget.TextView;

import br.pucminas.rnunez.primeiroapp.R;

public class SegundaActivity extends DebugActivity {

    TextView txtParamRecebido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        txtParamRecebido = (TextView) findViewById(R.id.txtParametroRecebido);

        Bundle extras = getIntent().getExtras();
        txtParamRecebido.setText(extras.getString("PARAM_IDA"));
    }
}
