package vn.poly.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    int setLayout() {
        return R.layout.activity_main;
    }

    // 
    @Override
    void initLayout() {

    }

    // Anh xa tham chieu
    @Override
    void initAction() {

    }
}