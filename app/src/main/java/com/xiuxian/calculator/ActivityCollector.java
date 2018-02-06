package com.xiuxian.calculator;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 丁彦绮 on 2018/2/6.
 */

public class ActivityCollector extends AppCompatActivity {
    public  static List<Activity>activities=new ArrayList<>();

    public static void addActivity(Activity activity){
        activities.add(activity);
    }
    public static void removeActivity(Activity activity){
        activities.remove(activity);
    }
    public static void finishAll(){
        for (Activity activity:activities){
            if(!activity.isFinishing())
                activity.finish();
        }
    }
}