package xyz.monkeytong.hongbao.utils;

import android.content.Context;
import android.media.AudioManager;
import android.media.SoundPool;

/**
 * Created by djf on 2018/2/14.
 */

public class SoundUtil {
    public static SoundPool sp=new SoundPool(10,AudioManager.STREAM_MUSIC, 0);

    public static void loadSound(Context context,int id){
        sp.load(context,id,1);
    }
    public static void playSound(int id){
        sp.play(id,1,1,100,0,1);
    }
}
