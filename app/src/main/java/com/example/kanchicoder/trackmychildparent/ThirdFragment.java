package com.example.kanchicoder.trackmychildparent;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by FamilyAngel on 11/8/2016.
 */

public class ThirdFragment extends Fragment {

    public static final String JSON_URL = "http://172.19.18.22/login_register/expected_time.php";

    ArrayList<Student> dataModels;
    private static CustomAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        //View fragmentLayout = inflater.inflate(R.layout.frag2, container, false);

        //ListView listView1 = fragmentLayout.findViewById(R.id.mylistview);

        //LevelAdapter adapter = new LevelAdapter(this, R.layout.list_item, weather_data);
        //listView1 = (ListView)findViewById(R.id.listView1);
        //listView1.setAdapter(adapter);

        // Inflate the layout for this fragment
        //This layout contains your list view
        View view = inflater.inflate(R.layout.activity_main, container, false);

        //now you must initialize your list view
        ListView listview =(ListView)view.findViewById(R.id.list);

        dataModels= new ArrayList<>();

        dataModels.add(new Student("Akanshu Gupta", "New Super Model School", R.drawable.cover));
        dataModels.add(new Student("Akanshu Gupta", "New Super Model School", R.drawable.cover));
        dataModels.add(new Student("Akanshu Gupta", "New Super Model School", R.drawable.cover));
        dataModels.add(new Student("Akanshu Gupta", "New Super Model School", R.drawable.cover));

        adapter= new CustomAdapter(dataModels, getContext());
        listview.setAdapter(adapter);
        return listview;
    }
}