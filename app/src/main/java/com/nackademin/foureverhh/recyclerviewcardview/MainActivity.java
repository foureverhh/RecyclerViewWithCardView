package com.nackademin.foureverhh.recyclerviewcardview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<ExampleItem> exampleList = new ArrayList<>();
        exampleList.add(new ExampleItem(R.drawable.ic_android,"Line 1", "Line 2"));
        exampleList.add(new ExampleItem(R.drawable.ic_alarm,"Line 3", "Line 4"));
        exampleList.add(new ExampleItem(R.drawable.ic_child_care,"Line 5", "Line 6"));
    }
}
