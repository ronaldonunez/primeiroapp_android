package br.pucminas.rnunez.primeiroapp.exemplo1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import br.pucminas.rnunez.primeiroapp.R;

public class CalculadoraActivity extends AppCompatActivity {

    Button btnSomar;
    EditText edtNum1;
    EditText edtNum2;
    TextView txtResultadoXML;
    LinearLayout linearLayoutXML;
    LinearLayout linearLayoutPrincipal;

    LinearLayout linearLayoutResultadoJava;
    TextView txtResultado;
    TextView txtLabelResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        btnSomar = (Button) findViewById(R.id.btnSomar);
        edtNum1 = (EditText) findViewById(R.id.edtPrimeiroNumero);
        edtNum2 = (EditText) findViewById(R.id.edtSegundoNumero);
        linearLayoutXML = (LinearLayout) findViewById(R.id.linearResultadoXML);
        txtResultadoXML = (TextView) findViewById(R.id.txtResultadoXML);
        linearLayoutPrincipal = (LinearLayout) findViewById(R.id.linearLayoutPrincipal);

        //Interface Java
        //Criando um linearlayout para o resultado

        linearLayoutResultadoJava = new LinearLayout(this);
        linearLayoutResultadoJava.setOrientation(LinearLayout.HORIZONTAL);
        linearLayoutResultadoJava.setVisibility(LinearLayout.GONE);
        linearLayoutResultadoJava.setBackgroundColor(getResources().getColor(android.R.color.holo_blue_light));

        //Criando dois textViews para exibir o lbel resultado e o valor do resultad
        txtLabelResultado = new TextView(this);
        txtLabelResultado.setText("Resultado: ");
        txtResultado = new TextView(this);

        //Add no linearlayout os dois textviews
        linearLayoutResultadoJava.addView(txtLabelResultado);
        linearLayoutResultadoJava.addView(txtResultado);

        //Add linearLayout ao linearlayout principal
        linearLayoutPrincipal.addView(linearLayoutResultadoJava);

        btnSomar.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                efetuarSoma();
            }

        });

    }

    private void efetuarSoma() {
        String soma = getSoma();
        if (!soma.isEmpty()){
            linearLayoutXML.setVisibility(View.VISIBLE);
            txtResultadoXML.setText(soma);

            linearLayoutResultadoJava.setVisibility(View.VISIBLE);
            txtResultado.setText(soma);
        }
    }

    public String getSoma() {

        String valor1 = edtNum1.getText().toString();
        String valor2 = edtNum2.getText().toString();

        if (!valor1.isEmpty() && !valor2.isEmpty()){
            int num1 = Integer.parseInt(valor1);
            int num2 = Integer.parseInt(valor2);
            return String.valueOf(num1 + num2);
        } else {
            return "";
        }
    }
}
