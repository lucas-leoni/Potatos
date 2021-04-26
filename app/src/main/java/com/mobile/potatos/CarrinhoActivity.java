package com.mobile.potatos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class CarrinhoActivity extends AppCompatActivity {
public static final String PORCAO = "com.mobile.potatos.PORCAO";
public static final String REFRIGERANTE = "com.mobile.potatos.REFRIGERANTE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carrinho);
        Intent intencao = getIntent();
        String porcao_texto = intencao.getStringExtra(PedidosActivity.PORCAO);
        TextView porcaoTextView = (TextView) findViewById(R.id.porcao_text_view);
        porcaoTextView.setText(porcao_texto);
        String refrigerante_texto = intencao.getStringExtra(PedidosActivity.REFRIGERANTE);
        TextView refrigeranteTextView = (TextView) findViewById(R.id.refrigerante_text_view);
        refrigeranteTextView.setText(refrigerante_texto);
    }
    public void abrirPagamento(View novaView) {
        TextView porcaoTextView = (TextView) findViewById(R.id.porcao_text_view);
        String porcaoTexto = porcaoTextView.getText().toString();
        TextView refrigeranteTextView = (TextView) findViewById(R.id.refrigerante_text_view);
        String refrigeranteTexto = refrigeranteTextView.getText().toString();
        Intent intencao = new Intent(this, PagamentoActivity.class);
        intencao.putExtra(PORCAO, porcaoTexto);
        intencao.putExtra(REFRIGERANTE, refrigeranteTexto);
        startActivity(intencao);
    }
}