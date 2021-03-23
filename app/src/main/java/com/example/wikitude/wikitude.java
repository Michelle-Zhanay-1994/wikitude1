package com.example.wikitude;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class wikitude extends AppCompatActivity implements View.OnClickListener {
    Button atras;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wikitude);
        atras = (Button) findViewById(R.id.btn_atras);
        atras.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v == atras){
            Intent i = new Intent(this, MainActivity.class);
            startActivity(i);

        }
    }

}