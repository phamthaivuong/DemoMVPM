package com.example.phamthaivuong.demomvpm.View.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.phamthaivuong.demomvpm.Presenter.MyPresenter;
import com.example.phamthaivuong.demomvpm.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private MyPresenter myPresenter;
    private EditText edtUserName , edtPassWord;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        addEvents();



    }

    private void addEvents() {
        btnLogin.setOnClickListener(this);
    }


    private void initView() {
        myPresenter = new MyPresenter();
        myPresenter.setListener(new MyPresenter.OnCallBack() {
            @Override
            public void disableEditText() {
                edtUserName.setEnabled(false);
                edtPassWord.setEnabled(false);
            }
        });
        edtUserName = (EditText)findViewById(R.id.edt_username);
        edtPassWord = (EditText)findViewById(R.id.edt_password);
        btnLogin = (Button)findViewById(R.id.btn_login);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_login:
//                if (myPresenter.login(edtUserName.getText().toString(),edtPassWord.getText().toString())){
//                    Toast.makeText(this, "Login success ! ", Toast.LENGTH_SHORT).show();
//                    return;
//                }
//                Toast.makeText(this, "Invalid Infomation ! ", Toast.LENGTH_SHORT).show();


                myPresenter.login(edtUserName.getText().toString(),edtPassWord.getText().toString());
                break;
        }
    }
}
