package br.edu.unifametro.alpha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText idade01;
    private TextView textResultdo;


    public static final String PREFS_NAME = "prefs";
    private Button btnOnOff;

    SharedPreferences settings = getSharedPreferences(PREFS_NAME,0);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        idade01 = findViewById(R.id.idade01);
        textResultdo= findViewById(R.id.textResultado);

        btnOnOff = (Button) findViewById(R.id.btn);

        btnOnOff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences settings = getSharedPreferences(PREFS_NAME,0);
                SharedPreferences.Editor editor = settings.edit();
                editor.putStringSet("resultado", );
                editor.commit();
            }
        });

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