package com.cursoandroid.componentesbasicos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private EditText campoNome;
    private TextInputEditText campoEmail;
    private TextView textoResultado;

    private CheckBox checkAzul, checkRoxo, checkRosa;

    private RadioButton sexoMasculino;
    private RadioButton sexoFeminino;
    private RadioGroup opcaoSexo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        campoNome = findViewById(R.id.editNome);
        campoEmail = findViewById(R.id.editEmail);
        textoResultado = findViewById(R.id.editResultado);

        checkAzul = findViewById(R.id.checkAzul);
        checkRoxo = findViewById(R.id.checkRoxo);
        checkRosa = findViewById(R.id.checkRosa);

        sexoMasculino = findViewById(R.id.radioButtonM);
        sexoFeminino = findViewById(R.id.radioButtonF);
        opcaoSexo = findViewById(R.id.radioGroup);

        radioButton();
    }

    public void checkBox(){
        String texto = "";

        if(checkAzul.isChecked()){
            texto = "Azul selecionado ";
        }

        if(checkRoxo.isChecked()){
            texto = texto + "Roxo selecionado ";
        }

        if(checkRosa.isChecked()){
            texto = texto + "Rosa selecionado ";
        }

        textoResultado.setText(texto);
    }

    public void radioButton() {
        opcaoSexo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {

                if(checkedId == R.id.radioButtonM) {
                    textoResultado.setText("Masculino");
                } else {
                    textoResultado.setText("Feminino");
                }
            }
        });
    }

    public void enviar(View view) {

        // radioButton();
        // checkBox();
    }
}