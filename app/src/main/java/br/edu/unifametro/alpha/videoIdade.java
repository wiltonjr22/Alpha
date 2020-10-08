package br.edu.unifametro.alpha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class videoIdade extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_idade);
    }

    public void abrirLink(View v){
       Intent intentLink = new Intent();
       intentLink.setAction(Intent.ACTION_VIEW);
       intentLink.addCategory(Intent.CATEGORY_DEFAULT);
       intentLink.setData(Uri.parse("https://www.youtube.com/watch?v=XRYr1UhcWmM"));
       startActivity(intentLink);
    }
}