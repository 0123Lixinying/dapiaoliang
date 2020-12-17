package com.example.dapiaoliang.model;

import com.example.dapiaoliang.contract.MainContract;

public class MainModelImpl implements MainContract.IMainModel {

    private MainContract.IMainPresenter presenter;

    public MainModelImpl(MainContract.IMainPresenter presenter){
        this.presenter=presenter;
    }
    @Override
    public <T> void getLoginData(String url, INetCallBack<T> callBack) {
        presenter.loginResult("登录成功了");

        RetrofitUtils.getInstance().get(url,callBack);
    }
}
