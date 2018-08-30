package com.example.worldskills.stroop;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Juego extends AppCompatActivity {

    String[] colores = new String[] {"#FFFFF200","#FF0022FF","#FFFF0004","#FF22FF00"};
    String[] colortext = new String[]{"Amarillo","Azul","Rojo","Verde"};
    TextView texto,tiempo,intentos,ganadas,perdidas;
    int random = (int) (Math.random()*4);
    Button btn1,btn2,btn3,btn4;
    CountDownTimer countDownTimer,countDownTimer1;
    int aciertos;
    int perdida;
    int intento;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego);
        texto = findViewById(R.id.textocolor);
        tiempo = findViewById(R.id.textView);
        ganadas = findViewById(R.id.textView3);
        perdidas = findViewById(R.id.textView4);
        intentos = findViewById(R.id.textView2);
        texto.setText(colortext[random]);
        btn1 = findViewById(R.id.button4);
        btn2 = findViewById(R.id.button2);
        btn3 = findViewById(R.id.button);
        btn4 = findViewById(R.id.button3);
        duraciondecambio();
        duraciontiempocompleto();
    }

    public void color1(View view) {
        cambios();
    }

    public void color2(View view) {
        cambios();
    }

    public void color3(View view) {
        cambios();
    }

    public void color4(View view) {
        cambios();
    }

    public void cambios(){

    }

    public void duraciontiempocompleto(){
        countDownTimer = new CountDownTimer(30000,10) {
            @Override
            public void onTick(long l) {
                tiempo.setText(" "+l/10);
            }

            @Override
            public void onFinish() {

            }
        }.start();
    }

    public void duraciondecambio(){
        countDownTimer1 = new CountDownTimer(3000,10) {
            @Override
            public void onTick(long l) {

            }

            @Override
            public void onFinish() {
                perdida--;
            }
        }.start();
    }
}
