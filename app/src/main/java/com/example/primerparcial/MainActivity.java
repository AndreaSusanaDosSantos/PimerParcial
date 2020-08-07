package com.example.primerparcial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button Ingresar;
    private EditText Nombre;
    private EditText Clave;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Ingresar = findViewById(R.id.buttonIngresar);
        Nombre= findViewById(R.id.editTextNombre);
        Clave= findViewById(R.id.editTextClave);
       Ingresar.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

            String V_Nombre= Nombre.getText().toString();
            String V_Clave= Clave.getText().toString();

               if (V_Nombre.equals("ites") && V_Clave.equals("1234"))
               {
                   Toast.makeText(getApplicationContext(), "Acceso válido", Toast.LENGTH_LONG).show();
               }
               else {
                   Toast.makeText(getApplicationContext(), "Acceso no permitido", Toast.LENGTH_LONG).show();
               }
           }

       });

    }
}
