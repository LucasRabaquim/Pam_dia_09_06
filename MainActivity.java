package com.example.lucas_e_lucas_03_06;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit01 = findViewById(R.id.Numero01);
        edit02 = findViewById(R.id.Numero02);
        textViewResultado = findViewById(R.id.txtResultado);
    }
    // Feito por Lucas e Yasmim
    //edit 09/06: agora com participação do Lucas
    EditText edit01,edit02;
    TextView textViewResultado;
    int n1, n2;
    public void Calcula(View view){
        n1 = Integer.parseInt(edit01.getText().toString());
        n2 = Integer.parseInt(edit02.getText().toString());
        int resultado = n1 + n2;
        textViewResultado.setText(Integer.valueOf(resultado));
    }
}