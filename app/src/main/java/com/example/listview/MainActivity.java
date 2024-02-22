package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ListAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    String nameList[] = {
            "Megumi Han",
            "Rie Takahashi",
            "Takeo Ootsuka",
            "Yurie Igoma",
            "Manaka Iwami",
            "Rumi Ookubo",
            "Lynn",
            "Yasuyuki Kase",
            "Kento Itou",
            "Tomoyo Takayanagi",
            "Shinpei Yamashita",
            "Yousuke Aomura"

    };

    String subList[] = {
            "megumi@gmail.com",
            "rie@gmail.com",
            "takeo@gmail.com",
            "yurie@gmail.com",
            "manaka@gmail.com",
            "rumi@gmail.com",
            "lynn@gmail.com",
            "yasuyuki@gmail.com",
            "kento@gmail.com",
            "tomoyo@gmail.com",
            "shinpei@gmail.com",
            "yousuke@gmail.com"

    };

    int pics_contact[] = {
            R.drawable.megumi,
            R.drawable.rie,
            R.drawable.takeo,
            R.drawable.yurie,
            R.drawable.manaka,
            R.drawable.rumi,
            R.drawable.lynn,
            R.drawable.yasuyuki,
            R.drawable.kento,
            R.drawable.tomoyo,
            R.drawable.shinpei,
            R.drawable.yousuke
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        ListView data_list = (ListView)findViewById(R.id.DataList);
        customAdapter base = new customAdapter(nameList, subList, pics_contact, this);
        data_list.setAdapter(base);
    }
}