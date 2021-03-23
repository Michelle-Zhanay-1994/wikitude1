package com.example.wikitude;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class ayuda extends AppCompatActivity implements View.OnClickListener {
    Button btnatras;

    //Transacciones


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ayuda);
        btnatras = (Button) findViewById(R.id.btn_atras);
        btnatras.setOnClickListener(this);
    }

    /**
     * Called when a view has been clicked.
     *
     * @param
     */
    @Override
    public void onClick(View v) {
        if(v == btnatras){
            Intent i = new Intent(this, MainActivity.class);
            startActivity(i);

        }
    }
}

