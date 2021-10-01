package com.example.animation_lab2_phamtuandat;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.view.ViewCompat;

import android.content.Intent;
import android.os.Bundle;
import android.transition.Fade;
import android.view.View;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        Fade fade = new Fade();
        View decor= getWindow().getDecorView();

        getWindow().setEnterTransition(fade);

        getWindow().setExitTransition(fade);


        final ImageView imgLavender= findViewById(R.id.imgLavender);
        imgLavender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this,MainActivity4.class);

                ActivityOptionsCompat optionsCompat=ActivityOptionsCompat.makeSceneTransitionAnimation(
                        MainActivity2.this,imgLavender,
                        ViewCompat.getTransitionName(imgLavender)
                );
                startActivity(intent, optionsCompat.toBundle());
            }
        });

        final ImageView imgLightLavender= findViewById(R.id.imgLightLavender);
        imgLightLavender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this,MainActivity3.class);

                ActivityOptionsCompat optionsCompat=ActivityOptionsCompat.makeSceneTransitionAnimation(
                        MainActivity2.this,imgLightLavender,
                        ViewCompat.getTransitionName(imgLightLavender)
                );
                startActivity(intent, optionsCompat.toBundle());
            }
        });



    }
}