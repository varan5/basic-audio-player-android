 package com.example.basicaudioplayer;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

@RequiresApi(api = Build.VERSION_CODES.M)
public class MainActivity extends AppCompatActivity {

//    AudioManager audioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);
//    audioManager.setStreamVolume(AudioManager.STREAM_MUSIC, 20, 0);

    MediaPlayer mediaPlayer;
    public void play(View view) {
        mediaPlayer.start();
    }

    public void pause(View view) {
        mediaPlayer.pause();
    }

    public void stop(View view) {
        mediaPlayer.stop();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mediaPlayer = MediaPlayer.create(this, R.raw.song);
    }
}