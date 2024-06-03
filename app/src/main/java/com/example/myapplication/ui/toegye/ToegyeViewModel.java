package com.example.myapplication.ui.toegye;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ToegyeViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public ToegyeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Toegye fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}