package com.example.aplicativodesorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void Jogar(View view){


        //Pega nosso Texto 0;

        TextView TextGerado;
        TextGerado = findViewById(R.id.TextGerado);

        //Gera um numero Aleatorio
        int Numero = new Random().nextInt(11);

        TextGerado.setText("Numero Sorteado: "+Numero);
    }
}