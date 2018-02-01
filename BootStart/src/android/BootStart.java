package BootStart;

import android.content.BroadcastReceiver;
import android.content.Context;  
import android.content.Intent;

import android.widget.Toast;

import io.cordova.hellocordova.MainActivity;

/**
 * This class echoes a string called from JavaScript.
 */
// public class BootStart extends CordovaPlugin {

//     @Override
//     public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
//         if (action.equals("coolMethod")) {
//             String message = args.getString(0);
//             this.coolMethod(message, callbackContext);
//             return true;
//         }
//         return false;
//     }

//     private void coolMethod(String message, CallbackContext callbackContext) {
//         if (message != null && message.length() > 0) {
//             callbackContext.success(message);
//         } else {
//             callbackContext.error("Expected one non-empty string argument.");
//         }
//     }
// }

public class BootStart extends BroadcastReceiver {

    public static final String action_boot = "android.intent.action.BOOT_COMPLETED";

    @Override
    public void onReceive(Context context, Intent intent) {
        // Toast.makeText(context, "广播信息", Toast.LENGTH_SHORT).show();
        // if (intent.getAction().equals(action_boot)) {
        //     // u can start your service here
        //     Toast.makeText(context, "开机广播信息", Toast.LENGTH_SHORT).show();
        //     // Intent ootStartIntent = new Intent(context, MainActivity.class);
        //     // ootStartIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        //     // context.startActivity(ootStartIntent);
        // }
    }
}