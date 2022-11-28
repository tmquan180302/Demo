package vn.poly.demo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;

public abstract class BaseActivity extends AppCompatActivity {
    ProgressDialog dialog;
    Toolbar toolbar;

    public void showLoading(){
        if (dialog!= null){
            dialog.show();
        }
    }

    public void hideLoading(){
        if (dialog.isShowing()) dialog.hide();
    }

    public void navigateScreen (Class target){
        startActivity(new Intent(this,target));
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(setLayout());

        dialog = new ProgressDialog(this);
        dialog.setTitle("Loading...");

        showLoading();
        initLayout();

    }
    abstract int setLayout();

    abstract void initLayout();

    abstract void initAction();

}