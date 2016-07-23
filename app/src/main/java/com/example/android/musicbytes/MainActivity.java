package com.example.android.musicbytes;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set a click listener on that now_playing_textview
        TextView nowPlaying = (TextView) findViewById(R.id.now_playing_textview);
        nowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                Intent nowPlayingIntent = new Intent(MainActivity.this, NowPlayingActivity.class);
                startActivity(nowPlayingIntent);
            }
        });

        // Set a click listener on that artists_textview
        TextView artists = (TextView) findViewById(R.id.artists_textview);
        artists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent artistsIntent = new Intent(MainActivity.this, ArtistsActivity.class);
                startActivity(artistsIntent);
            }
        });

        // Set a click listener on that albums_textview
        TextView albums = (TextView) findViewById(R.id.albums_textview);
        albums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent albumsIntent = new Intent(MainActivity.this, AlbumsActivity.class);
                startActivity(albumsIntent);
            }
        });

        // Set a click listener on that songs_textview
        TextView songs = (TextView) findViewById(R.id.songs_textview);
        songs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent songsIntent = new Intent(MainActivity.this, SongsActivity.class);
                startActivity(songsIntent);
            }
        });

        // Set a click listener on that genre_textview
        TextView genre = (TextView) findViewById(R.id.genre_textview);
        genre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent genreIntent = new Intent(MainActivity.this, GenreActivity.class);
                startActivity(genreIntent);
            }
        });

        // Set a click listener on that playlists_textview
        TextView playlists = (TextView) findViewById(R.id.playlists_textview);
        playlists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent playlistsIntent = new Intent(MainActivity.this, PlaylistsActivity.class);
                startActivity(playlistsIntent);
            }
        });
    }
}
