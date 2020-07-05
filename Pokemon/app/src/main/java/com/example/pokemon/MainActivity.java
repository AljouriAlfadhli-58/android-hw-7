package com.example.pokemon;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<pokemon> myPokemons = new ArrayList<>();
        pokemon p1 = new pokemon("Bulbasaur",R.drawable.p1,49,49,318);
        pokemon p2 = new pokemon("Charizard",R.drawable.p2,84,78,534);
        pokemon p3 = new pokemon("Pikachu",R.drawable.p3,55,40,320);
        pokemon p4 = new pokemon("Clefable",R.drawable.p4,70,73,483);

        myPokemons.add(p1);
        myPokemons.add(p2);
        myPokemons.add(p3);
        myPokemons.add(p4);

        RecyclerView rv = findViewById(R.id.Recyclerview);
        rv.setHasFixedSize(true);

        RecyclerView.LayoutManager lm = new LinearLayoutManager(this);
        rv.setLayoutManager(lm);


    }
}