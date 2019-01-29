package com.example.asmaa.squash;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class ReadMe extends AppCompatActivity {
TextView textPartOne;
TextView textPartTwo;
ImageView imgBetweenText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read_me);

        textPartOne = findViewById(R.id.text_part_one);
        textPartTwo = findViewById(R.id.text_part_two);
        imgBetweenText = findViewById(R.id.image_between_text);

        Intent intent = getIntent();
        int itemIndex = intent.getIntExtra("position",-1);

        if(itemIndex==0){
            textPartOne.setText( getResources().getTextArray(R.array.itemReadMe)[0]);
           imgBetweenText.setImageResource(R.drawable.image_between_text_0_v2);
           textPartTwo.setText(getResources().getTextArray(R.array.itemReadMe)[1]);

        }
        else if(itemIndex==1){
            textPartOne.setText(( getResources().getTextArray(R.array.itemReadMe)[2]));

            textPartTwo.setText(getResources().getTextArray(R.array.itemReadMe)[3]);

        }
        else if(itemIndex==2){
            textPartOne.setText(getResources().getTextArray(R.array.itemReadMe)[4]);
            imgBetweenText.setImageResource(R.drawable.image_between_text_2_v2);
            textPartTwo.setText(getResources().getTextArray(R.array.itemReadMe)[5]);

        } else if(itemIndex==3){
            textPartOne.setText(getResources().getTextArray(R.array.itemReadMe)[6]);

            textPartTwo.setText(getResources().getTextArray(R.array.itemReadMe)[7]);

        }
        else if(itemIndex==4){
            textPartOne.setText(getResources().getTextArray(R.array.itemReadMe)[8]);

            textPartTwo.setText(getResources().getTextArray(R.array.itemReadMe)[9]);

        }
    }
}
