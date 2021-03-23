package com.example.wikitude;

import androidx.appcompat.app.AppCompatActivity;
//import com.wikitude.NativeStartupConfiguration;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button nueva_realidad , ayuda , wikitude;

    @Override
    public void onBackPressed() {
        super.onBackPressed();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //NativeStartupConfiguration startupConfiguration = new NativeStartupConfiguration();
       //startupConfiguration.setLicenseKey(WikitudeSDKConstants.WIKITUDE_SDK_KEY);
        //wikitudeSDK.onCreate(getApplicationContext(), startupConfiguration);//

        nueva_realidad = (Button) findViewById(R.id.realidad_aumentada);
        nueva_realidad.setOnClickListener(this);


        ayuda = (Button) findViewById(R.id.ayuda);
        ayuda.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        if(v==ayuda){
            Intent i = new Intent(this, ayuda.class);
            startActivity(i);
            Toast.makeText(this,"Ayuda",Toast.LENGTH_LONG).show();


        }
        if(v==nueva_realidad){
            Intent i = new Intent(this, wikitude.class);
            startActivity(i);
            Toast.makeText(this,"Wikitude",Toast.LENGTH_LONG).show();

        }
    }

    //public static class wikitudeSDK {

       // public static void onCreate(Context applicationContext, NativeStartupConfiguration startupConfiguration) {


        //}
    }