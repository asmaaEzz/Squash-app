package com.example.android.vollyball;

import android.content.Intent;
import android.renderscript.Int2;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.ImageView;

import static android.R.attr.id;
import static com.example.android.vollyball.R.drawable.s;

public class fullImageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent i = getIntent();
        int[] position = i.getExtras().getIntArray("id");


        if(position[0]==R.id.secondbtn&&((position[1]==9)||(position[1]==10)||(position[1]==11)||(position[1]==12)||(position[1]==13)||(position[1]==14))){
            setContentView(R.layout.gif);
            WebView web = (WebView) findViewById(R.id.gif);
            if ( position[1] == 9) {

                web.loadUrl("file:///android_asset/gif1.gif");

            }
            else if ( position[1] == 10) {

                web.loadUrl("file:///android_asset/gif2.gif");
            }
            else  if ( position[1] == 11) {

                web.loadUrl("file:///android_asset/gif3.gif");

            }
            else  if ( position[1] == 12) {

                web.loadUrl("file:///android_asset/gif4.gif");
            }
            else  if (position[1] == 13) {

                web.loadUrl("file:///android_asset/gif5.gif");
            }

        }



            else

            {
                setContentView(R.layout.activity_full_image);
                ImageView imageview = (ImageView) findViewById(R.id.imageView);
                gallary_image_adapter adapter = new gallary_image_adapter(this, position[0]);


                imageview.setImageResource(adapter.images[position[1]]);

        }


        }
    }

