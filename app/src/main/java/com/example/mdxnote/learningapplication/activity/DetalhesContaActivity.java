package com.example.mdxnote.learningapplication.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mdxnote.learningapplication.R;
import com.example.mdxnote.learningapplication.model.Conta;
import com.example.mdxnote.learningapplication.service.ContaService;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class DetalhesContaActivity extends AppCompatActivity {

    @BindView(R.id.tv_texto_conta)
    TextView tvConta;

    @BindView(R.id.tv_texto_valor)
    TextView tvValor;

    private Conta conta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhes_conta);
        ButterKnife.bind(this);

        Bundle bundle = getIntent().getExtras();
        conta = (Conta) bundle.getSerializable("conta");

        tvConta.setText(conta.getDescricao());
        tvValor.setText(conta.getValor());
    }

    @OnClick(R.id.btn_confirmar)
    public void Confirmar(){
        ContaService contaService = new ContaService();
        contaService.cadastrar(conta);
        Toast.makeText(this,"Cadastrado com Sucesso!",Toast.LENGTH_SHORT).show();

        Intent irParaListaConta = new Intent(this,MainActivity.class);
        startActivity(irParaListaConta);
    }

}
