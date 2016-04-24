package com.example.gordon.databindingdemo;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.gordon.databindingdemo.databinding.ActivityMainBinding;
import com.example.gordon.databindingdemo.models.User;

public class MainActivity extends AppCompatActivity {

    private User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        generateData();
        mainBinding.setUser(user);
        mainBinding.setHandler(new Handler());
    }

    public void generateData() {
        user = new User("gordon");
    }

    public class Handler {
        public void handleTextViewClick(View view) {
            Log.d("gordon", "show");
            Toast.makeText(MainActivity.this,String.valueOf(view.getId()),Toast.LENGTH_SHORT).show();
        }
    }
}
