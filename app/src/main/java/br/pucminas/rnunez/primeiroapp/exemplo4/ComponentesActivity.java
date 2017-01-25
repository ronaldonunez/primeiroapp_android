package br.pucminas.rnunez.primeiroapp.exemplo4;

import android.support.annotation.StringDef;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;

import br.pucminas.rnunez.primeiroapp.R;

public class ComponentesActivity extends AppCompatActivity {

    private CheckBox chkWindows;
    private CheckBox chkIos;
    private CheckBox chkAndroid;

    private RadioGroup rdGenderGroup;
    private Switch swtNotifications;
    private Button btnValues;

    private EditText edtPasswd;
    private EditText edtAddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_componentes);

        chkWindows = (CheckBox) findViewById(R.id.chkWindows);
        chkIos = (CheckBox) findViewById(R.id.chkIos);
        chkAndroid = (CheckBox) findViewById(R.id.chkAndroid);

        rdGenderGroup = (RadioGroup) findViewById(R.id.rdGenderGroup);
        swtNotifications = (Switch) findViewById(R.id.swtNotifications);
        btnValues = (Button) findViewById(R.id.btnValues);

        edtPasswd = (EditText) findViewById(R.id.edtPasswd);
        edtAddress = (EditText) findViewById(R.id.edtAddress);

        chkWindows.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(getApplicationContext(), "Windows pressionado", Toast.LENGTH_SHORT).show();
            }
        });

        chkIos.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(getApplicationContext(), "iOS pressionado", Toast.LENGTH_SHORT).show();
            }
        });

        chkAndroid.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(getApplicationContext(), "Android pressionado", Toast.LENGTH_SHORT).show();
            }
        });

        rdGenderGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                String strGender;

                if(checkedId == R.id.rdFemale){
                    strGender = "Feminino";
                } else {
                    strGender = "Masculino";
                }

                Toast.makeText(getApplicationContext(), strGender, Toast.LENGTH_SHORT).show();
            }
        });

        swtNotifications.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                String strNotifications = "Notificações " + String.valueOf(isChecked);
                Toast.makeText(getApplicationContext(), strNotifications, Toast.LENGTH_SHORT).show();
            }
        });

        btnValues.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), String.format(
                        "Sistemas Operacionais (W,I,A):\n %s \n\n" + 
                                "Sexo: %s",
                        getCheckBoxSelected(),
                        getRadioButtonSelected()
                ), Toast.LENGTH_LONG).show();
            }
        });

    }

    public String getCheckBoxSelected() {
        String checkBoxSelected = String.valueOf(chkWindows.isChecked()) +
                " " + String.valueOf(chkIos.isChecked()) +
                " " + String.valueOf(chkAndroid.isChecked());

        return checkBoxSelected;
    }

    public String getRadioButtonSelected() {
        String radioButtonSelected = (rdGenderGroup.getCheckedRadioButtonId() == R.id.rdFemale) ? "Feminino" : "Masculino";
        return radioButtonSelected;
    }
}
