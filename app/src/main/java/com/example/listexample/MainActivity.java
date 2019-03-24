package com.example.listexample;

import android.database.DataSetObserver;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] foods = {"Bacon", "Ham", "Tuna", "Candy", "MeatBall", "Potato"};
        //This converts array into a basic list
      // ListAdapter buckysAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, foods);
        ListAdapter buckysAdapter = new CustomAdapter(this, foods);
        ListView buckysListView=(ListView)findViewById(R.id.buckysListView);
        buckysListView.setAdapter(buckysAdapter);   //set adapter to listview

        buckysListView.setOnItemClickListener(  //set listener to list
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String food=String.valueOf(parent.getItemAtPosition(position)); //get value related to that particular id
                        Toast.makeText(MainActivity.this,food,Toast.LENGTH_LONG).show();
                    }
                }
        );
    }
}
