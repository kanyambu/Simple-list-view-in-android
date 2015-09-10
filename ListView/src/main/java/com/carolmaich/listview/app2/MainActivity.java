package com.carolmaich.listview.app2;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;


public class MainActivity extends AppCompatActivity {

    String[] TheGospel = new String[]{"Matthew", "Mark", "Luke", "John", "Acts", "Romans","1st Corinthians","2nd Corinthians",
    "Galatians","Ephesians","Philippians","Colossians","1st Thessalonians","2nd Thessalonians","Philemon","1st Timothy",
            "2nd Timothy","Titus","Hebrews","James","1st Peter","2nd Peter","1st John","2nd John","3rd John","Jude","Revelation"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //find view by id
        ListView listView = (ListView)findViewById(R.id.TheGospel);
        ListAdapter listAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,TheGospel);

        listView.setAdapter(listAdapter);
    }


}

