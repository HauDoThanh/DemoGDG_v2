package home.demogdg_v2.BroadCast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.speech.tts.TextToSpeech;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by admin on 7/4/2017.
 */

public class MyBroadCast extends BroadcastReceiver implements TextToSpeech.OnInitListener {

    TextToSpeech textToSpeech;

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.e("logg", "lock screen");
//        textToSpeech = new TextToSpeech(context, this);
        Toast.makeText(context, "time change", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onInit(int i) {

        //  textToSpeech.speak("Screen lock", TextToSpeech.QUEUE_FLUSH, null);

    }

}
