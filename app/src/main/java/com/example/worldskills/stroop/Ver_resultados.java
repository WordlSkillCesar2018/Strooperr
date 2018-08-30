package com.example.worldskills.stroop;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Ver_resultados extends AppCompatActivity {

    TextView verpuntaje;
    int i=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_resultados);
        verpuntaje = findViewById(R.id.textView11);
        SqliteOpenHelper sqliteOpenHelper = new SqliteOpenHelper(getApplicationContext());
        SQLiteDatabase db = sqliteOpenHelper.getWritableDatabase();
        StringBuffer stringBuffer = new StringBuffer();
        if(db!=null){
            Cursor cursor = db.rawQuery("select * from final order by resultado desc",null);
            if (cursor.moveToFirst()){
                do {
                    i++;
                    stringBuffer.append(cursor.getInt(0)+"\n");
                }while(cursor.moveToNext()&&i<4);

            }
            verpuntaje.setText(stringBuffer.toString());
        }
    }
}
