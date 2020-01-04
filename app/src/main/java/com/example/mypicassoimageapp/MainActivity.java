package com.example.mypicassoimageapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mypicassoimageapp.model.Movies;
import com.example.mypicassoimageapp.model.MoviesData;
import com.example.mypicassoimageapp.ui.MovieAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private GridLayoutManager gridLayoutManager;
    private List<Movies> moviesList;
    private MovieAdapter movieAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.my_movie_list);
        gridLayoutManager = new GridLayoutManager(this, 3,
                GridLayoutManager.VERTICAL
                , false);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setHasFixedSize(true);
        setMovies();
    }

    private void setMovies() {

        moviesList = new ArrayList<>();
        moviesList = MoviesData.setMovieData();
        movieAdapter = new MovieAdapter(MainActivity.this, moviesList);
        recyclerView.setAdapter(movieAdapter);
    }

}
