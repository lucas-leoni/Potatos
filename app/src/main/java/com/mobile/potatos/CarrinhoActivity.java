package com.mobile.potatos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class CarrinhoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carrinho);
        Intent intencao = getIntent();
        String texto = intencao.getStringExtra(PedidosActivity.MENSAGEM);
        TextView textView = (TextView) findViewById(R.id.mensagem);
        textView.setText("Texto informado: " + texto);
        String nome = intencao.getStringExtra(PedidosActivity.NOME);
        TextView nomeTextView = (TextView) findViewById(R.id.nome_text_view);
        nomeTextView.setText("Nome informado: " + nome);
    }
}