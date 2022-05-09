package com.application.chamada_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.application.chamada_activity.databinding.ActivityEnviarBinding;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void enviar(View view) {
        Intent intent = new Intent(getApplicationContext(), EnviaActivity.class);
        intent.putExtra("titulo", ((EditText) findViewById(R.id.idTitulo)).getText().toString());
        intent.putExtra("conteudo", ((EditText) findViewById(R.id.idConteudo)).getText().toString());
        startActivity(intent);
    }


}