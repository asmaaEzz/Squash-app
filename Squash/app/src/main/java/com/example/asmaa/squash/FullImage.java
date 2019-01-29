package com.example.asmaa.squash;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class FullImage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_image);
        Intent intent = getIntent();
        int[] infoAboutImage = intent.getExtras().getIntArray("id");
        ImageView imageview = (ImageView) findViewById(R.id.fullImg);
        gallary_image_adapter adapter = new gallary_image_adapter(this,infoAboutImage[0]);


        imageview.setImageResource(adapter.images[infoAboutImage[1]]);


    }
}
