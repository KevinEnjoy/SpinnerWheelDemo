package com.demo.spinnerwheeldemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.Map;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    protected Intent activityIntent(String pkg, String componentName) {
        Intent result = new Intent();
        result.setClassName(pkg, componentName);
        return result;
    }

   public void TimePicker(View v){
       startActivity(new Intent(this,TimePickerActivity.class));
        //startActivity(activityIntent("com.demo.spinnerwheeldemo","TimePickerActivity") );
   }

    public void TimePickerCustomViews(View v){
        startActivity(new Intent(this,TimePickerCustomViewsActivity.class));
        //startActivity(activityIntent("com.demo.spinnerwheeldemo","TimePickerCustomViewsActivity") );

    }

    public void ProgrammaticSwitching(View v){
        startActivity(new Intent(this,ProgrammaticSwitchingActivity.class));
        //startActivity(activityIntent("com.demo.spinnerwheeldemo","ProgrammaticSwitchingActivity") );

    }

    public void Cities(View v){
        startActivity(new Intent(this,CitiesActivity.class));
        //startActivity(activityIntent("com.demo.spinnerwheeldemo","CitiesActivity") );

    }
}
