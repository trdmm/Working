package com.sat.mobilesafe.Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Project:Working
 * Package:com.sat.mobilesafe.Database
 * Created by 姬岛朱乃 on 2017/10/22 at 16:51.
 */

public class DbOpenhelper extends SQLiteOpenHelper {
    public DbOpenhelper(Context context) {
        super(context, "blacknum.db", null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
