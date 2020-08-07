package com.example.primerparcial;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class SegundaPantalla extends AppCompatActivity {
    private Button Convertir;
    private Button Reiniciar;
    private EditText Monto;
    private EditText Resultado;
    private RadioButton Dolar, Euro, Real;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_pantalla);
        Convertir = findViewById(R.id.buttonConvertir);
        Reiniciar = findViewById(R.id.buttonReiniciar);
        Monto = findViewById(R.id.editTextIngreseMonto);
        Resultado = findViewById(R.id.editTextResultado);
        Dolar = findViewById(R.id.radioButtonDolar);
        Euro = findViewById(R.id.radioButtonEuro);
        Real = findViewById(R.id.radioButtonReal);
        Reiniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Reiniciar();
            }
        });
        Convertir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String V_Monto= Monto.getText().toString();
                if (V_Monto.length() == 0) {

                    Toast.makeText(getApplicationContext( ), "Debe ingresar un monto", Toast.LENGTH_LONG).show( );
                }else {
                    Convertir();
                }
            }
        });
    }

    private void Reiniciar() {


    }

    @SuppressLint("SetTextI18n")
    private void Convertir() {
        float V_Monto= new Float(Monto.getText().toString());

        if (Dolar.isChecked() == true) {
            Resultado.setText("El valor es " + (72 * V_Monto));
        }
        if (Euro.isChecked()) {
            Resultado.setText("El valor es " + (113 * V_Monto));
        }
        if (Real.isChecked()) {
            Resultado.setText("El valor es " + (372 * V_Monto));

        }
    }
}
