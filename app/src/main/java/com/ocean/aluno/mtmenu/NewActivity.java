package com.ocean.aluno.mtmenu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.ocean.aluno.mtmenu.utils.Constantes;

public class NewActivity extends AppCompatActivity {

    private TextView tvMenuClicado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        tvMenuClicado = (TextView) findViewById(R.id.tvMenuClicado);

        Intent i = getIntent();
        if (i != null) {
            String menuClicado = i.getStringExtra(Constantes.KEY_OPCAO_SELECIONADA);

            tvMenuClicado.setText(menuClicado);
        }

    }
}
