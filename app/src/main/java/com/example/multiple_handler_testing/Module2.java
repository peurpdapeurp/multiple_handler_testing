package com.example.multiple_handler_testing;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

import androidx.annotation.NonNull;

public class Module2 {

    private static final String TAG = "Module2";

    private Looper mainThreadLooper_;
    private Handler handler_;

    // Messages
    private static final int MSG_MODULE_2_MESSAGE = 0;

    public Module2(Looper mainThreadLooper) {
        mainThreadLooper_ = mainThreadLooper;
        handler_ = new Handler(mainThreadLooper_) {
            @Override
            public void handleMessage(@NonNull Message msg) {
                switch (msg.what) {
                    case MSG_MODULE_2_MESSAGE:
                        Log.d(TAG, "Got MSG_MODULE_2_MESSAGE");
                        break;
                    default:
                        throw new IllegalStateException("unexpected msg.what: " + msg.what);
                }
            }
        };
    }

    public void triggerMessage() {
        handler_
                .obtainMessage(MSG_MODULE_2_MESSAGE)
                .sendToTarget();
    }
    
}
