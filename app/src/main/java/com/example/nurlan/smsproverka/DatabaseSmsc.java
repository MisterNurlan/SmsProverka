package com.example.nurlan.smsproverka;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nurlan on 08.07.2016.
 */
public class DatabaseSmsc extends SQLiteOpenHelper{
    public DatabaseSmsc(Context context) {super(context, "points", null, 1);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        Log.d("CreateDB", "создание базы данных");
        db.execSQL("create table Smsc (id integer primary key autoincrement, terminal_name text,  lat text , long text );");
// исправить данные базы данных
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

   /* public void addTerminal(Smsc smsc) {

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("terminal_name", smsc.getTextterminal());//  это и есть Textterminal
        cv.put("lat", smsc.getLatterminal());
        cv.put("long", smsc.getLongterminal());
        db.insert("Terminals", null, cv);
        Log.d("Add terminal", smsc.toString());
        db.close();
    }

    public List<Smsc> getAllTerminals() {

        List<Smsc> terminalList = new ArrayList<Smsc>();

        String selectQuery = "SELECT * FROM Terminals ORDER BY id DESC";
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);
        if (cursor.moveToFirst()) {
            do {
                Smsc terminal = new Terminal();
                terminal.setIdterminal(Integer.valueOf(cursor.getString(0)));
                terminal.setTextterminal(cursor.getString(1));//  это и есть terminal_name
                terminal.setLatterminal(cursor.getString(2));
                terminal.setLongterminal(cursor.getString(3));
                terminalList.add(terminal);
            } while (cursor.moveToNext());
        }
        db.close();
        return terminalList;
    }



    public void deletePOINTS() {

        Log.d(LOG_TAG, "Удаление таблицы newWebHistory ");
        SQLiteDatabase delet = this.getWritableDatabase();
        delet.execSQL("DROP TABLE findlocation");
        Log.d(LOG_TAG, "создание таблицы newWebHistory ");
        onCreate(delet);
        delet.close();

    }*/






}
