package com.example.worldskills.stroop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Configurar extends AppCompatActivity {
    String tipo;
    TextView textView;
    EditText editText, editText2;
    int configurar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configurar);
        tipo= String.valueOf(getIntent().getExtras().getString("tipo"));
        textView=findViewById(R.id.textView);
        textView.setText(tipo);
        editText=findViewById(R.id.editText);
        editText2=findViewById(R.id.editText2);
        if (tipo.equals("Ingrese Limite de Tiempo")){
            editText.setHint("Ingrese tiempo en Milisegundos");
            configurar=1;
        }else{
            editText.setHint("Ingrese maximo numero de intentos");
            configurar=2;
        }

    }

    public void siguiente(View view) {
        //juego por tiempo
        if (configurar==1){
            String configuracion = editText.getText().toString();
            String tiempopalabra=editText2.getText().toString();
            Intent intent=new Intent(this, JuegoPersonalizado.class);
//            intent.putExtra("tipo",configurar);
            intent.putExtra("duracion", configuracion);
            intent.putExtra("tiempo", tiempopalabra);
            startActivity(intent);
        }else
            //juego por intentos
            if (configurar==2){
            String configuracion = editText.getText().toString();
            String tiempopalabra=editText2.getText().toString();
            Intent intent=new Intent(this, JuegoPersonalizado2.class);
//            intent.putExtra("tipo",configurar);
            intent.putExtra("intentos", configuracion);
            intent.putExtra("tiempo", tiempopalabra);
            startActivity(intent);
        }

    }
}
