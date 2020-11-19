package com.rollup.launcher.myannotationdemo;

import android.app.Activity;
import android.view.View;

import java.lang.reflect.Field;

/**
 * <pre>
 *     author : LiJianZhuang
 *     time   : 2020/11/18
 *     desc   :
 *     version: 1.0
 * </pre>
 */
public class InjectViewUtils {
    public static void injextView(Activity activity) {
        Class<?> activityClasslass = activity.getClass();
        Field[] fields = activityClasslass.getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(InjectView.class)){
                int  id =field.getAnnotation(InjectView.class).id();
                View view=activity.findViewById(id);
                field.setAccessible(true);
                try {
                    field.set(activity,view);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
