package com.example.estudioexamen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView textoRecibido;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        recibirDatos();
    }
    public void recibirDatos(){
        Bundle recibir= getIntent().getExtras();
        String n1= recibir.getString("dato01");
        textoRecibido=(TextView) findViewById(R.id.textoRecibido);
        textoRecibido.setText(n1);
    }
}

