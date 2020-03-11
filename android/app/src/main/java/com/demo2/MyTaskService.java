package com.demo2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;


import androidx.annotation.NonNull;

import com.facebook.react.HeadlessJsTaskService;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.jstasks.HeadlessJsTaskConfig;

import java.util.concurrent.TimeUnit;

/**
 * Created by panjiyudasetya on 6/7/17.
 */

public class MyTaskService extends HeadlessJsTaskService {
    private static final String TASK_NAME = "SomeTaskName";

    public static void startService(@NonNull Context context) {
        //if (!AppDetector.isAppInForeground(context)) {
            Intent intentService = new Intent(context, MyTaskService.class);
            context.startService(intentService);
        //    HeadlessJsTaskService.acquireWakeLockNow(context);
        //}
    }

    @Override
    protected HeadlessJsTaskConfig getTaskConfig(Intent intent) {
        Bundle extras = intent.getExtras();
        WritableMap data = extras != null ? Arguments.fromBundle(extras) : null;
        return new HeadlessJsTaskConfig(
                TASK_NAME,
                data,
               5000,
                true);
    }
}