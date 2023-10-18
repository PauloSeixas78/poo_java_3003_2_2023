package com.example.pupfeeder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaPupfeeder extends AppCompatActivity {

    Button racao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_pupfeeder);

        racao = (Button) findViewById(R.id.buttonRacoes);

        racao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent(TelaPupfeeder.this, TelaListaRacoes.class));
            }
        });


    }
}