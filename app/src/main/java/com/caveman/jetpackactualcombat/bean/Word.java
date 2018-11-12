package com.caveman.jetpackactualcombat.bean;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

/**
 * Created by Administrator on 2018/11/12.
 * <p>
 * Description:
 */
@Entity(tableName = "table_word")
public class Word {

    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "WORD")
    private String word;

    public Word(@NonNull String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }
}
