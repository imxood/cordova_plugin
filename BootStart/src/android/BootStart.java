package BootStart;

import java.util.List;

import android.content.BroadcastReceiver;
import android.content.Context;  
import android.content.Intent;
import android.content.pm.ResolveInfo;

import android.widget.Toast;

public class BootStart extends BroadcastReceiver {

    public static final String action_boot = "android.intent.action.BOOT_COMPLETED";

    @Override
    public void onReceive(Context context, Intent intent) {
        // Toast.makeText(context, "广播信息", Toast.LENGTH_SHORT).show();
        if (intent.getAction().equals(action_boot)) {
            // u can start your service here
            Toast.makeText(context, "开机广播信息", Toast.LENGTH_SHORT).show();

            Context appContext = context.getApplicationContext();

            openApp(appContext, appContext.getPackageName());
        }
    }

    public static void openApp(Context context, String packageName) {
        Intent intent = context.getPackageManager().getLaunchIntentForPackage(packageName);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
    }

}