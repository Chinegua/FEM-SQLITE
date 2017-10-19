package com.example.chinegua.sqlite.models;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import static com.example.chinegua.sqlite.models.ClientContract.tablaClient;
/**
 * Created by chinegua on 19/10/17.
 */

public class EntityRepository extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = ClientContract.tablaClient.TABLE_NAME + ".db";

    public EntityRepository(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query =  "CREATE TABLE " + ClientContract.tablaClient.TABLE_NAME + " (" +
                ClientContract.tablaClient._ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                ClientContract.tablaClient.COL_NAME + " TEXT," +
                ClientContract.tablaClient.COL_DNI + " TEXT,"+
                ClientContract.tablaClient.COL_TELEFONO + " INTEGER,"+
                ClientContract.tablaClient.COL_EMAIL + " TEXT,"+
                ClientContract.tablaClient.COL_VERIFICADO + " INTEGER"
                + ")";
        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
