package com.mobile.potatos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class PedidosActivity extends AppCompatActivity {
public static final String PORCAO = "com.mobile.potatos.PORCAO";
public static final String REFRIGERANTE = "com.mobile.potatos.REFRIGERANTE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedidos);
    }
    public void abrirCarrinho(View novaView) {
        Spinner porcaoSpinner = (Spinner)findViewById(R.id.porcao_spinner);
        Spinner refrigeranteSpinner = (Spinner)findViewById(R.id.refrigerante_spinner);
        String porcaoTexto;
        porcaoTexto = porcaoSpinner.getSelectedItem().toString();
        String refrigeranteTexto;
        refrigeranteTexto = refrigeranteSpinner.getSelectedItem().toString();
        Intent intencao = new Intent(this, CarrinhoActivity.class);
        intencao.putExtra(PORCAO, porcaoTexto);
        intencao.putExtra(REFRIGERANTE, refrigeranteTexto);
        startActivity(intencao);
    }
}