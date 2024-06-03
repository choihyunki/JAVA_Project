package com.example.myapplication.ui.sooam;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SooamViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public SooamViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Sooam fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}