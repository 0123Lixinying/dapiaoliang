package com.example.dapiaoliang.presenter;

import com.example.dapiaoliang.base.BasePresenter;
import com.example.dapiaoliang.contract.MainContract;
import com.example.dapiaoliang.model.MainModelImpl;
import com.example.dapiaoliang.model.UserBean;

public class MainPresenterImpl extends BasePresenter<MainContract.IMainView> implements MainContract.IMainPresenter{

    private MainContract.IMainModel mainModel;

    public MainPresenterImpl(MainContract.IMainModel mainModel){
        this.mainModel=new MainModelImpl(this);
    }
    @Override
    public void login(String name, String password) {

    }

    @Override
    public void loginResult(String result) {

    }
}
