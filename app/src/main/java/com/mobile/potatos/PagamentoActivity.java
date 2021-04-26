package com.mobile.potatos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class PagamentoActivity extends AppCompatActivity {
public static final String ENDERECO = "com.mobile.potatos.ENDERECO";
public static final String PAGAMENTO = "com.mobile.potatos.PAGAMENTO";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagamento);
    }
    public void abrirConfirmar(View novaView) {
        EditText enderecoEditText = (EditText) findViewById(R.id.endereco_edit_text);
        String enderecoTexto = enderecoEditText.getText().toString();
        Spinner pagamentoSpinner = (Spinner)findViewById(R.id.pagamento_spinner);
        String pagamentoTexto = pagamentoSpinner.getSelectedItem().toString();
        Intent intencao = new Intent(this, ConfirmarActivity.class);
        intencao.putExtra(ENDERECO, enderecoTexto);
        intencao.putExtra(PAGAMENTO, pagamentoTexto);
        startActivity(intencao);
    }
}