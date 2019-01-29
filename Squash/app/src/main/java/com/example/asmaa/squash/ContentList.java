package com.example.asmaa.squash;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

public class ContentList extends AppCompatActivity {
    ListView list;
    Button readMe;
    Button imgsLibrary;
    Button videosLibrary;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content_list);

        String[] appContentList = getResources().getStringArray(R.array.appContent);
        list = findViewById(R.id.content_list);
        readMe = findViewById(R.id.read_me);
        imgsLibrary = findViewById(R.id.imgs_library);
        videosLibrary = findViewById(R.id.video_library);


      /*  list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


            }
        });*/


        LstViewAdapter adapter = new LstViewAdapter(this, R.layout.content_list_item, R.id.content_item, appContentList);
        // Bind data to the ListView
        list.setAdapter(adapter);


    }

    public void clickMeReadMe(View view) {

        Intent readmeintent = new Intent(this, ReadMe.class);


        int position = (int) view.getTag();
        readmeintent.putExtra("position", position);
        startActivity(readmeintent);

    }
    public void clickimgLibrary(View view) {

        Intent imgLibrary = new Intent(this, gallary_grid.class);


        int position = (int) view.getTag();
        imgLibrary.putExtra("position", position);

        startActivity(imgLibrary);

    }
    public void clickVideoLibrary(View view) {

        Intent videoLibrary = new Intent(this, VideoLibrary.class);


        int position = (int) view.getTag();
        videoLibrary.putExtra("position", position);

        startActivity(videoLibrary);

    }
}







