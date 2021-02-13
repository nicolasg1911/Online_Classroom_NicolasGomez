package model;

import java.util.ArrayList;
import java.util.List;

public class Classroom {

    private List<UserAccount> Accounts;

    public Classroom() {
        Accounts=new ArrayList<>();
    }

    public void addUserAccount(String user, String password, String photo, String gender, String career, String birthday, String browser) {
        UserAccount userAccount = new UserAccount(user, password,  photo,  gender,  career,  birthday,  browser);
        Accounts.add(userAccount);
    }

    public List<UserAccount> getAccounts(){
        return Accounts;
    }
}