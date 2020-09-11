package com.example.helpme;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class LastActivity extends AppCompatActivity implements View.OnClickListener {

    private Button button1;
    private Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_last2 );
        //Button button2= findViewById(R.id.guidebtn);
        Button button1 = findViewById(R.id.developbtn);

        //button2.setOnClickListener(this);
        button1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            //case R.id.guidebtn :
               // Intent intent2 =new Intent(this,Guide.class);
                //startActivity(intent2);
               // break;
            case R.id.developbtn :
                Intent intent=new Intent(this,Developer.class);
                startActivity(intent);
                break;

        }

    }

    public void goGuide(View view) {
        Intent intent = new Intent(this,Guide.class);
        startActivity(intent);
    }

    public void goDev(View view) {
        Intent intent = new Intent(this,Developer.class);
        startActivity(intent);
    }

    public void goSettingsmain(View view) {
        Intent settings = new Intent(this, Settings.class);
        startActivity(settings);
    }
}
