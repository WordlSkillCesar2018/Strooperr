package com.example.worldskills.stroop;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Juego extends AppCompatActivity {

    String[] colores = new String[] {"android.graphics.drawable.ColorDrawable@fbb1374",
            "#FF0022FF","#FFFF0004","#FF22FF00"};
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
        perdidas.setText("0");
        intentos.setText("3");
        ganadas.setText("0");
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
    @SuppressLint("NewApi")
    public void cambios(){
        String a = "android.graphics.drawable.ColorDrawable@fbb1374";
        if (a==colores[0]){

            Toast.makeText(this,btn1.getBackground().toString(),Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(this,"mal",Toast.LENGTH_LONG).show();

        }

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
                btn1.getBackground();
                intento--;
                perdida++;
                perdidas.setText(perdida);
                intentos.setText(intento);
            }
        }.start();
    }

}
