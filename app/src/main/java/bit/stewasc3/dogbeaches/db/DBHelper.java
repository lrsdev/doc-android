package bit.stewasc3.dogbeaches.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by sam on 10/08/15.
 */
public class DBHelper extends SQLiteOpenHelper
{
    private static final String DATABASE_NAME = "docdog.db";
    private static final int DATABASE_VERSION = 5;

    public DBHelper(Context context)
    {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase)
    {
        LocationsTable.onCreate(sqLiteDatabase);
        AnimalsTable.onCreate(sqLiteDatabase);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int newVersion, int oldVersion)
    {
        LocationsTable.onUpgrade(sqLiteDatabase, newVersion, oldVersion);
        AnimalsTable.onUpgrade(sqLiteDatabase, newVersion, oldVersion);
    }
}