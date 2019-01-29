package com.example.asmaa.squash;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class VideoLibrary extends AppCompatActivity {
    ListView videoList ;
    int itemPosition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_library);
        Intent intent = getIntent();
        itemPosition = intent.getIntExtra("position",0);
        String []namesOfAllVideos = {};
        switch (itemPosition){
            case 1:
                namesOfAllVideos= new String[]{getResources().getStringArray(R.array.videosNames)[0]};
                break;
            case 2:
                namesOfAllVideos= new String[]{getResources().getStringArray(R.array.videosNames)[1]};
                break;
            case 3:
                namesOfAllVideos= new String[]{getResources().getStringArray(R.array.videosNames)[2],getResources().getStringArray(R.array.videosNames)[3]};
                break;
            case 4:
                namesOfAllVideos= new String[]{getResources().getStringArray(R.array.videosNames)[4]};
                break;
            default:
                namesOfAllVideos= new String[]{};
        }
        ArrayAdapter adapter = new ArrayAdapter(this,R.layout.videos_list_item,R.id.videoName,namesOfAllVideos );
        videoList = findViewById(R.id.videosList);
        videoList.setAdapter(adapter);

        videoList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent videoView = new Intent(getApplicationContext(),FullVideo.class);

                int []arrofInfo = {itemPosition,position};
                videoView.putExtra("id",arrofInfo);
                startActivity(videoView);
            }
        });
    }
}
