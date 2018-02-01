package SimpleMath;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MyMath extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        // js入参如果是[“value1”,10,”value3”,…]，则可以使用：
        // 第一个参数 ： args.getString(0) 
        // 第二个参数 ： args.getInt(1) 
        // 第三个参数 ：args.getString(2)

        // js入参如果是[{“key”:”value”,”key”:”value”}]，则可以使用：
        // JSONArray jsonarray = new JSONArray(args.getString(0)); 
        // JSONObject json = jsonarray.getJSONObject(0); //再根据key取值
        
        if (action.equals("coolMethod")) {
            String message = args.getString(0);
            this.coolMethod(message, callbackContext);
            return true;
        }
        else if (action.equals("plus")) {
            int A = args.getInt(0);
            int B = args.getInt(1);
            this.plus(A, B, callbackContext);
            return true;
        }
        else if (action.equals("minus")) {
            int A = args.getInt(0);
            int B = args.getInt(1);
            this.minus(A, B, callbackContext);
            return true;
        }
        return false;
    }

    private void coolMethod(String message, CallbackContext callbackContext) {
        if (message != null && message.length() > 0) {
            callbackContext.success(message);
        } else {
            callbackContext.error("Expected one non-empty string argument.");
        }
    }

    private void plus(int A, int B, CallbackContext callbackContext) {
        int ret = A + B;
        if(ret < 100){
            callbackContext.success(ret);
        } else {
            callbackContext.error("A + B must be smaller than 100");
        }
    }

    private void minus(int A, int B, CallbackContext callbackContext) {
        int ret = A - B;
        if(ret > 0){
            callbackContext.success(ret);
        } else {
            callbackContext.error("A must be bigger than B");
        }
    }
}
