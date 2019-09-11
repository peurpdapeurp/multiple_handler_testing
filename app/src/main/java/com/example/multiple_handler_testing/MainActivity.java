package com.example.multiple_handler_testing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    Module1 module1;
    Module2 module2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        module1 = new Module1(getMainLooper());
        module2 = new Module2(getMainLooper());

        module1.triggerMessage();
        module2.triggerMessage();

    }
}
