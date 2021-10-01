package com.example.animation_lab2_phamtuandat;

import android.content.Intent;
import android.os.Bundle;
import android.transition.Fade;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.view.ViewCompat;

public class PlayMusic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_music);

        Fade fade = new Fade();
        View decor= getWindow().getDecorView();

        getWindow().setEnterTransition(fade);

        getWindow().setExitTransition(fade);


        final ImageView imgMusicPlay= findViewById(R.id.imgMusicPlay);
        imgMusicPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PlayMusic.this,LyricMusic.class);

                ActivityOptionsCompat optionsCompat=ActivityOptionsCompat.makeSceneTransitionAnimation(
                        PlayMusic.this,imgMusicPlay,
                        ViewCompat.getTransitionName(imgMusicPlay)
                );
                startActivity(intent, optionsCompat.toBundle());
            }
        });

        final ImageView imgHinhPlay= findViewById(R.id.imgHinhPlay);
        imgHinhPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PlayMusic.this,LyricMusic.class);

                ActivityOptionsCompat optionsCompat=ActivityOptionsCompat.makeSceneTransitionAnimation(
                        PlayMusic.this,imgHinhPlay,
                        ViewCompat.getTransitionName(imgHinhPlay)
                );
                startActivity(intent, optionsCompat.toBundle());
            }
        });


    }
}