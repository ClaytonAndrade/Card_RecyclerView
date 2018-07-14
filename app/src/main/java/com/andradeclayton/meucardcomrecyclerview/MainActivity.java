package com.andradeclayton.meucardcomrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Window;
import android.view.WindowManager;

import java.util.ArrayList;
import java.util.List;

import adapter.Adapter;
import modelo.Item_card;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Window window = getWindow();
        window.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        RecyclerView recyclerView = findViewById(R.id.rv_lista);
        List<Item_card> mList = new ArrayList<>();
        mList.add(new Item_card(R.drawable.aston, "Aston", R.drawable.pessoa1, 2000));
        mList.add(new Item_card(R.drawable.audi, "Audi", R.drawable.pessoa2, 3000));
        mList.add(new Item_card(R.drawable.bmw, "BMW", R.drawable.pessoa3, 2500));
        mList.add(new Item_card(R.drawable.camaro, "Camaro", R.drawable.pessoa4, 2600));
        mList.add(new Item_card(R.drawable.challenger, "Challenger", R.drawable.pessoa5, 3200));
        mList.add(new Item_card(R.drawable.ferrari, "Ferrari", R.drawable.pessoa6, 1000));
        mList.add(new Item_card(R.drawable.gt40, "GT40", R.drawable.pessoa7, 1500));
        mList.add(new Item_card(R.drawable.huracan, "Lamborghini", R.drawable.pessoa8, 2400));
        mList.add(new Item_card(R.drawable.masserati, "Masserati", R.drawable.pessoa3, 4000));
        mList.add(new Item_card(R.drawable.porsche, "Porsche", R.drawable.pessoa1, 3200));
        mList.add(new Item_card(R.drawable.skyline, "Nissan", R.drawable.pessoa5, 2900));
        Adapter adapter = new Adapter(this,mList);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
