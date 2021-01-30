package io.amanxz.pianoapp;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (mMediaPlayer != null) mMediaPlayer.release();
    }

    public void playA(View v) {
        mMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.note1_c);
        mMediaPlayer.start();
    }

    public void playB(View v) {
        mMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.note2_d);
        mMediaPlayer.start();
    }

    public void playC(View v) {
        mMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.note3_e);
        mMediaPlayer.start();
    }

    public void playD(View v) {
        mMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.note4_f);
        mMediaPlayer.start();
    }

    public void playE(View v) {
        mMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.note5_g);
        mMediaPlayer.start();
    }

    public void playF(View v) {
        mMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.note6_a);
        mMediaPlayer.start();
    }

    public void playG(View v) {
        mMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.note7_b);
        mMediaPlayer.start();
    }
}