package com.example.worldskills.stroop;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Juego extends AppCompatActivity {

    String[] colores = new String[] {"yellow","blue","red","green"};
    String[] colortext = new String[]{"Amarillo","Azul","Rojo","Verde"};
    TextView texto,tiempo,intentos,ganadas,perdidas,comparar;
    Button btn1,btn2,btn3,btn4;
    CountDownTimer countDownTimer,countDownTimer1;
    int aciertos;
    int perdida;
    int intento=3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego);
        texto = findViewById(R.id.textocolor);
        tiempo = findViewById(R.id.textView);
        ganadas = findViewById(R.id.textView3);
        perdidas = findViewById(R.id.textView4);
        intentos = findViewById(R.id.textView2);
        texto.setText(colortext[0]);
        btn1 = findViewById(R.id.button4);
        btn2 = findViewById(R.id.button2);
        btn3 = findViewById(R.id.button);
        btn4 = findViewById(R.id.button3);
        duraciondecambio();
        duraciontiempocompleto();
        perdidas.setText("Perdidos: 0");
        intentos.setText("Intentos: 3");
        ganadas.setText("Ganadas: 0");
       texto.setTextColor(Color.parseColor(colores[0]));
       comparar = findViewById(R.id.textView6);
       comparar.setText(colores[0]);
       setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    }

    public void color1(View view) {
        String comparacion = comparar.getText().toString();
        int Random = (int) (Math.random() * 3);
        int Rando = (int) (Math.random() * 3);
        int Randon = (int) (Math.random()*4);
        if (comparacion.equals("yellow")){
            aciertos++;
            countDownTimer1.cancel();
            duraciondecambio();
            texto.setText(colortext[Random]);
            texto.setTextColor(Color.parseColor(colores[Rando]));
            comparar.setText(colores[Rando]);
            aciertos++;
            ganadas.setText("Ganadas: "+aciertos);
            perdidas.setText("Perdidos: "+perdida);
            intentos.setText("Intentos: "+intento);
        }else{
            if (perdida>2) {
                Intent intent = new Intent(Juego.this,Resultado.class);
                intent.putExtra("ganada",aciertos);
                intent.putExtra("perdida",perdida);
                intent.putExtra("intentos",intento);
                startActivity(intent);
                countDownTimer.cancel();
                countDownTimer1.cancel();
            }else{
                countDownTimer1.cancel();
                texto.setText(colortext[Random]);
                texto.setTextColor(Color.parseColor(colores[Rando]));
                comparar.setText(colores[Rando]);
                String a,b;
                intento--;
                perdida++;
                a=String.valueOf(intento);
                b=String.valueOf(perdida);
                perdidas.setText("Perdidos: "+a);
                intentos.setText("Intentos: "+b);
                duraciondecambio();
            }
        }
        if (Randon==1){
            cambioposicion1();
        }else if (Randon==2){
            cambioposicion2();
        }else if (Randon==3){
            cambioposicion3();
        }else if (Randon==4){
            cambioposicion4();
        }
    }

    public void color2(View view) {
        String comparacion = comparar.getText().toString();
        int Random = (int) (Math.random() * 3);
        int Rando = (int) (Math.random() * 3);
        int Randon = (int) (Math.random()*4);
        if (comparacion.equals("blue")){
            aciertos++;
            countDownTimer1.cancel();
            duraciondecambio();
            texto.setText(colortext[Random]);
            texto.setTextColor(Color.parseColor(colores[Rando]));
            comparar.setText(colores[Rando]);
            aciertos++;
            ganadas.setText("Ganadas: "+aciertos);
            perdidas.setText("Perdidos: "+perdida);
            intentos.setText("Intentos: "+intento);
        }else{
            if (perdida>2) {
                Intent intent = new Intent(Juego.this,Resultado.class);
                intent.putExtra("ganada",aciertos);
                intent.putExtra("perdida",perdida);
                intent.putExtra("intentos",intento);
                startActivity(intent);
                countDownTimer.cancel();
                countDownTimer1.cancel();
            }else{
                countDownTimer1.cancel();
                intento--;
                perdida++;
                texto.setText(colortext[Random]);
                texto.setTextColor(Color.parseColor(colores[Rando]));
                comparar.setText(colores[Rando]);
                String a,b;
                a=String.valueOf(intento);
                b=String.valueOf(perdida);
                perdidas.setText("Perdidos: "+a);
                intentos.setText("Intentos: "+b);
                duraciondecambio();
            }
        }
        if (Randon==1){
            cambioposicion1();
        }else if (Randon==2){
            cambioposicion2();
        }else if (Randon==3){
            cambioposicion3();
        }else if (Randon==4){
            cambioposicion4();
        }
    }

    public void color3(View view) {
        String comparacion = comparar.getText().toString();
        int Random = (int) (Math.random() * 3);
        int Rando = (int) (Math.random() * 3);
        int Randon = (int) (Math.random()*4);
        if (comparacion.equals("red")){
            aciertos++;
            countDownTimer1.cancel();
            duraciondecambio();
            texto.setText(colortext[Random]);
            texto.setTextColor(Color.parseColor(colores[Rando]));
            comparar.setText(colores[Rando]);
            aciertos++;
            ganadas.setText("Ganadas: "+aciertos);
            perdidas.setText("Perdidos: "+perdida);
            intentos.setText("Intentos: "+intento);
        }else{
            if (perdida>2) {
                Intent intent = new Intent(Juego.this,Resultado.class);
                intent.putExtra("ganada",aciertos);
                intent.putExtra("perdida",perdida);
                intent.putExtra("intentos",intento);
                startActivity(intent);
                countDownTimer.cancel();
                countDownTimer1.cancel();
            }else{
                countDownTimer1.cancel();
                texto.setText(colortext[Random]);
                texto.setTextColor(Color.parseColor(colores[Rando]));
                comparar.setText(colores[Rando]);
                String a,b;
                intento--;
                perdida++;
                a=String.valueOf(intento);
                b=String.valueOf(perdida);
                perdidas.setText("Perdidos: "+a);
                intentos.setText("Intentos: "+b);
                duraciondecambio();
            }
        }
        if (Randon==1){
            cambioposicion1();
        }else if (Randon==2){
            cambioposicion2();
        }else if (Randon==3){
            cambioposicion3();
        }else if (Randon==4){
            cambioposicion4();
        }
    }

    public void color4(View view) {
        String comparacion = comparar.getText().toString();
        int Random = (int) (Math.random() * 3);
        int Rando = (int) (Math.random() * 3);
        int Randon = (int) (Math.random()*4);
        if (comparacion.equals("green")){
            aciertos++;
            countDownTimer1.cancel();
            duraciondecambio();
            texto.setText(colortext[Random]);
            texto.setTextColor(Color.parseColor(colores[Rando]));
            comparar.setText(colores[Rando]);
            aciertos++;
            ganadas.setText("Ganadas: "+aciertos);
            perdidas.setText("Perdidos: "+perdida);
            intentos.setText("Intentos: "+intento);
        }else{
            if (perdida>2) {
                Intent intent = new Intent(Juego.this,Resultado.class);
                intent.putExtra("ganada",aciertos);
                intent.putExtra("perdida",perdida);
                intent.putExtra("intentos",intento);
                startActivity(intent);
                countDownTimer.cancel();
                countDownTimer1.cancel();
            }else{
                countDownTimer1.cancel();
                texto.setText(colortext[Random]);
                texto.setTextColor(Color.parseColor(colores[Rando]));
                comparar.setText(colores[Rando]);
                intento--;
                perdida++;
                String a,b;
                a=String.valueOf(intento);
                b=String.valueOf(perdida);
                perdidas.setText("Perdidos: "+a);
                intentos.setText("Intentos: "+b);
                duraciondecambio();
            }
        }
        if (Randon==1){
            cambioposicion1();
        }else if (Randon==2){
            cambioposicion2();
        }else if (Randon==3){
            cambioposicion3();
        }else if (Randon==4){
            cambioposicion4();
        }
    }

    public void cambioposicion1(){
        float a = (float) 24.000;
        float b = (float) 574.500;
        float c = (float) 261.000;
        float d = (float) 466.500;
        btn1.setX(a);
        btn1.setY(b);
        btn2.setX(a);
        btn2.setY(d);
        btn3.setX(c);
        btn3.setY(d);
        btn4.setX(c);
        btn4.setY(b);

    }

    public void cambioposicion2(){
        float a = (float) 24.000;
        float b = (float) 574.500;
        float c = (float) 261.000;
        float d = (float) 466.500;
        btn1.setX(c);
        btn1.setY(d);
        btn2.setX(a);
        btn2.setY(d);
        btn3.setX(c);
        btn3.setY(b);
        btn4.setX(a);
        btn4.setY(b);
    }

    public void cambioposicion3(){
        float a = (float) 24.000;
        float b = (float) 574.500;
        float c = (float) 261.000;
        float d = (float) 466.500;
        btn1.setX(a);
        btn1.setY(d);
        btn2.setX(c);
        btn2.setY(d);
        btn3.setX(a);
        btn3.setY(b);
        btn4.setX(c);
        btn4.setY(b);
    }

    public void cambioposicion4(){
        float a = (float) 24.000;
        float b = (float) 574.500;
        float c = (float) 261.000;
        float d = (float) 466.500;
        btn1.setX(c);
        btn1.setY(d);
        btn2.setX(c);
        btn2.setY(b);
        btn3.setX(a);
        btn3.setY(b);
        btn4.setX(a);
        btn4.setY(d);
    }

    public void duraciontiempocompleto(){
        countDownTimer = new CountDownTimer(30000,10) {
            @Override
            public void onTick(long l) {
                tiempo.setText(" "+l/10);
            }

            @Override
            public void onFinish() {
                Intent intent = new Intent(Juego.this,Resultado.class);
                intent.putExtra("ganada",aciertos);
                intent.putExtra("perdida",perdida);
                intent.putExtra("intentos",intento);
                startActivity(intent);
                countDownTimer1.cancel();
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
                int Randon = (int) (Math.random()*4);
                intento--;
                perdida++;
                String a,b;
                a=String.valueOf(perdida);
                b=String.valueOf(intento);
                perdidas.setText("Perdidos: "+a);
                intentos.setText("Intentos: "+b);
                countDownTimer1.cancel();
                    if (perdida>2){
                        Intent intent = new Intent(Juego.this,Resultado.class);
                        intent.putExtra("ganada",aciertos);
                        intent.putExtra("perdida",perdida);
                        intent.putExtra("intentos",intento);
                        startActivity(intent);
                       countDownTimer.cancel();
                       countDownTimer1.cancel();
                       finish();
                    }else{
                        duraciondecambio();
                    }

                if (Randon==1){
                    cambioposicion1();
                }else if (Randon==2){
                    cambioposicion2();
                }else if (Randon==3){
                    cambioposicion3();
                }else if (Randon==4){
                    cambioposicion4();
                }
            }
        }.start();
    }
}
