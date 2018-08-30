package com.example.worldskills.stroop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class JuegoPersonalizado extends AppCompatActivity {
    int configurar;
    TextView textView1, textView2, numero, tiempo;
    String numer, time;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego_personalizado);
        textView1=findViewById(R.id.textViewtiempo);
        textView2=findViewById(R.id.textViewintentos);
        numero=findViewById(R.id.numero);
        tiempo=findViewById(R.id.tiempo);

        numer=String.valueOf(getIntent().getExtras().getString("tipo"));
        time=String.valueOf(getIntent().getExtras().getString("tiempo"));
        tiempo.setText(time);
        numero.setText(numer);
        configurar=Integer.parseInt(String.valueOf(getIntent().getExtras().getInt("tipo")));

        if (configurar == 1){
            textView1.setVisibility(View.VISIBLE);
        }else {
            textView2.setVisibility(View.VISIBLE);
        }
    }
}
