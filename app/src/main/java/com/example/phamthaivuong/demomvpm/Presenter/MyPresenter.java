package com.example.phamthaivuong.demomvpm.Presenter;

import com.example.phamthaivuong.demomvpm.Manager.UserManager;

public class MyPresenter {
    private OnCallBack listener;

    public void setListener(OnCallBack listener) {
        this.listener = listener;
    }

    public MyPresenter() {
        UserManager.getInstance().addUser("vuong","123456");
    }
//    public boolean login(String userName , String passWord){
//        return UserManager.getInstance().validInformation(userName,passWord);
//    }

    public void login(String userName , String passWord){
        if (UserManager.getInstance().validInformation(userName,passWord)){
            listener.disableEditText();
        }
    }

    public interface OnCallBack{
        void disableEditText();
    }
}
