package com.rollup.launcher.myannotationdemo;

import android.support.annotation.IdRes;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <pre>
 *     author : LiJianZhuang
 *     time   : 2020/11/18
 *     desc   :
 *     version: 1.0
 * </pre>
 */

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface InjectView {
    public @IdRes int id();
}
