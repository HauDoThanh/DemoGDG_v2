package home.demogdg_v2.BroadCast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
  Created by admin on 7/5/2017.
 */

public class MyBroadCast2 extends BroadcastReceiver {
    
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "set Wallpaper", Toast.LENGTH_SHORT).show();
    }
}
