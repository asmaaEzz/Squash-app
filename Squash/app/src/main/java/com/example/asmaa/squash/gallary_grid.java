package com.example.asmaa.squash;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class gallary_grid extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallary_grid);

        Intent intent =  getIntent();

        final int itemPosition = intent.getIntExtra("position",0);

        GridView gridView = (GridView) findViewById(R.id.grid);
        gridView.setAdapter(new gallary_image_adapter(this,itemPosition));

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent imageFull = new Intent(getApplicationContext(),FullImage.class);

                int []arr = {itemPosition,position};
                imageFull.putExtra("id",arr);
                startActivity(imageFull);
            }
        });

    }
}
