package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recycler;
    MyAdapter myAdapter;
    List<RecyclerPojoClass> list=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list.add(new RecyclerPojoClass("Student1","1"));
        list.add(new RecyclerPojoClass("Student2","2"));
        list.add(new RecyclerPojoClass("Student3","3"));
        list.add(new RecyclerPojoClass("Student4","4"));
        list.add(new RecyclerPojoClass("Student5","5"));
        list.add(new RecyclerPojoClass("Student6","6"));
        list.add(new RecyclerPojoClass("Student7","7"));
        list.add(new RecyclerPojoClass("Student8","8"));
        list.add(new RecyclerPojoClass("Student9","9"));
        list.add(new RecyclerPojoClass("Student10","10"));
        list.add(new RecyclerPojoClass("Student11","11"));
        list.add(new RecyclerPojoClass("Student12","12"));
        list.add(new RecyclerPojoClass("Student13","13"));
        list.add(new RecyclerPojoClass("Student14","14"));

        list.add(new RecyclerPojoClass("Student15","15"));
        list.add(new RecyclerPojoClass("Student16","16"));
        list.add(new RecyclerPojoClass("Student17","17"));
        list.add(new RecyclerPojoClass("Student18","18"));
        list.add(new RecyclerPojoClass("Student19","19"));
        list.add(new RecyclerPojoClass("Student20","20"));
        list.add(new RecyclerPojoClass("Student21","21"));
        list.add(new RecyclerPojoClass("Student22","22"));
        list.add(new RecyclerPojoClass("Student23","23"));
        list.add(new RecyclerPojoClass("Student24","24"));
        list.add(new RecyclerPojoClass("Student25","25"));
        list.add(new RecyclerPojoClass("Student26","26"));
        list.add(new RecyclerPojoClass("Student27","27"));
        list.add(new RecyclerPojoClass("Student28","28"));
        list.add(new RecyclerPojoClass("Student29","29"));
        list.add(new RecyclerPojoClass("Student30","30"));
        list.add(new RecyclerPojoClass("Student31","31"));

        recycler=findViewById(R.id.recycler);
        recycler.setHasFixedSize(true);

        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recycler.setLayoutManager(layoutManager);
        myAdapter=new MyAdapter(this.list);
        recycler.setAdapter(myAdapter);



    }
}