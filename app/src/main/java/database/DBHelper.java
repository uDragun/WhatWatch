package database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import database.WatchListDB;
import static database.WatchListDB.CREATE_FILM_TABLE;



public class DBHelper extends SQLiteOpenHelper {

    public DBHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version){
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db){
        db.execSQL(CREATE_FILM_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldversion, int newVersion){
        /*Log.d("Film Table", "Upgrading db from version" + oldversion + " to " + newVersion);
        db.execSQL(WatchListDB.DROP_FILM_TABLE);
        onCreate(db);*/
    }

}
