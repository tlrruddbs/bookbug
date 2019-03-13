package com.example.it.myapplication;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

/**
 * Created by IT on 2017-11-22.
 */
public class MusicService extends Service {
    MediaPlayer mp;

    @Override
    public void onDestroy() {
        mp.stop();
        super.onDestroy();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        mp=MediaPlayer.create(this,R.raw.sound2);
        mp.setLooping(true);
        mp.start();
        return super.onStartCommand(intent, flags, startId);
    }

    public IBinder onBind(Intent intent){

        return null;
    }

}
