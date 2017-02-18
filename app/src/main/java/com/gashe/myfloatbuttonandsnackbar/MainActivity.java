package com.gashe.myfloatbuttonandsnackbar;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        String [] array = new String[]{
                "Elemento 1",
                "Elemento 2",
                "Elemento 3",
                "Elemento 4",
                "Elemento 5",
                "Elemento 6",
                "Elemento 7",
                "Elemento 8",
                "Elemento 9",
                "Elemento 10",
                "Elemento 11",
                "Elemento 12",
                "Elemento 13",
                "Elemento 14"
        };

        ListAdapter adapter = new ArrayAdapter<String>(this, R.layout.fila, R.id.myTextViewFila, array);

        ListView listView = (ListView)findViewById(R.id.listacadenas);
        listView.setAdapter(adapter);

        FloatingActionButton floatButton = (FloatingActionButton)findViewById(R.id.floatIcon);
        floatButton.setOnClickListener(new FloatButtonListener(this));


    }
}
