package com.example.kanchicoder.trackmychildparent;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by kanchicoder on 11/6/2016.
 */

public class MainActivity extends AppCompatActivity {

    ArrayList<Student> dataModels;
    ListView listView;
    private static CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=(ListView)findViewById(R.id.list);

        dataModels= new ArrayList<>();

        dataModels.add(new Student("Akanshu Gupta", "New Super Model School", R.drawable.cover));
        dataModels.add(new Student("Akanshu Gupta", "New Super Model School", R.drawable.cover));
        dataModels.add(new Student("Akanshu Gupta", "New Super Model School", R.drawable.cover));
        dataModels.add(new Student("Akanshu Gupta", "New Super Model School", R.drawable.cover));

        adapter= new CustomAdapter(dataModels,getApplicationContext());

        listView.setAdapter(adapter);listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                /*Student student= dataModels.get(position);

                Snackbar.make(view, student.getStudentName()+"\n"+student.getSchoolName(), Snackbar.LENGTH_LONG)
                        .setAction("No action", null).show();*/

                Student student = (Student) adapter.getItem(position);
                //Toast.makeText(getActivity(), movie.originalName, Toast.LENGTH_SHORT).show();
                startActivity(new Intent(getApplicationContext(), MultipleFragmentsActivity.class));
            }
        });

    }

    /*@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }*/
}