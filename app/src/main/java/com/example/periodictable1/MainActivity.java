package com.example.periodictable1;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity{
    MediaPlayer my_song;


    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hideNavigationBar();

        my_song= MediaPlayer.create(MainActivity.this, R.raw.bgm);
        my_song.setLooping(true);
        my_song.start();


        Button buttonStart = findViewById(R.id.button_start);
        buttonStart.setOnClickListener(v -> toElementList());

        Button buttonQuit = findViewById(R.id.button_quit);
        buttonQuit.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_MAIN);
            intent.addCategory(Intent.CATEGORY_HOME);
            my_song.pause();
            startActivity(intent);
        });

        Button buttonAboutUs = findViewById(R.id.button_aboutus);
        buttonAboutUs.setOnClickListener(v -> openAbout());
    }

    private void openAbout(){
        aboutUs aboutDialog = new aboutUs();
        aboutDialog.show(getSupportFragmentManager(), "example");
    }

    private void toElementList(){
        Intent intent = new Intent(MainActivity.this ,
                Elements_list.class );
        startActivity(intent);
    }


    private void hideNavigationBar() {
        this.getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_FULLSCREEN |
                View.SYSTEM_UI_FLAG_HIDE_NAVIGATION|
                View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY|
                View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN|
                View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION|
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE);

    }
    protected void onStop(){
        super.onStop();
        //your code for stopping the sound
    }




}

