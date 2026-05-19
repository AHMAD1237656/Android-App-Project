package com.example.fruitslistview;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<FoodModel> arrlist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // RecyclerView connect karo
        recyclerView = findViewById(R.id.recyclerView);

        // Data list banao
        arrlist = new ArrayList<>();
        arrlist.add(new FoodModel(R.drawable.cheese, "Cheese Burger"));
        arrlist.add(new FoodModel(R.drawable.pizza, "Pizza"));
        arrlist.add(new FoodModel(R.drawable.fries, "French Fries"));

        // Adapter set karo
        FoodAdapter adapter = new FoodAdapter(arrlist, this);
        recyclerView.setAdapter(adapter);

        // Layout Manager set karo (vertical list)
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
