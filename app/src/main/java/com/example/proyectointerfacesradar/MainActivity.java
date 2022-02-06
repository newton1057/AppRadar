package com.example.proyectointerfacesradar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button bRegistrarse;
    private Button bIniciar_Sesion;
    private Context mCont = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Declaracion de Botones
        bRegistrarse = (Button) findViewById(R.id.Registrarse);
        bIniciar_Sesion = (Button) findViewById(R.id.Iniciar_Sesion);

        //Listener para mandar a llamar Activity

        bRegistrarse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mCont, Registrarse.class);
                startActivity(intent);
            }
        });

        bIniciar_Sesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mCont, Iniciar_Sesion.class);
                startActivity(intent);
            }
        });
    }
}