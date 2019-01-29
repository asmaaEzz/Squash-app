package com.example.asmaa.squash;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Professors extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_professors);

        String nameArray [] = new String[3];
        nameArray[0]="ياسر عبدالعظيم سالم";
        nameArray[1]="حبيب رضا حبيب";
        nameArray[2]="إيهاب صابر إسماعيل إسماعيل";

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.professors_list_item, R.id.professors_name, nameArray);
        final ListView list = (ListView) findViewById(R.id.list);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                {
                    Intent intent = new Intent(parent.getContext(),professor_content.class);
                    intent.putExtra("number",position);
                    startActivity(intent);

                }

            }
        });
    }
}


