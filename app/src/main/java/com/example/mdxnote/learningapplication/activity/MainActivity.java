package com.example.mdxnote.learningapplication.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.mdxnote.learningapplication.R;
import com.example.mdxnote.learningapplication.model.Conta;
import com.example.mdxnote.learningapplication.service.ContaService;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.lv_lista_conta)
    ListView lvListaConta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        List<Conta> listaConta = new ContaService().buscarTodos();
        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1, listaConta);
        lvListaConta.setAdapter(adapter);
    }

    @OnClick(R.id.btn_novo)
    public void aoClicarBotaoNovo(){
        Intent irParaCadastro = new Intent(this, CadastroContaActivity.class);
        startActivity(irParaCadastro);
    }
}
