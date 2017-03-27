package com.eric.logdemo.Utils;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * 共享参数的工具类
 * Created by Eric on 2017/3/27.
 */

public class SharedPreferencesUtil {

    //默认值
    private static String DEFAULT_STRING = "NULL";
    private static int DEFAULT_INT = -1;
    private static float DEFAULT_FLOAT = -1.0f;
    private static long DEFAULT_LONG = -2L;
    private static boolean DEFAULT_BOOLEAN = false;


    private static SharedPreferences sharedPreferences;
    private static SharedPreferences.Editor editor;

    public static void init(Context context) {
        sharedPreferences = context.getSharedPreferences("sharedConfig", Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
    }

    /**
     * 设置String
     *
     * @param key   值
     * @param value 参数
     */
    public static void putString(String key, String value) {
        editor.putString(key, value);
        editor.commit();
    }

    public static String getString(String key) {
        return sharedPreferences.getString(key, DEFAULT_STRING);
    }

    public static String getString(String key, String default_string) {
        return sharedPreferences.getString(key, default_string);
    }

    /**
     * 设置Int
     *
     * @param key   值
     * @param value 参数
     */
    public static void putInt(String key, int value) {
        editor.putInt(key, value);
        editor.commit();
    }

    public static int getInt(String key) {
        return sharedPreferences.getInt(key, DEFAULT_INT);
    }

    public static int getInt(String key, int default_int) {
        return sharedPreferences.getInt(key, default_int);
    }

    /**
     * 设置Float
     *
     * @param key   值
     * @param value 参数
     */
    public static void putFloat(String key, float value) {
        editor.putFloat(key, value);
        editor.commit();
    }

    public static float getFloat(String key) {
        return sharedPreferences.getFloat(key, DEFAULT_FLOAT);
    }

    public static float getFloat(String key, float default_float) {
        return sharedPreferences.getFloat(key, default_float);
    }

    /**
     * 设置Long
     *
     * @param key   值
     * @param value 参数
     */
    public static void putLong(String key, long value) {
        editor.putLong(key, value);
        editor.commit();
    }

    public static long getLong(String key) {
        return sharedPreferences.getLong(key, DEFAULT_LONG);
    }

    public static long getLong(String key, long default_long) {
        return sharedPreferences.getLong(key, default_long);
    }

    /**
     * 设置Boolean
     *
     * @param key   值
     * @param value 参数
     */
    public static void putBoolean(String key, boolean value) {
        editor.putBoolean(key, value);
        editor.commit();
    }

    public static boolean getBoolean(String key) {
        return sharedPreferences.getBoolean(key, DEFAULT_BOOLEAN);
    }

    public static boolean getBoolean(String key, boolean default_boolean) {
        return sharedPreferences.getBoolean(key, default_boolean);
    }
}
