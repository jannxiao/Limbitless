package com.example.limbitless;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StartActivity extends AppCompatActivity {

    private Button btnGallery;                        //Declaring btnStart as an instance of Button

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);


        btnGallery = findViewById(R.id.btn_to_gallery);
        btnGallery.setOnClickListener( new View.OnClickListener() {

            public void onClick(View view){
                Intent intent = new Intent(StartActivity.this,   //On click, a new
                        GalleryActivity.class);                                 // activity is open
                startActivity(intent);
            }
        });



    }
}
