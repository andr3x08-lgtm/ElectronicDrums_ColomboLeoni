package com.example.electronicdrums;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void playBassDrum(View view) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.bd);
        mediaPlayer.start();
    }

    public void playHiHat1(View view) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.hh1);
        mediaPlayer.start();
    }

    public void playHiHat2(View view) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.hh2);
        mediaPlayer.start();
    }

    public void playHiHat3(View view) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.hh3);
        mediaPlayer.start();
    }

    public void playHiHat4(View view) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.hh4);
        mediaPlayer.start();
    }

    public void playPerc1(View view) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.perc1);
        mediaPlayer.start();
    }

    public void playPerc2(View view) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.perc2);
        mediaPlayer.start();
    }

    public void playSnareDrum(View view) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.sd);
        mediaPlayer.start();
    }
}