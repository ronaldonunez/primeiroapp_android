package br.pucminas.rnunez.primeiroapp.exemplo5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.List;

import br.pucminas.rnunez.primeiroapp.R;

public class SpinnerListActivity extends AppCompatActivity {

    final String[] options = new String[]{"ListView simples","ListView customizado"};
    final String[] planets = new String[]{"Mercurio","Venus", "Terra", "Marte", "Netuno", "Saturno",
            "Jupiter"};

    private Spinner spinnerChoices;
    private ListView listViewPlanets;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner_list);

        listViewPlanets = (ListView) findViewById(R.id.listViewPlanets);

        spinnerChoices = (Spinner) findViewById(R.id.spinnerChoice);
        ArrayAdapter<String> spinnerAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, options);
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerChoices.setAdapter(spinnerAdapter);
        spinnerChoices.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),
                        "Selecionado: " + spinnerChoices.getSelectedItem().toString(),
                        Toast.LENGTH_LONG).show();

                if (position == 0){
                    makeSimpleAdapterListView();
                } else {
                    makeCustomAdapterListView();
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


    }

    private void makeCustomAdapterListView() {
        final AdapterPlanets adapterPlanets = new AdapterPlanets(this, Planet.getPlanets());
        listViewPlanets.setAdapter(adapterPlanets);

        listViewPlanets.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "TESTE", Toast.LENGTH_SHORT).show();
            }
        });

    }

    private void makeSimpleAdapterListView() {
        final ArrayAdapter<String> simpleListViewAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, planets);
        listViewPlanets.setAdapter(simpleListViewAdapter);

        listViewPlanets.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String planet = simpleListViewAdapter.getItem(position);
                Toast.makeText(getApplicationContext(), planet, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
