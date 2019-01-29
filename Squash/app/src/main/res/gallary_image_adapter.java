package com.example.android.vollyball;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ConfigurationInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.media.Image;
import android.provider.MediaStore;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import static android.R.attr.x;
import static com.example.android.vollyball.R.id.imageView;


public class gallary_image_adapter extends BaseAdapter {

    private Context context;
    public int[] zimages = {R.drawable.img1,
            R.drawable.img3,
            R.drawable.img2,
            R.drawable.img5,
            R.drawable.img6,
            R.drawable.img7,
            R.drawable.img8,
            R.drawable.img9,
            R.drawable.img10,
            R.drawable.img11,
            R.drawable.img12,
            R.drawable.img13,
            R.drawable.img14,
    }
            ;
    public int[] ximages = {R.drawable.imgx1,
            R.drawable.imgx2,
            R.drawable.imgx3,
            R.drawable.imgx4,
            R.drawable.imgx5,
            R.drawable.imgx6,
            R.drawable.imgx7,
            R.drawable.imgx8,
            R.drawable.imgx9,
            R.drawable.gif1,
            R.drawable.gif2,
            R.drawable.gif3,
            R.drawable.gif4,
            R.drawable.gif5



          };
    public int[] images;



    public gallary_image_adapter(Context c, int x){
        context = c ;
        images=zimages;
        if (x==R.id.secondbtn){
            images=ximages;
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

        imageView.setLayoutParams(new GridView.LayoutParams(130,130));





        return imageView;
    }
}

