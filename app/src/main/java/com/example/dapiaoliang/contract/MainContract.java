package com.example.dapiaoliang.contract;

import com.example.dapiaoliang.base.BaseView;

public class MainContract {
    public interface IMainModel{
        <T> void getLoginData(String url,INetCallBack<T> callBack);
    }

    public interface IMainPresenter{
        void login(String name,String password);
        void loginResult(String result);
    }
    public interface IMainView extends BaseView{
        String getUserName();
        String getPassword();
        void getData(UserBean string);
    }
}
