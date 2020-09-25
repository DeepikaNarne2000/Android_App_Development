package com.example.viewmodel_livedata;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {
    MutableLiveData<Integer> count=new MutableLiveData<>();

    public MainViewModel() {
        Log.i("MainViewModel","ViewModel is created");
        count.setValue(0);
    }
    @Override
    protected void onCleared() {
        super.onCleared();
        Log.i("MainViewModel","ViewModel is Destroyed");
    }

    public void doIncrement(){
        //count++;
        count.setValue(count.getValue()+1);
    }
    public void doDecrement(){
        //count--;
        count.setValue(count.getValue()-1);
    }

}
