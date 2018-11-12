package com.caveman.jetpackactualcombat.repository;

import android.app.Application;
import android.arch.lifecycle.LiveData;

import com.caveman.jetpackactualcombat.bean.Word;
import com.caveman.jetpackactualcombat.dao.WordDao;
import com.caveman.jetpackactualcombat.database.WordRoomDataBase;

import java.util.List;

/**
 * Created by Administrator on 2018/11/12.
 * <p>
 * Description:
 */
public class WordRepository {
    private WordDao mWordDao;
    private LiveData<List<Word>> mAllWords;

    public WordRepository(Application application){
        WordRoomDataBase db = WordRoomDataBase.getDatabase(application);
        mWordDao = db.wordDao();
        mAllWords = mWordDao.getAllWords();
    }

    public LiveData<List<Word>> getAllWords() {
        return mAllWords;
    }

    public void insert(Word word){

    }

}
