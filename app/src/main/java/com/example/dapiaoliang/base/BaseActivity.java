package com.example.dapiaoliang.base;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.dapiaoliang.R;

public abstract class BaseActivity<P extends BasePresenter> extends AppCompatActivity implements BaseView{
    public P presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutID());

        if (presenter==null){
            presenter=add();
            presenter.attachView(this);
        }

        initView();
        initData();
    }

    protected abstract int getLayoutID();

    protected abstract P add();

    protected abstract void initData();

    protected abstract void initView();
}