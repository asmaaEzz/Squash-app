package com.example.asmaa.squash;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class LstViewAdapter extends ArrayAdapter<String> {
    int groupid;
    String[] item_list;
    ArrayList<String> desc;
    Context context;
    public LstViewAdapter(Context context, int vg, int id, String[] item_list){
        super(context,vg, id, item_list);
        this.context=context;
        groupid=vg;
        this.item_list=item_list;

    }
    // Hold views of the ListView to improve its scrolling performance
    static class ViewHolder {
        public TextView textview;
        public Button button1;
        public Button button2;
        public Button button3;

    }

    public View getView(int position, View convertView, ViewGroup parent) {

        View rowView = convertView;
        // Inflate the list_item.xml file if convertView is null
        if(rowView==null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            rowView= inflater.inflate(groupid, parent, false);
            ViewHolder viewHolder = new ViewHolder();
            viewHolder.textview= (TextView) rowView.findViewById(R.id.content_item);
            viewHolder.button1= (Button) rowView.findViewById(R.id.read_me);
            viewHolder.button1.setTag(position);
            viewHolder.button2= (Button) rowView.findViewById(R.id.imgs_library);
            viewHolder.button2.setTag(position);
            viewHolder.button3= (Button) rowView.findViewById(R.id.video_library);
            viewHolder.button3.setTag(position);
            if(position==0){
                viewHolder.button3.getLayoutParams().height=0;
                viewHolder.button3.getLayoutParams().width=0;
            }
            rowView.setTag(viewHolder);

        }
        // Set text to each TextView of ListView item
        ViewHolder holder = (ViewHolder) rowView.getTag();
        holder.textview.setText(item_list[position]);

        return rowView;
    }

}




