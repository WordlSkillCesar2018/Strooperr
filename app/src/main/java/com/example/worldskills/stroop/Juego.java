package com.example.worldskills.stroop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Juego extends AppCompatActivity {

    String[] colores = new String[] {"#FFFFF200","#FF0022FF","#FFFF0004","#FF22FF00"};
    String[] colortext = new String[]{"Amarillo","Azul","Rojo","Verde"};
    TextView texto,tiempo,intentos,ganadas,irestantes;
    int random = (int) (Math.random()*4);
    Button btn1,btn2,btn3,btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego);
        texto = findViewById(R.id.textocolor);
        texto.setText(colortext[random]);
        btn1 = findViewById(R.id.)
    }

    public void color1(View view) {
    }

    public void color2(View view) {
    }

    public void color3(View view) {
    }

    public void color4(View view) {
    }

    public void cambios(){

    }
}
