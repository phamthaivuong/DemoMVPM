package com.example.phamthaivuong.demomvpm.Manager;

import com.example.phamthaivuong.demomvpm.Model.User;

import java.util.ArrayList;
import java.util.List;

public class UserManager {
    private static UserManager instance;

    private List<User> listUser;

    private UserManager() {
    }
    public static UserManager getInstance(){
        if (instance == null){
            instance = new UserManager();
        }
        return instance;
    }

    public void addUser(String userName, String passWord){
        if (listUser == null){
            listUser = new ArrayList<>();
        }
        listUser.add(new User(userName,passWord));
    }

    public boolean validInformation(String userName, String passWord){
        for (int i = 0 ; i<listUser.size();i++){
            if (listUser.get(i).getUserName().equals(userName) && listUser.get(i).getPassWord().equals(passWord)){
                return true;
            }
        }
        return false;
    }

}
