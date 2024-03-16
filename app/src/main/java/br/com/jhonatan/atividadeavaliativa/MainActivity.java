package br.com.jhonatan.atividadeavaliativa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edtNome;
    Button btnSaudacao;
    TextView tvMensagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNome = findViewById(R.id.editNome);
        btnSaudacao = findViewById(R.id.btnBotao);
        tvMensagem = findViewById(R.id.tvNome);
        btnSaudacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //pegar a informação do edit text
                String nome = edtNome.getText().toString();
                String mensagem = "olá " + nome;
                tvMensagem.setText(mensagem);
            }

        });
    }
}