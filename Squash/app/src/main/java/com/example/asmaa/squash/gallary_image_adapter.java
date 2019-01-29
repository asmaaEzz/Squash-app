package com.example.asmaa.squash;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ConfigurationInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.media.Image;
import android.provider.MediaStore;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.TypedValue;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.view.View;
import android.view.ViewGroup;

public class gallary_image_adapter extends BaseAdapter{
    private Context context;
    public int[] itemOne = {
            R.drawable.item1_001,
            R.drawable.item1_002,
            R.drawable.item1_003,
            R.drawable.item1_004,
            R.drawable.item1_005,
            R.drawable.item1_006,
            R.drawable.item1_007,
            R.drawable.item1_008,
            R.drawable.item1_009,
            R.drawable.item1_010,
            R.drawable.item1_011,
            R.drawable.item1_012,



    }
            ;
    public int[] itemTwo = {R.drawable.item2_001,
            R.drawable.item2_002,
            R.drawable.item2_003,
            R.drawable.item2_004,
            R.drawable.item2_005,
            R.drawable.item2_006,
            R.drawable.item2_007,
            R.drawable.item2_008,
            R.drawable.item2_009,
            R.drawable.item2_010,
            R.drawable.item2_011,



    };
    public int[] itemThree = {R.drawable.item3_001,
            R.drawable.item3_002,
            R.drawable.item3_003,
            R.drawable.item3_004,
            R.drawable.item3_005,

            R.drawable.item3_007,
            R.drawable.item3_008,
            R.drawable.item3_009,
            R.drawable.item3_010,
            R.drawable.item3_011,
            R.drawable.item3_012



    };
    public int[] itemFour= {
            R.drawable.item4_001,
            R.drawable.item4_002,
            R.drawable.item4_003,
            R.drawable.item4_004,
            R.drawable.item4_005,
            R.drawable.item4_006,
            R.drawable.item4_007,
            R.drawable.item4_008,
            R.drawable.item4_009,
            R.drawable.item4_010,
            R.drawable.item4_011,
            R.drawable.item4_012,
            R.drawable.item4_013,
            R.drawable.item4_014,
            R.drawable.item4_015,


    };
    public int[] itemFive = {
            R.drawable.item5_001,
            R.drawable.item5_002,
            R.drawable.item5_003,
            R.drawable.item5_004,
            R.drawable.item5_005,
            R.drawable.item5_006,
            R.drawable.item5_007,
            R.drawable.item5_008,
    };
    public int[] images;



    public gallary_image_adapter(Context c, int position){
        context = c ;
        images=itemOne;
        if (position==1){
            images=itemTwo;
        }
        else  if (position==2){
            images=itemThree;
        }
        else  if (position==3){
            images=itemFour;
        }
        else  if (position==4){
            images=itemFive;
        }


    }






    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public Object getItem(int position) {
        return images[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }



    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(images[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);

        //calculate width of screen
        Display display = ((Activity)context).getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display. getSize(size);
        int width = size.x;


        imageView.setLayoutParams(new GridView.LayoutParams(width/3,width/3));





        return imageView;
    }
}


