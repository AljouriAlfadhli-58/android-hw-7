package com.example.pokemon;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class pokemonAdapter extends RecyclerView.Adapter {

    ArrayList<pokemon> pokArray;

    public pokemonAdapter(ArrayList<pokemon> pokArray) {
        this.pokArray = pokArray;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return pokArray.size();
    }
    public static class ViewHolder extends RecyclerView {
        public ViewHolder(@NonNull Context context) {
            super(context);
        }

        public ViewHolder(@NonNull Context context, @Nullable AttributeSet attrs) {
            super(context, attrs);
        }

        public ViewHolder(@NonNull Context context, @Nullable AttributeSet attrs, int defStyle) {
            super(context, attrs, defStyle);
        }
    }
}
