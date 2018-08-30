package com.example.worldskills.stroop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class Personalizado extends AppCompatActivity {
    RadioButton radioButton1, radioButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personalizado);
        radioButton1=findViewById(R.id.radioButton);
        radioButton2=findViewById(R.id.radioButton2);
    }

    public void Siguiente(View view) {
        if (radioButton1.isChecked()){
            Intent limite=new Intent(this, Configurar.class);
            limite.putExtra("tipo", "Ingrese Limite de Tiempo");
            startActivity(limite);
        }else if (radioButton2.isChecked()){
            Intent intentos=new Intent(this, Configurar.class);
            intentos.putExtra("tipo", "Ingrese Numero de Intentos");
            startActivity(intentos);
        }
        else {
            Toast.makeText(this,"Seleccione una opcion", Toast.LENGTH_SHORT).show();
        }
    }
}
