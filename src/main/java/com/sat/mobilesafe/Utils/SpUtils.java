package com.sat.mobilesafe.Utils;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by knight on 17-1-23.
 */

public class SpUtils {

    private static SharedPreferences sp;

    /**
     * 写入boolean变量至sp中
     * @param context   上下文
     * @param key       存储节点的名称
     * @param value     存储节点的值(Boolean)
     */
    public static void putBoolean(Context context,String key,boolean value){
        //存储节点文件的名称 ，读写方式
        if (sp == null) {
            sp = context.getSharedPreferences("config", Context.MODE_PRIVATE);
        }
        sp.edit().putBoolean(key,value).commit();
    }

    /**
     * 读取boolean变量从sp中
     * @param context       上下文
     * @param key           存储节点的名称
     * @param defValue      存储节点的默认值(Boolean)
     */
    public static boolean getBoolean(Context context,String key,boolean defValue){
        //存储节点文件的名称 ，读写方式
        if (sp == null) {
            sp = context.getSharedPreferences("config", Context.MODE_PRIVATE);
        }
        return sp.getBoolean(key,defValue);
    }

    public static void putString(Context context,String key,String value){
        //存储节点文件的名称 ，读写方式
        if (sp == null) {
            sp = context.getSharedPreferences("config", Context.MODE_PRIVATE);
        }
        String pwd = Md5.encoder(value);
        sp.edit().putString(key,pwd).commit();
    }

    /**
     * 读取boolean变量从sp中
     * @param context       上下文
     * @param key           存储节点的名称
     * @param defValue      存储节点的默认值(Boolean)
     */
    public static String getString(Context context,String key,String defValue){
        //存储节点文件的名称 ，读写方式
        if (sp == null) {
            sp = context.getSharedPreferences("config", Context.MODE_PRIVATE);
        }
        return sp.getString(key,defValue);
    }
}
