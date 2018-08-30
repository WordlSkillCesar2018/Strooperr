package com.example.worldskills.stroop;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Resultado extends AppCompatActivity {

    TextView ganadas,perdidas,intentos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
        String a,b,c;
        int d,e,f;
        a= String.valueOf(getIntent().getExtras().getInt("ganada"));
        b= String.valueOf(getIntent().getExtras().getInt("perdida"));
        c= String.valueOf(getIntent().getExtras().getInt("intentos"));
        d=getIntent().getExtras().getInt("ganada");
        e=getIntent().getExtras().getInt("perdida");
        f=getIntent().getExtras().getInt("intentos");
        ganadas = findViewById(R.id.textView5);
        perdidas = findViewById(R.id.textView7);
        intentos = findViewById(R.id.textView8);
        intentos.setText("Intentos: "+c);
        ganadas.setText("Ganadas"+a);
        perdidas.setText("perdidas"+b);
        SqliteOpenHelper sqliteOpenHelper = new SqliteOpenHelper(getApplicationContext());
        SQLiteDatabase db = sqliteOpenHelper.getWritableDatabase();
        if(db!=null){
                db.execSQL("insert into final values ('"+ganadas+"')");
                Toast.makeText(getApplicationContext(),"Guardado",Toast.LENGTH_LONG).show();
        }
    }


    public void volver(View view) {
        Intent intent
                 = new Intent(this,Inicio.class);
        startActivity(intent);
        finish();
    }
}
