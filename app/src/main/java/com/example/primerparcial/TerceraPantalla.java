package com.example.primerparcial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TerceraPantalla extends AppCompatActivity {
    private TextView Numero;
    private Button Sumar;
    private Button Restar;
    private Button Reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tercera_pantalla);
        Numero= findViewById(R.id.textViewNumero);
        Sumar= findViewById(R.id.buttonSumar);
        Restar= findViewById(R.id.buttonRestar);
        Reset= findViewById(R.id.buttonReset);
        Restar.setOnClickListener(new View.OnClickListener( ) {
            @Override
            public void onClick(View v) {

            }
        });
        Sumar.setOnClickListener(new View.OnClickListener( ) {
            @Override
            public void onClick(View v) {

                }


        });

    }
}
