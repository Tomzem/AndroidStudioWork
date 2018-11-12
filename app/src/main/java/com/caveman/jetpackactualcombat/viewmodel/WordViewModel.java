package com.caveman.jetpackactualcombat.viewmodel;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.support.annotation.NonNull;

import com.caveman.jetpackactualcombat.bean.Word;
import com.caveman.jetpackactualcombat.repository.WordRepository;

import java.util.List;

/**
 * Created by Administrator on 2018/11/12.
 * <p>
 * Description:
 */
public class WordViewModel extends AndroidViewModel{

    private WordRepository mWordRepository;
    private LiveData<List<Word>> mAllWords;

    public WordViewModel(@NonNull Application application) {
        super(application);
        mWordRepository = new WordRepository(application);
        mAllWords = mWordRepository.getAllWords();
    }

    public LiveData<List<Word>> getAllWords() {
        return mAllWords;
    }

    public void insert(Word word){
        mWordRepository.insert(word);
    }
}
