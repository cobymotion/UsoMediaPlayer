package com.kobinotes.usodemediaplayer;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import java.io.IOException;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {


    MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        // Primer ejercicio
       // player = MediaPlayer.create(getApplicationContext(),R.raw.nombreArchivo);

        //Segundo Ejercicio
        /*player = new MediaPlayer();
        Uri uri = Uri.parse(Environment.getExternalStorageDirectory() + "RutaArchivo");
        try {
            player.setDataSource(this, uri);
            player.prepare();
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        //tercer ejemplo
        player = new MediaPlayer();
        player.setAudioStreamType(AudioManager.STREAM_MUSIC);

        try {
            player.setDataSource("http://urldelsonido");
            player.prepare();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @OnClick(R.id.buttonPlay)
    public void empezarTocar()
    {

        player.start();
    }

    @OnClick(R.id.buttonPause)
    public void empezarPause()
    {
        player.pause();
    }


}
