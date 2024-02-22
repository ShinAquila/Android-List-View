package com.example.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class customAdapter extends BaseAdapter {
    private String nameList[];
    private String subList[];
    private int pics_Contact[];

    Context context;

    public customAdapter(String[] nameList, String[] subList, int[] pics_Contact, Context context){
        this.nameList = nameList;
        this.subList = subList;
        this.pics_Contact = pics_Contact;
        this.context = context;
    }

    @Override
    public int getCount(){
        return nameList.length;
    }

    @Override
    public Object getItem(int position){
        return null;
    }

    @Override
    public long getItemId(int position){
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater layoutInflater = (LayoutInflater)parent.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.activity_list_view,null);

        ImageView image = (ImageView) view.findViewById(R.id.contact_pic);
        TextView text_name = (TextView) view.findViewById(R.id.text_data);
        TextView text_sub = (TextView) view.findViewById(R.id.text_data2);

        image.setImageResource(pics_Contact[position]);
        text_name.setText(nameList[position]);
        text_sub.setText(subList[position]);

        return view;
    }


}
