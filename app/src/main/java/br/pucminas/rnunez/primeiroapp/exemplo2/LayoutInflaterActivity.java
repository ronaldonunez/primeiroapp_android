package br.pucminas.rnunez.primeiroapp.exemplo2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

import br.pucminas.rnunez.primeiroapp.R;

public class LayoutInflaterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_inflater);

        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayoutPrincipal);

        LayoutInflater inflater = LayoutInflater.from(this);
        LinearLayout linearLayoutInflate = (LinearLayout) inflater.inflate(R.layout.layout_test_inflate,
                relativeLayout, false);

        relativeLayout.addView(linearLayoutInflate);

        Button btnPlay = (Button) relativeLayout.findViewById(R.id.btnPlay);

        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fazAlgumaCoisa();
            }
        });
    }

    private void fazAlgumaCoisa() {

        Toast.makeText(this, "Clicou em Play", Toast.LENGTH_LONG).show();

    }
}
