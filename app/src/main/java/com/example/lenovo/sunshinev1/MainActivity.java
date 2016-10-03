package com.example.lenovo.sunshinev1;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        String[] textTry = getResources().getStringArray(R.array.textTry);
//        List<String> weekForecast = new ArrayList<>(Arrays.asList(textTry));
//        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.list_item_forecast,
//                R.id.list_item_forecast_textview, weekForecast);
//        ListView list=(ListView)findViewById(R.id.listview_forecast);
//        list.setAdapter(adapter);

        //-----------------------


//        FragmentManager manager = getFragmentManager();
//        FragmentTransaction transaction = manager.beginTransaction();
//        transaction.replace(R.id.main_fragment, new Main_Fragment()).commit();

    }


}
