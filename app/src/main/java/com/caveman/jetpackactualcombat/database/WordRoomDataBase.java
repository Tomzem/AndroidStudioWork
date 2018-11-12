package com.caveman.jetpackactualcombat.database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import com.caveman.jetpackactualcombat.bean.Word;
import com.caveman.jetpackactualcombat.dao.WordDao;

/**
 * Created by Administrator on 2018/11/12.
 * <p>
 * Description:
 */
@Database(entities = {Word.class}, version = 1)
public abstract  class WordRoomDataBase extends RoomDatabase{

    public abstract WordDao wordDao();

    private static volatile WordRoomDataBase INSTANCE;

    public static WordRoomDataBase getDatabase(final Context context) {
        if (INSTANCE == null) {
            synchronized (WordRoomDataBase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            WordRoomDataBase.class, "word_database")
                            .build();
                }
            }
        }
        return INSTANCE;
    }

}
