/*package com.example.migue_000.jamaandroid20;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by migue_000 on 29/06/2016.
 */
/*public class JamaDataBaseHelper extends SQLiteOpenHelper {

    private static final String DB_NAME = "";
    private static final int DB_VERSION = 1;

    JamaDataBaseHelper(Context context){
        super(context,DB_NAME,null,DB_VERSION);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE USUARIO ( "
                + "_id INTEGER PRIMARY KEY AUTOINCREMENT, "
                + "USER TEXT, "
                + "CONTRASEÑA TEXT, "
                + "VALIDO NUMERIC);");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public static void insertUser(SQLiteDatabase db, String user, String password, boolean valido, int resourceId) {
        ContentValues userValues = new ContentValues();
        userValues.put("USER", user);
        userValues.put("CONTRASEÑA", password);
        userValues.put("VALIDO", valido);
        db.insert("USUARIO", null, userValues);
    }
}
*/