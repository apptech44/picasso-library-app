package com.example.mypicassoimageapp.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mypicassoimageapp.R;
import com.example.mypicassoimageapp.model.Movies;
import com.squareup.picasso.Picasso;

import java.util.List;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MovieHolder> {

    private Context context;
    private List<Movies> moviesList;
    private LayoutInflater inflater;

    public MovieAdapter(Context context, List<Movies> moviesList) {

        this.context = context;
        this.moviesList = moviesList;
        this.inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public MovieHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.movie_list_item_layout, parent, false);
        MovieHolder movieHolder = new MovieHolder(view);
        return movieHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MovieHolder holder, int position) {

        Movies movies = moviesList.get(position);
        holder.movieTitle.setText(movies.getMovieName());

        Picasso.get().load(movies.getMovieImages()).placeholder(R.mipmap.ic_launcher)
                .error(R.mipmap.ic_launcher)
                .resize(350, 350).into(holder.movieImage);

    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }

    public class MovieHolder extends RecyclerView.ViewHolder {

        private TextView movieTitle;
        private ImageView movieImage;

        public MovieHolder(@NonNull View itemView) {
            super(itemView);

            movieImage = itemView.findViewById(R.id.my_image_picasso);
            movieTitle = itemView.findViewById(R.id.movie_name_text_view);

        }
    }
}
