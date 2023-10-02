package com.fernandocosta.frasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    //Atributo
    String[] frases = {
            "Hoje foi ",
            "um dia",
            "muito produtivo.",
            "Continue assim",
            "Boa noite!",
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void gerarFrases(View view){
        TextView texto = findViewById(R.id.textResultado);
        int numeroAleatorio = new Random().nextInt(5);
        String frase = frases[numeroAleatorio];
        texto.setText(frase);

    }
    public void exibirTodas(View view){
        TextView texto = findViewById(R.id.textResultado);
        String textoresultado = "";
        for(String frase : frases){
            textoresultado = textoresultado + frase + "\n";
        }
        texto.setText(textoresultado);
    }
}