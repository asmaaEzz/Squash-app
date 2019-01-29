package com.example.asmaa.squash;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class professor_content extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_professor_content);
        ImageView professorMainPhoto = findViewById(R.id.prodessorMainPhoto);
        TextView professorName = findViewById(R.id.professorName);
        TextView professorDescription = findViewById(R.id.professorDescription);

        Intent i = getIntent();
        int professorNumber = i.getIntExtra("number",-1);
        if (professorNumber==0){
            professorName.setText(getResources().getString(R.string.firstProfessorName));
            professorDescription.setText(getResources().getString(R.string.firstProfessorDescription));
            professorMainPhoto.setImageResource(R.drawable.first_professor_photo);
        }else if (professorNumber==1){
            professorName.setText(getResources().getString(R.string.secondProfessorName));
            professorDescription.setText(getResources().getString(R.string.secondProfessorDescription));
            professorMainPhoto.setImageResource(R.drawable.second_professor_photo);
        }else if (professorNumber==2){
            professorName.setText(getResources().getString(R.string.thirdProfessorName));
            professorDescription.setText(getResources().getString(R.string.thirdProfessorDescription));
            professorMainPhoto.setImageResource(R.drawable.third_professor_photo);

        }

    }
}
