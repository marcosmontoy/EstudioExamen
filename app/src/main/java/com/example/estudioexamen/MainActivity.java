package com.example.estudioexamen;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText et1, et2, et3, et4;
    Intent emailIntent = new Intent(Intent.ACTION_SEND);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = (EditText)findViewById(R.id.editTextNombres);
        et2 = (EditText)findViewById(R.id.editTextApellidos);
        et3 = (EditText)findViewById(R.id.editTextPhone);
        et4 = (EditText)findViewById(R.id.editTextMail);
    }

//    public void enviar (View v){
//        String[] to = {"mamontoy@espol.edu.ec"};
//        String[] cc = {"cvaccaro@fiec.espol.edu.ec"};
//        emailIntent.setData(Uri.parse("mailto:"));
//        emailIntent.setType("text/plain");
//        emailIntent.putExtra(Intent.EXTRA_EMAIL, to);
//        emailIntent.putExtra(Intent.EXTRA_CC, cc);
//        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Formulario de Registro PST");
//
//
//
//        emailIntent.putExtra(Intent.EXTRA_TEXT, "Datos de Contacto\n" +
//                "Nombres:" + et1.getText().toString()+ "\n" +
//                "Apellidos:" + et2.getText().toString() +"\n" +
//                "Teléfono:" + et3.getText().toString() + "\n" +
//                "Correo Electrónico:" + et4.getText().toString()+ "\n");
//
//        try {
//            startActivity(Intent.createChooser(emailIntent, "Enviando Email"));
//            Log.i("termina envio de email", "");
//        }
//        catch (android.content.ActivityNotFoundException ex) {
//            Toast.makeText(MainActivity.this, "No existe cliente Email instalado.", Toast.LENGTH_SHORT).show();
//        }
//    }
    public void enviar (View v){
        Intent ventana = new Intent( this,MainActivity2.class);
        ventana.putExtra("dato01" , "Datos de Contacto\n" +
                "Nombres:" + et1.getText().toString()+ "\n" +
                "Apellidos:" + et2.getText().toString() +"\n" +
                "Teléfono:" + et3.getText().toString() + "\n" +
                "Correo Electrónico:" + et4.getText().toString()+ "\n");
        startActivity(ventana);
    }
}



