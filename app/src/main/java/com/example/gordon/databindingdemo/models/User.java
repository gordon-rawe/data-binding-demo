package com.example.gordon.databindingdemo.models;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.example.gordon.databindingdemo.BR;

/**
 * Created by gordon on 16/4/24.
 */
public class User extends BaseObservable {
    private String name;

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }
}
