package com.caveman.jetpackactualcombat.dao;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.caveman.jetpackactualcombat.bean.Word;

import java.util.List;

/**
 * Created by Administrator on 2018/11/12.
 * <p>
 * Description:
 */
@Dao
public interface WordDao {

    @Insert
    void insert(Word word);

    @Query("delete from table_word")
    void deleteAll();

    @Query("select * from table_word order by word ASC")
    LiveData<List<Word>> getAllWords();

}
