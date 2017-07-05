package home.demogdg_v2.BroadCast;

import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import home.demogdg_v2.R;

public class MainBroadCast extends AppCompatActivity  implements TextToSpeech.OnInitListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_broad_cast);


    }

    @Override
    public void onInit(int i) {
       // TextToSpeech textToSpeech;

       // textToSpeech.speak("Screen lock", TextToSpeech.QUEUE_FLUSH, hashMap);

    }
}
