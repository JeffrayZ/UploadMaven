package com.example.testmaven;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.uploadlibrary.UploadUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        UploadUtils.showToast(this,"我来自本地磁盘仓库");
    }
}
