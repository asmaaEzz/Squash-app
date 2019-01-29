package com.example.android.vollyball;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class gallaryGrid extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Intent intent =  getIntent();

        final int x = intent.getIntExtra("skill",0);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallary_grid);
        GridView gridView = (GridView) findViewById(R.id.grid);
        gridView.setAdapter(new gallary_image_adapter(this,x));

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent("com.example.android.vollyball.fullImageActivity");
                int []arr = {x,position};
                i.putExtra("id",arr);
                startActivity(i);
            }
        });

    }
}
