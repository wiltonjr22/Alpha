package br.edu.unifametro.alpha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText idade01;
    private TextView textResultdo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        idade01 = findViewById(R.id.idade01);
        textResultdo= findViewById(R.id.textResultado);

    }

    public void calcularIdade(View view) {
        int idade = Integer.parseInt(idade01.getText().toString());
        int resultado = idade*7;
        textResultdo.setText("idade igual a :"+resultado+"anos");
    }

    public void startSegundaActivity(View v) {
      Intent intent = new Intent(this,videoIdade.class);
       startActivity(intent);
   }


}