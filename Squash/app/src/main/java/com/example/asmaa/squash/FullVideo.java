package com.example.asmaa.squash;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class FullVideo extends AppCompatActivity {
    VideoView videoFullScreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_full_video);

        videoFullScreen = findViewById(R.id.video_full_screen);
        Intent intent = getIntent();
        int[] videosInfo = intent.getIntArrayExtra("id");
        if (videosInfo[0] == 1) {
            videoFullScreen.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.item1_first_video));

        } else if (videosInfo[0] == 2) {
            videoFullScreen.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.item2_first_video));

        } else if (videosInfo[0] == 3 && videosInfo[1] == 0) {
            videoFullScreen.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.item3_first_video));

        } else if (videosInfo[0] == 3 && videosInfo[1] == 1) {
            videoFullScreen.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.item3_second_video));

        } else if (videosInfo[0] == 4) {
            videoFullScreen.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.item4_first_video));

        }
        videoFullScreen.setMediaController(new MediaController(this));
        videoFullScreen.requestFocus();

        videoFullScreen.start();

    }
}

