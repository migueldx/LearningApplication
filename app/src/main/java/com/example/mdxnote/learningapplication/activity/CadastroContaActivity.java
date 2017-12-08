package com.example.mdxnote.learningapplication.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import com.example.mdxnote.learningapplication.R;
import com.example.mdxnote.learningapplication.model.Conta;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class CadastroContaActivity extends AppCompatActivity {

    @BindView(R.id.et_campo_conta)
    EditText etConta;

    @BindView(R.id.et_campo_valor)
    EditText etValor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_conta);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_cadastrar)
    public void Cadastrar(){
        Conta conta = new Conta();
        conta.setDescricao(etConta.getText().toString());
        conta.setValor(etValor.getText().toString());

        Bundle bundle = new Bundle();
        bundle.putSerializable("conta", conta);

        Intent irParaDetalhesConta = new Intent(this,DetalhesContaActivity.class);
        irParaDetalhesConta.putExtras(bundle);
        startActivity(irParaDetalhesConta);


    }


}
