package com.example.worldskills.stroop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Configurar extends AppCompatActivity {
    String tipo;
    TextView textView;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configurar);
        tipo= String.valueOf(getIntent().getExtras().getString("tipo"));
        textView=findViewById(R.id.textView);
        textView.setText(tipo);
        editText=findViewById(R.id.editText);
        if (tipo.equals("Ingrese Limite de Tiempo")){
            editText.setText("Ingrese tiempo en Milisegundos");
        }else{
            editText.setText("Ingrese maximo numero de intentos");
        }

    }
}
