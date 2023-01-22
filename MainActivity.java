package com.example.formulario;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    private Button botao;
    private Snackbar mensagem;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botao= findViewById(R.id.button);
        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mensagem = Snackbar.make(botao,"Ação realisada com sucesso!",Snackbar.LENGTH_LONG);
                mensagem.setAction("Desfazer", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(MainActivity.this,"Desfeito",Toast.LENGTH_SHORT).show();
                    }
                });
                mensagem.show();
            }
        });

    }
}
