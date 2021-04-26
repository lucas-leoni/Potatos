package com.mobile.potatos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class ConfirmarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmar);
        Intent intencao = getIntent();
        String endereco_texto = intencao.getStringExtra(PagamentoActivity.ENDERECO);
        TextView enderecoTextView = (TextView) findViewById(R.id.endereco_text_view);
        enderecoTextView.setText(endereco_texto);
        String pagamento_texto = intencao.getStringExtra(PagamentoActivity.PAGAMENTO);
        TextView pagamentoTextView = (TextView) findViewById(R.id.pagamento_text_view);
        pagamentoTextView.setText(pagamento_texto);
    }
    public void abrirNovoPedido(View novaView) {
        Intent intencao = new Intent(this, NovoPedidoActivity.class);
        startActivity(intencao);
    }
}