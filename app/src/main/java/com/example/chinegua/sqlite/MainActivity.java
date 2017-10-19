package com.example.chinegua.sqlite;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.chinegua.sqlite.models.EntityRepository;

public class MainActivity extends AppCompatActivity {

    EntityRepository db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        db = new EntityRepository(getApplicationContext());
        Log.i("MiW",Long.toString(db.count()));
    }
}
