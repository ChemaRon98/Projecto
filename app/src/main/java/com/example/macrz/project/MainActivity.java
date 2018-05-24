package com.example.macrz.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button Boton1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Boton1=(Button)(findViewById(R.id.Boton1));

    }

    public void Boton1(View v)
    {

        Intent segunda = new Intent (this, Main2Activity.class);
        startActivity(segunda);

    }

}
