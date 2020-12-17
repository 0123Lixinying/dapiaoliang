package com.example.dapiaoliang;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

import com.example.dapiaoliang.R;
import com.example.dapiaoliang.base.BaseActivity;
import com.example.dapiaoliang.contract.MainContract;
import com.example.dapiaoliang.model.UserBean;
import com.example.dapiaoliang.presenter.MainPresenterImpl;


public class MainActivity extends BaseActivity<MainPresenterImpl> implements MainContract.IMainView {

    private EditText editTextTextPersonName;
    private EditText editTextTextPassword;
    @Override
    protected void initData() {
        presenter.login(getUserName(),getPassword());
    }
    @Override
    protected void initView() {
        editTextTextPersonName.findViewById(R.id.editTextTextPersonName);
        editTextTextPassword.findViewById(R.id.editTextTextPassword);

    };

    @Override
    protected int getLayoutID() { return R.layout.activity_main; }

    @Override
    public MainPresenterImpl add() {
        return new MainPresenterImpl(this);
    }

    /**
     * 登录按钮
     * @param view
     */
    public void loginButton(View view) {
        if(!TextUtils.isEmpty(getUserName()) && !TextUtils.isEmpty(getPassword())){

            presenter.login(getUserName(),getPassword());

        }
    }


    @Override
    public String getUserName() {
        return editTextTextPersonName.getText().toString();
    }

    @Override
    public String getPassword() {
        return editTextTextPassword.getText().toString();
    }

    @Override
    public void getData(UserBean string) {

        //网络请求返回

    }



}